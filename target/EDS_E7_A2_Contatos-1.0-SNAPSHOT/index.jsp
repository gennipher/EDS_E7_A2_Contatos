<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro de Contato</title>
    </head>
    <body>
        <h1>Cadastro de Contato</h1>
        <hr />
        <form>
            <table border="1" cellpadding="3" cellspacing="0">
                <tr>
                    <td>Nome:</td>
                    <td>
                        <input type="text" value="nome" />
                    </td>
                </tr>
                <tr>
                    <td>E-mail</td>
                    <td>
                        <input type="email" value="email" />
                    </td>
                </tr>
                <tr>
                    <td>Telefone:</td>
                    <td>
                        <input type="tel" value="fone" />
                    </td>
                </tr>
                <tr>
                    <td colspan="2"  >
                        <input type="submit" value="Cadastrar" width="-webkit-fill-available"  />
                    </td>
                </tr>
            </table>
        </form>
    </body>
</html>
