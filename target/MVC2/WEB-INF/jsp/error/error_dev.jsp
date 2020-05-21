<%--
  Created by IntelliJ IDEA.
  User: Juet
  Date: 2020. 5. 21.
  Time: 오후 2:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ERROR DEV PAGE</title>
</head>
<body>
    <div>
        <h1>ERROR OCCUR!!</h1>
    </div>
    <br/><br/><br/><br/><br/>
    <table>
        <thead>
            <tr>
                <td>code</td>
                <td>exception type</td>
                <td>message</td>
                <td>exception</td>
                <td>request uri</td>
                <td>servlet name</td>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>${requestScope['javax.servlet.error.status_code']}</td>
                <td>${requestScope['javax.servlet.error.exception_type']}</td>
                <td>${requestScope['javax.servlet.error.message']}</td>
                <td>${requestScope['javax.servlet.error.exception']}</td>
                <td>${requestScope['javax.servlet.error.request_uri']}</td>
                <td>${requestScope['javax.servlet.error.servlet_name']}</td>
            </tr>
        </tbody>
        <!-- 출처: https://mystarlight.tistory.com/123 [커피향처럼] -->
    </table>
</body>
</html>
