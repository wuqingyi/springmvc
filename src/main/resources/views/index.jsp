<%@page pageEncoding="GB2312" isELIgnored="false" %><!--���ñ��뷽ʽ������EL���ʽ-->
<html>
<head>
    <title>
        ��ҳ
    </title>
    <script src="/assets/js/jquery-3.3.1.min.js"></script>
    <script>
        function fclick() {
            $("#d1").hide();
        }
    </script>
</head>
<body>
<% System.out.println(""); %>
<div id="d1" style="background-color: aqua; height: 200px; width: 500px"></div>
<br>
<button onclick="fclick()" value="OK">OK</button>
<br>
<b>${msg}</b>
</body>
</html>
