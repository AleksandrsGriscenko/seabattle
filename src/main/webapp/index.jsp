<%--
  Created by IntelliJ IDEA.
  User: JavaCourses1
  Date: 25.01.2018.
  Time: 18:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome</title>
    <link rel="stylesheet" href="main.css">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <style>
        body {
            background-image: url("http://cdn02.nintendo-europe.com/media/images/10_share_images/games_15/nintendo_dsiware_8/SI_DSiWare_SeaBattle.jpg");
            background-size: cover;
        }

        .container .btn {
            position: absolute;
            top: 50%;
            left: 65%;
            transform: translate(-50%, -50%);
            -ms-transform: translate(-50%, -50%);
            background-color: #808080;
            color: darkred;
            font-size: 16px;
            padding: 16px 30px;
            border: none;
            cursor: pointer;
            border-radius: 5px;
            text-align: center;
        }

        .button span {
            cursor: pointer;
            display: inline-block;
            position: relative;
            transition: 0.5s;
        }

        .container .btn:hover {
            background-color: red;
            color: white;
        }
    </style>
</head>
<body>

<div class="container">

    <a class="btn" href="register" > Start the Game!

</div>


</body>
</html>
