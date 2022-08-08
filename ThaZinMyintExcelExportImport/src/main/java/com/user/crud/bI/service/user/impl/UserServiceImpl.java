package com.user.crud.bI.service.user.impl;

import java.io.IOException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.user.crud.bI.service.user.UserService;
import com.user.crud.presistence.dao.user.UserDao;
import com.user.crud.presistence.entity.User;
import com.user.crud.web.form.UserForm;

/**
 * <h2>UserServiceImpl Class</h2>
 * <p>
 * Process for Displaying UserServiceImpl
 * </p>
 * 
 * @author ThaZinMyint
 *
 */
@Transactional
@Service
public class UserServiceImpl implements UserService {
    /**
     * <h2>userDao</h2>
     * <p>
     * userDao
     * </p>
     */
    @Autowired
    private UserDao userDao;

    /**
     * <h2>getUserList</h2>
     * <p>
     * 
     * </p>
     * 
     * @return
     */
    @Override
    @Transactional
    public List<User> getUserList() {
        return userDao.getUserList();
    }

    /**
     * <h2>addUser</h2>
     * <p>
     * 
     * </p>
     * 
     * @param userForm
     */
    @Override
    @Transactional
    public void addUser(UserForm userForm) {
        User user = new User(userForm);
        this.userDao.addUser(user);
    }

    /**
     * <h2>getUser</h2>
     * <p>
     * 
     * </p>
     * 
     * @param userID
     * @return
     */
    @Override
    @Transactional
    public UserForm getUser(int userID) {
        User resultPost = this.userDao.getUser(userID);
        UserForm resultPostform = resultPost != null ? new UserForm(resultPost) : null;
        return resultPostform;
    }

    /**
     * <h2>deleteUser</h2>
     * <p>
     * 
     * </p>
     * 
     * @param userId
     */
    @Override
    @Transactional
    public void deleteUser(Integer userId) {
        userDao.deleteUser(userId);
    }

    /**
     * <h2>updateUser</h2>
     * <p>
     * 
     * </p>
     * 
     * @param userForm
     */
    @Override
    public void updateUser(UserForm userForm) {
        User updateUser = this.userDao.getUser(userForm.getId());
        updateUser.setName(userForm.getName());
        updateUser.setEmail(userForm.getEmail());
        updateUser.setAddress(userForm.getAddress());
        this.userDao.updateUser(updateUser);
    }

    /**
     * <h2>saveDb</h2>
     * <p>
     * 
     * </p>
     * 
     * @param file
     * @return
     * @throws EncryptedDocumentException
     * @throws InvalidFormatException
     * @throws IOException
     * @throws org.apache.poi.openxml4j.exceptions.InvalidFormatException
     */
    @Override
    public String saveDb(MultipartFile file) throws EncryptedDocumentException, InvalidFormatException, IOException,
            org.apache.poi.openxml4j.exceptions.InvalidFormatException {

        try {

            Workbook workbook = WorkbookFactory.create(file.getInputStream());
            Sheet sheet = workbook.getSheetAt(0);
            Iterator<Row> rows = sheet.iterator();
            List<User> userList = new ArrayList<User>();
            int rowNumber = 0;
            while (rows.hasNext()) {
                Row currentRow = rows.next();
                if (rowNumber == 0) {
                    rowNumber++;
                    continue;
                }
                Iterator<Cell> cellsInRow = currentRow.iterator();
                User u = new User();
                int cellIndex = 0;
                while (cellsInRow.hasNext()) {
                    Cell currentCell = cellsInRow.next();
                    switch (cellIndex) {
                    case 0:
                        u.setId(currentCell.getCellType());
                        break;
                    case 1:
                        u.setName(currentCell.getStringCellValue());
                        break;
                    case 2:
                        u.setEmail(currentCell.getStringCellValue());
                        break;
                    case 3:
                        u.setAddress(currentCell.getStringCellValue());
                        break;
                    default:
                        break;
                    }
                    cellIndex++;
                }
                userList.add(u);
            }
            workbook.close();
            for (User userData : userList) {
                this.userDao.addUser(userData);
            }
        } catch (IOException e) {
            throw new RuntimeException("fail to parse Excel file :" + e.getMessage());
        }
        return null;
    }

}