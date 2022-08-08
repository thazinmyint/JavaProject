<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<div class="content-wrapper">
  <section class="content">
    <div class="row">
      <div class="col-12">
        <div class="forms-mr">
          <div class="col-sm-6 col-md-6 form-detail">
            <c:url var="createUser" value="/insertUser"></c:url>
            <form:form class="form-detail" action="insertUser"
              method="POST" id="form" modelAttribute="rollBackUserForm">
              <div class="card card-primary card-outline">
                <div class="card-body box-profile">
                  <h4 class="text-center forms-header">
                    <b>User Create</b>
                  </h4>
                  <c:if test="${errorMsg != null }">
                    <div class="alert alert-danger">
                      <strong>${errorMsg }</strong>
                    </div>
                  </c:if>
                  <div class="form-group">
                    <label for="name">Name</label>
                    <form:input path="name"
                      value="${rollBackUserForm.name }"
                      class="form-control" placeholder="Enter Name" />
                    <form:errors path="name" class="text-danger" />
                  </div>
                  <div class="form-group">
                    <label for="email">Email</label>
                    <form:input path="email"
                      value="${rollBackUserForm.email }"
                      class="form-control" placeholder="Enter Email" />
                    <form:errors path="email" class="text-danger" />
                  </div>
                  <div class="form-group">
                    <label for="address">Address</label>
                    <form:input path="address"
                      value="${rollBackUserForm.address }"
                      class="form-control" placeholder="Enter Address" />
                    <form:errors path="address" class="text-danger" />
                  </div>
                  <button type="submit" class="btn btn-info"
                    name="addUser">Create</button>
                  <button type="reset" class="btn btn-secondary"
                    name="clear">Reset</button>
                </div>
              </div>
            </form:form>
          </div>
        </div>
      </div>
    </div>
  </section>
</div>