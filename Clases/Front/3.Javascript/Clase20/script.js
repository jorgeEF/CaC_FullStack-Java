// obtener el formulario
const formulario = document.getElementById('formulario')

// capturamos de evento submit para validar los campos
formulario.addEventListener('submit', evento => {
    // detener envio hasta validar
    evento.preventDefault();
    // validar campos y enviar
    if(validarFormulario()){
        formulario.submit();
    }
})

// funcion para mostrar un mensaje de error al no completar campo
function mostrarError(campo, mensaje){
    const campoError = document.getElementById(`${campo}-error`);
    campoError.innerText = mensaje;
}

// funcion para validar email usando regex
function validarEmail(email){
    const regex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    return regex.test(email)
}

// funcion para validar datos de campos
function validarFormulario() {
    // obtener valores de los campos
    const nombre = document.getElementById('nombre').value
    const email = document.getElementById('email').value
    const telefono = document.getElementById('telefono').value

    // validar cada campo
    if(nombre === ''){
        mostrarError('nombre','Por favor ingresa tu nombre')
        return false;
    }
    if(email === ''){
        mostrarError('email','Por favor ingresa tu nombre')
        return false;
    }
    if(!validarEmail(email)){
        mostrarError('email','Por favor ingresa un email válido')
        return false;
    }
    if(telefono === ''){
        mostrarError('telefono','Por favor ingresa tu nombre')
        return false;
    }

    return true;


}