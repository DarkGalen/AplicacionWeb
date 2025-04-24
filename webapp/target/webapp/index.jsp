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

        <br>

        <!-- Listar usuarios eliminados -->
        <h4>Listar usuarios eliminados</h4>
        <form action="listarUsuariosEliminados" method="get">
            <input type="submit" value="Listar Usuarios Eliminados">
        </form>

        <br>

        <!-- Listar mensajes -->
        <h4>Listar mensajes</h4>
        <form action="listarMensajes" method="get">
            <input type="submit" value="Listar Mensajes">
        </form>

        <br>

        <!-- Listar calificaciones -->
        <h4>Listar calificaciones</h4>
        <form action="listarCalificaciones" method="get">
            <input type="submit" value="Listar Calificaciones">
        </form>

        <!-- ==================== MÉTODO POST ==================== -->
        <h3>Consultas por método POST</h3>

        <!-- Calificar usuario -->
        <h4>Calificar usuario</h4>
        <form action="calificarUsuario" method="post">
            <label>Id del usuario que califica:</label>
            <input type="number" name="idCalificador" required>
            <label>Id del usuario calificado:</label>
            <input type="number" name="idCalificado" required>
            <label>Calificación (1-5):</label>
            <input type="number" name="calificacion" min="1" max="5" required>
            <label>Comentario:</label>
            <textarea name="comentario" required></textarea>
            <input type="submit" value="Calificar Usuario">
        </form><br>

        <!-- Enviar mensaje -->
        <h4>Enviar mensaje</h4>
        <form action="enviarMensaje" method="post">
            <label>Id del remitente:</label>
            <input type="number" name="idRemitente" required>
            <label>Id del destinatario:</label>
            <input type="number" name="idDestinatario" required>
            <label>Mensaje:</label>
            <textarea name="mensaje" required></textarea>
            <input type="submit" value="Enviar Mensaje">
        </form><br>

        <!-- Filtrar mensajes por id -->
        <h4>Filtrar mensajes por id</h4>
        <form action="filtrarMensajesPorId" method="post">
            <label>Id del destinatario o remitente:</label>
            <input type="number" name="id" required>
            <input type="submit" value="Filtrar Mensaje por ID">
        </form><br>

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