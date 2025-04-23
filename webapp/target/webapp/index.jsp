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

        <!-- Añadir nuevo usuario -->
         <h3>Añadir nuevo usuario</h3>
        <form action="agregaUsuario" method="post">
            <label>Nombre de usuario:</label>
            <input type="text" name="nombre" required>
            <label>Apellido de usuario:</label>
            <input type="text" name="apellidos" required>
            <label>Correo electrónico:</label>
            <input type="email" name="correoElectronico" required>
            <label>Contraseña:</label>
            <input type="password" name="contrasenya" required>
            <label>Número de Teléfono:</label>
            <input type="tel" name="numeroTelefono" required>
            <label>Foto de Perfil (URL):</label>
            <input type="url" name="fotoPerfil" required>
            <label>Géneros Preferidos:</label>
            <label><input type="checkbox" name="generosPreferidos[]" value="ACCION"> ACCION</label>
            <label><input type="checkbox" name="generosPreferidos[]" value="AVENTURAS"> AVENTURAS</label>
            <label><input type="checkbox" name="generosPreferidos[]" value="TERROR"> TERROR</label>
            <label><input type="checkbox" name="generosPreferidos[]" value="ROMANCE"> ROMANCE</label>
            <label><input type="checkbox" name="generosPreferidos[]" value="FANTASIA"> FANTASIA</label>
            <label><input type="checkbox" name="generosPreferidos[]" value="CIENCIA_FICCION"> CIENCIA_FICCION</label>
            <label><input type="checkbox" name="generosPreferidos[]" value="HISTORIA"> HISTORIA</label>
            <label><input type="checkbox" name="generosPreferidos[]" value="OTROS"> OTROS</label>
            <label>Libros en Venta (IDs):</label>
            <input type="text" name="librosEnVenta" placeholder="Separar por comas" required>
            <label>Método de Autenticación:</label>
            <label><input type="radio" name="metodoAutenticacion" value="CONTRASENYA"> CONTRASENYA</label>
            <label><input type="radio" name="metodoAutenticacion" value="GOOGLE_OAUTH"> GOOGLE_OAUTH</label>
            <br><br>
            <input type="submit" value="Agregar Usuario">
        </form>

        <br><br>
        <p>Los resultados aparecerán en pantalla en formato JSON directamente desde el servidor.</p>
    </body>
    </html>