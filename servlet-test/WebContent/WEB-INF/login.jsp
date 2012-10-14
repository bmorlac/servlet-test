<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.Date"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
<style>
.error {
  color: red;
}
</style>
</head>
<body>

  <h1>Login Page</h1>
  <p>
    Es ist jetzt
    <fmt:formatDate type="time" timeStyle="full" value="<%=new Date()%>" />
  </p>
  <form action="" method="post">
    <p>
      <label for="username">Username:</label><input type="text" id="username" name="username" value="${fn:escapeXml(param.username)}" /> <span class="error">${errors.username}</span>
    </p>
    <p>
      <label for="password">Password:</label><input type="password" name="password" /> <span class="error">${errors.password}</span>
    </p>
    <input type="submit" value="Login" />
  </form>

</body>
</html>