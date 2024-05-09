const boton1 = document.getElementById('boton1')

const saludar = () => {
    alert("Hola");
}

boton1.addEventListener('click', saludar)

const contadorElement = document.getElementById('contador');
const sumarBtn = document.getElementById('sumarBtn');
const restarBtn = document.getElementById('restarBtn');
const resetBtn = document.getElementById('resetBtn');
let contador = 0;

function sumar() {
    contador++;
    actualizarContador()
}

function restar() {
    contador--;
    actualizarContador()
}

function reset() {
    contador = 0;
    actualizarContador()
}

function actualizarContador() {
    contadorElement.textContent = contador;
}

sumarBtn.addEventListener('click', sumar);
restarBtn.addEventListener('click', restar);
resetBtn.addEventListener('click', reset);

