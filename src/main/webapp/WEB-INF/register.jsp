<%--
  Created by IntelliJ IDEA.
  User: JavaCourses1
  Date: 25.01.2018.
  Time: 18:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="main.css">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <style>
    body {
    background-image: url("http://cdn02.nintendo-europe.com/media/images/10_share_images/games_15/nintendo_dsiware_8/SI_DSiWare_SeaBattle.jpg");
    background-size: cover;
    }

    div.absolute {
        position: absolute;
        top: 50%;
        left: 65%;
        width: 200px;
        height: 100px;
        border: 0px;
    }

    </style>
    <title>Register the Sea battle</title>


</head>
<body>


<form action="register" method="post">
    <div class="absolute">Enter your name:
    <input type="text" name="player-name">
    <input class="btn" type="submit" name="register" value="Start!">
    </div>
</form>

</body>
</html>
