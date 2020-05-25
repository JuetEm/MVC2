<%--
  Created by IntelliJ IDEA.
  User: Juet
  Date: 2020. 5. 21.
  Time: 오전 10:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>LogIn</title>
    <script src="/resources/jquery/jquery-3.5.1.js"></script>
    <script src="/resources/js/logIn.js"></script>
    <script type="text/javascript">
            $(document).ready(function(){
                clickControl();
            });
    </script>
</head>
<body>
    <%@ include file="../common/bootStrap.jsp"%>
    <div class="container">
        <h1>This Is Login Page!!</h1>

        <br/><br/>
        <p class="lead">이것이 바로 말로만 듣던 로그인 화면입니다!</p>
        <br/>
        <br/>
        <br/>
        <br/>
        
        <!--
        <div>
        <table class="table table-hover">
            <thead>
                <tr>
                    <td>Addr</td>
                    <td>URI</td>
                    <td>SessionID</td>
                    <td>Host</td>
                    <td>User</td>
                    <td>Port</td>
                    <td>Auto Deploy Test</td>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>${Addr}</td>
                    <td>${URI}</td>
                    <td>${SessionId}</td>
                    <td>${Host}</td>
                    <td>${User}</td>
                    <td>${Port}</td>
                    <td>${test}</td>
                </tr>
            </tbody>
        </table>
        </div>
        -->
        <form>
            <div class="form-group">
                <label for="emailInput">Email Address</label>
                <input type="email" class="form-control" id="emailInput" placeholder="Email"/>
            </div>
            <div class="form-group">
                <label for="passwdInput">Password</label>
                <input type="password" class="form-control" id="passwdInput" placeholder="Password"/>
            </div>
            <div class="checkbox">
                <label>
                    <input type="checkbox"> Remember Email & Password
                </label>
            </div>
            <div>
                <input type="submit" value="SIGNIN" id="signInBtn" class="btn-default sgnBtn"/>
            </div>
            <div>
                <input type="submit" value="SIGNUP" id="signUpBtn" class="btn-default sgnBtn"/>
            </div>
        </form>
    </div>
</body>
</html>
