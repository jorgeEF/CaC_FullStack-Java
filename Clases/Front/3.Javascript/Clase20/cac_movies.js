// todo se ejecuta cuando el DOM se carga completamente
document.addEventListener('DOMContentLoaded', () => {
    // selecciona el formulario del DOM
    const formulario = document.querySelector('form');

    // funcion mostrarError
    const input = document.querySelector('#password')
    const mensaje = "campo obligatorio"

    const mostrarError = (input,mensaje)=>{
        // accedemos al div
        const divPadre = input.parentNode;
        // encuentra el elemento error-text
        const errorText = divPadre.querySelector('.error-text');
        // agrega la clase de error al elemento padre
        divPadre.classList.add('error');
        // agregamos mensaje de error        
        errorText.innerText = mensaje;
    }

    mostrarError(input,mensaje);

    // funciona eliminar mensaje error
    const eliminarError = input => {
        const divPadre = input.parentNode;
        // eliminar clase de error del elemento padre
        divPadre.classList.remove('error');
        // encuentra el elemento error-text
        const errorText = divPadre.querySelector('.error-text')
        // quitamos el mensaje de error
        errorText.innerText = '';
    }

    //eliminarError(input)
})