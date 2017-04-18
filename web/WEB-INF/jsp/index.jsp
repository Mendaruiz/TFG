<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
    </head>

    <body>
        <p>Hello! This is the default welcome page for a Spring Web MVC project.</p>
        <p><i>To display a different welcome page for this project, modify</i>
            <tt>index.jsp</tt> <i>, or create your own welcome page then change
                the redirection in</i> <tt>redirect.jsp</tt> <i>to point to the new
                welcome page and also update the welcome-file setting in</i>
            <tt>web.xml</tt>.</p>
        

        <p>Prueba</p>
        <%--Para que el formulario permita el envio del fichero se incluye dentro del form enctype="multipart/form-data" --%>
        <form id="formulario" action="formulario" method="post" enctype="multipart/form-data">
            <fieldset>
                <legend>Introduzca el Archivo</legend>
                    <label>Archivo </label>
                        <input id="campo0" type="file" name="fich"  required>
                        <br>
                    <label>Origen</label>
                        <input id="campo1" name="origen" type="text" required/>
                        <br>
                    <label>Destino</label>
                        <input id="campo2" name="destino" type="text" required/>
                    
                        <br>
                    <input id="campo3" name="enviar" type="submit" value="Enviar" required/>
                    
            </fieldset>
        </form> 
        
        <a href="prueba.jsp">pasar pagina</a>
    </body>
</html>
