<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Halaman Login</title>
        <link href="config/style.css" rel="stylesheet" type="text/css" /><link href="config/style.css" rel="stylesheet" type="text/css" />
        <style type="text/css">
            html, body {
                width: 60%;
            }
            table{
                margin: 50%;
            }
            h1{
                text-align: center;
            }
        </style>
    </head>
    <body>
        <h1>Login</h1>
        <form method="post" action="Login?proses=login">
            <table border="3" width="30%" cellpadding="3">
                <thead>
                    <tr>
                        <th colspan="2">Login Aplikasi</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Username</td>
                        <td><input type="text" name="username"/></td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td><input type="password" name="password"/></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Login"/></td>
                        <td><input type="reset" value="Reset"/></td>
                    </tr>
                </tbody>
            </table>
        </form>
    </body>
</html>