<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; utf-8">
<meta name="viewport" content="initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="../css/jquery.mobile-1.4.5.min.css">
<script src="../js/jquery.min.js"></script>
<script src="../js/jquery.mobile-1.4.5.min.js"></script>
</head>
<body>

<div data-role="page">
  <div data-role="header">
  <h1>文本输入</h1>
  </div>

  <div data-role="content">
    <form method="post" action="demoform.asp">
      <div data-role="fieldcontain">
        <label for="fullname">全名：</label>
        <input type="text" name="fullname" id="fullname">       
        <label for="bday">生日：</label>
        <input type="date" name="bday" id="bday">
        <label for="email">电邮：</label>
        <input type="email" name="email" id="email" placeholder="您的邮箱地址..">
      </div>
      <input type="submit" data-inline="true" value="提交">
    </form>
  </div>
</div>

</body>
</html>
