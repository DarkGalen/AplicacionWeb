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

        <!-- Listar librerias -->
        <h4>Listar librerías</h4>
        <form action="listarLibrerias" method="get">
            <input type="submit" value="Listar Librerías">
        </form>

        <br>

        <!-- Listar ventas -->
        <h4>Listar ventas</h4>
        <form action="listarVentas" method="get">
            <input type="submit" value="Listar Ventas">
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

        <!-- Añadir venta -->
        <h4>Añadir venta</h4>
        <form action="agregarVenta" method="post">
            <label>ID de la transacción:</label>
            <input type="number" name="idTransaccion" required>
            <label>ID del comprador:</label>
            <input type="number" name="idComprador" required>
            <label>ID del vendedor:</label>
            <input type="number" name="idVendedor" required>
            <label>ID del libro vendido:</label>
            <input type="number" name="idLibroVendido" required>
            <label>Precio de venta:</label>
            <input type="number" name="precioVenta" step="0.1" required>
            <label>Fecha de venta:</label>
            <input type="date" name="fechaVenta" required>
            <input type="submit" value="Agregar Venta">
        </form><br>

        <!-- Añadir libro -->
        <h4>Añadir libro</h4>
        <form action="agregarLibro" method="post">
            <label>ID del usuario</label>
            <input type="number" name="idUsuario" required>
            <label>ID del libro:</label>
            <input type="number" name="idLibro" required>
            <label>Título del libro:</label>
            <input type="text" name="titulo" required>
            <label>Autor del libro:</label>
            <input type="text" name="autor" required>
            <label>Sinopsis del libro:</label>
            <textarea name="sinopsis" required></textarea>
            <label>Género del libro:</label>
            <select name="genero" required>
                <option value="ACCION">Acción</option>
                <option value="AVENTURA">Aventura</option>
                <option value="TERROR">Terror</option>
                <option value="ROMANCE">Romance</option>
                <option value="FANTASIA">Fantasía</option>
                <option value="CIENCIA_FICCION">Ciencia Ficción</option>
                <option value="HISTORIA">Historia</option>
                <option value="OTROS">Otros</option>
            </select>
            <label>Precio del libro:</label>
            <input type="number" name="precio" step="0.1" required>
            <label>Estado del libro:</label>
            <select name="estado" required>
                <option value="NUEVO">Nuevo</option>
                <option value="USADO">Usado</option>
            </select>
            <label>Imagen 1 (URL):</label>
            <input type="url" name="imagenUno" required>
            <label>Imagen 2 (URL):</label>
            <input type="url" name="imagenDos">
            <label>Fecha de publicación:</label>
            <input type="date" name="fechaPublicacion" required>
            <input type="submit" value="Agregar Libro">
        </form><br>

        <!-- Añadir libreria -->
        <h4>Añadir librería</h4>
        <form action="agregarLibreria" method="post">
            <label>Nombre de la librería:</label>
            <input type="text" name="nombre" required>
            <label>Correo electrónico:</label>
            <input type="email" name="correoElectronico" required>
            <label>Ubicación de la librería:</label>
            <input type="text" name="ubicacion" required>
            <label>URL del sitio web:</label>
            <input type="url" name="urlSitioWeb" required>
            <label>Catálogo de libros (IDs separados por comas):</label>
            <input type="text" name="catalogoLibros" placeholder="Ejemplo: 1,2,3" required>
            <input type="submit" value="Agregar Librería">
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