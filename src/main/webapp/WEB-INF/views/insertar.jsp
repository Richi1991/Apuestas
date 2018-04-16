<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Insertar Cuotas</title>
    </head>
    <body style="background-color: #cce4f4">
        <fieldset style="background-color: #4a5173">
            
            <legend style="background-color: whitesmoke">Inserte sus cuotas</legend>
            <form action="EjecutarInsertar" method="POST" >
                <table>
                    <tr>
                        <td>
                            <font color="#FFFFFF">Cuota 1:</font>
                            <label for="cuota1"></label>
                        </td>
                        <td>
                            <input name="cuota1" type="number" min="1" step="0.01" numberonly="true" required="true"/>
                        </td>
                    </tr>
                    <tr>
                        <td center>
                            <font color="#FFFFFF">Cuota 2:</font>
                            <label for="cuota2"></label>
                        </td>
                        <td>
                            <input name="cuota2" type="number" min="1" step="0.01" numberonly="true" required="true"/>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <font color="#FFFFFF">Cuota 3:</font>
                            <label for="cuota3"></label>
                        </td>
                        <td>
                            <input name="cuota3" type="number" min="1" step="0.01" numberonly="true" required="true"/>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <font color="#FFFFFF">Cuota 4:</font>
                            <label for="cuota4"></label>
                        </td>
                        <td>
                            <input name="cuota4" type="number" min="1" step="0.01" numberonly="true" required="true"/>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            <button type="submit">Insertar</button><br/>
                            <button type="reset">Limpiar</button><br/>
                        </td>
                    </tr>
                </table>
            </form>
        </fieldset>

        <fieldset style="background-color: #00cccc ">
            <legend style="background-color: whitesmoke">Cantidad a apostar</legend>
            <tr>
                <td>
                    <label for="importe">Importe</label>
                </td>
                <td>
                    <input name="importe" type="number" min="0" step="0.1"/>
                </td>
                <td>
                    <button type="submit">Calcular</button>    
                </td>
            </tr>
        </fieldset>
        </br>
        <a href="Inicio" style="background-color: #0099cc">volver</a> 
    </body>
</html>
