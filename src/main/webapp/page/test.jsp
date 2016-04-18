<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; utf-8">
<meta name="viewport" content="initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
<link rel="stylesheet" type="text/css" href="../css/jquery.mobile.flatui.css" />
<script src="../js/jquery.min.js"></script>
<script src="../js/jquery.mobile-1.4.5.min.js"></script>
</head>
<body>
<div data-role="page">
<div data-role="header" data-theme="b">
<h1>登录</h1>
</div>

<div data-role="content">
  <form method="post" action="demoform.asp">
    <div data-role="content" role="main">
      <input type="text" name="fullname" id="fullname" data-theme="b" placeholder="账户名/手机号/Email" />
      <input type="password" name="password" id="password" data-theme="b" placeholder="密码" />
    </div>
    <div data-role="content" role="main">
    <fieldset class="ui-grid-a">
        <button data-theme="b">登录</button>
    </fieldset>
    </div>
  </form>
</div>
</div>
</body>
</html>