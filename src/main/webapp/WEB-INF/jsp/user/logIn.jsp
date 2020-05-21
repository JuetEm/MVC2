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
    <script type="text/javascript">
        $(document).ready(function(){
            $(".sgnBtn").click(function(){
                alert("jQuery is working!! 동적 반영 되냐!????\r\n" +
                    this.getAttribute("id")+" 버튼 울린다!1111");
            });
        });

    </script>
</head>
<body>
    This Is Login Page!!

    <br/><br/>
    이것이 바로 말로만 듣던 로그인 화면입니다!
    <br/>
    <br/>
    <br/>
    <br/>
    <div>
    <table>
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
    <div>
        <div>
            <input type="text"/>
            <input type="password"/>
        </div>
        <div>
            <input type="button" value="SIGNIN" id="signInBtn" class="sgnBtn"/>
        </div>
    </div>
    <div>
        <input type="button" value="SIGNUP" id="signUpBtn" class="sgnBtn"/>
    </div>
</body>
</html>
