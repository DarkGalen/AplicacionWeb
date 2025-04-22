<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="UTF-8">
        <title>Gestión de Ventas</title>
    </head>

    <body>
        <h2>Bienvenidos a la página de Gestión de Ventas PVO</h2>

        <!-- ==================== MÉTODO GET ==================== -->
        <h3> Consultas por método GET</h3>

        <!-- ==================== MÉTODO POST ==================== -->
        <h3>Consultas por método POST</h3>

        <!-- Filtrar usuarios por nombre -->
        <form action="filtrarUsuariosPorNombre" method="post">
            <label>Nombre de usuario:</label>
            <input type="text" name="nombre" required>
            <input type="submit" value="Filtrar Usuarios por Nombre">
        </form>

        <br><br>
        <p>Los resultados aparecerán en pantalla en formato JSON directamente desde el servidor.</p>
    </body>
    </html>