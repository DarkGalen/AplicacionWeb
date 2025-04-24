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

        <!-- Listar libros -->
        <h4>Listar libros</h4>
        <form action="listarLibros" method="get">
            <input type="submit" value="Listar Libros">
        </form>

        <br>

        <!-- Listar usuarios -->
        <h4>Listar usuarios</h4>
        <form action="listarUsuarios" method="get">
            <input type="submit" value="Listar Usuarios">
        </form>

        <!-- ==================== MÉTODO POST ==================== -->
        <h3>Consultas por método POST</h3>

        <!-- Iniciar sesión -->
        <h4>Iniciar sesión</h4>
        <form action="iniciarSesion" method="post">
            <label>Correo electrónico:</label>
            <input type="text" name="correoElectronico" required>
            <label>Contraseña:</label>
            <input type="password" name="contrasenya" required>
            <input type="submit" value="Iniciar Sesión">
        </form><br>

        <!-- Filtrar usuarios por nombre -->
        <h4>Filtrar usuarios por nombre</h4>
        <form action="filtrarUsuariosPorNombre" method="post">
            <label>Nombre de usuario:</label>
            <input type="text" name="nombre" required>
            <input type="submit" value="Filtrar Usuarios por Nombre">
        </form><br>

        <!-- Eliminar usuario -->
        <h4>Eliminar usuario</h4>
        <form action="eliminarUsuario" method="post">
            <label>Correo del usuario:</label>
            <input type="text" name="correoElectronico" required>
            <label>Motivo:</label>
            <select name="motivo" required>
                <option value="VOLUNTARIA">Voluntaria</option>
                <option value="INFRACCION">Infracción</option>
            </select>
            <input type="submit" value="Eliminar Usuario">
        </form><br>

        <!-- Añadir nuevo usuario -->
        <h4>Añadir nuevo usuario</h4>
        <form action="agregaUsuario" method="post">
            <label>ID de usuario:</label>
            <input type="text" name="idUsuario" required>
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
            <input type="text" name="librosEnVenta" placeholder="Separar por comas">
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