const formularioLogin = document.getElementById("formLogin");

if (formularioLogin) {
    formularioLogin.addEventListener("submit", function (evento) {
        evento.preventDefault();

        const correo = document.getElementById("correo").value.trim();
        const contrasena = document.getElementById("contrasena").value.trim();
        const mensaje = document.getElementById("mensajeLogin");

        if (correo !== "" && contrasena.length >= 4) {
            mensaje.textContent = "Datos recibidos correctamente. Acceso de demostración.";
        } else {
            mensaje.textContent = "Verifica el correo y la contraseña.";
        }
    });
}

const formularioPedido = document.getElementById("formPedido");

if (formularioPedido) {
    formularioPedido.addEventListener("submit", function (evento) {
        evento.preventDefault();

        const cliente = document.getElementById("cliente").value.trim();
        const producto = document.getElementById("producto").value;
        const cantidad = Number(document.getElementById("cantidad").value);
        const mensaje = document.getElementById("mensajePedido");

        if (cliente !== "" && producto !== "" && cantidad > 0) {
            mensaje.textContent = `Pedido registrado: ${cantidad} unidad(es) de ${producto} para ${cliente}.`;
            formularioPedido.reset();
        } else {
            mensaje.textContent = "Completa todos los datos y usa una cantidad mayor que cero.";
        }
    });
}
