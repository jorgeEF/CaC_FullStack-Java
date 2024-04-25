// Operadores de Asignación:
let x = 10; // Asignación simple
x += 5;    // Asignación con suma (x ahora es 15) (x = x + 5)
x -= 3;    // Asignación con resta (x ahora es 12)
x *= 2;    // Asignación con multiplicación (x ahora es 24)
x /= 4;    // Asignación con división (x ahora es 6)

// Operadores de Comparación:
let edad = 25;
let esAdulto = edad >= 18; // Mayor o igual (esAdulto es true)
let esMenor = edad <= 18;   // Menor que (esMenor es false)
let esIgual = edad === "25"; // (valor y tipo de dato)
let noEsIgual = edad !== 30; // No igual (noEsIgual es true)
console.log(esIgual);

//Operadores logicos:
let esEstudiante = true;
let tieneTrabajo = false;

let esJoven = esEstudiante && tieneTrabajo; // AND lógico (esJoven es true)
let consultaAdulto = esEstudiante || tieneTrabajo; // OR lógico (consultaAdulto es true)
let noEsAdulto = !esJoven;   // NOT lógico (noEsAdulto es false)
console.log(!esJoven);
console.log(noEsAdulto);

// Operador de Concatenación de Cadenas:
let nombre = "Juan";
let apellido = "Pérez";
let nombreCompleto = "el nombre completo es: " + nombre + " " + apellido; // Concatenación de cadenas
let otraForma = `nombre completo: ${nombre} ${apellido}`;
console.log(nombreCompleto);
console.log(otraForma);

// Operadores de Incremento y Decremento:
let contador = 5;
contador++; // Incremento (contador es 6) contador = contador + 1
console.log(contador);
contador--; // Decremento (contador es 5 nuevamente)
console.log(contador);

// condicionales

if (nombre.length > apellido.length) {
    console.log("el nombre es mas largo que el apellido");
} else {
    console.log("el apellido es mas largo que el nombre");
}

// parseInt: convierte a entero
const decimal = 1.3
console.log(`parseInt de ${decimal} es: ${parseInt(decimal)}`);