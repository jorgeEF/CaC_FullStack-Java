// Arreglos

// definicion clásica
const colores = new Array("rojo","amarillo","verde");
console.log(colores);

// definicion estandard
let frutas = ["Pera", "Manzana", "Anana"];
console.log(frutas);

// acceder a un elemento
console.log(`Elemento en posision 0 de arreglo frutas: ${frutas[0]}`);
console.log(`Elemento en posision 1 de arreglo frutas: ${frutas[1]}`);
console.log(`Elemento en posision 2 de arreglo frutas: ${frutas[2]}`);

// Metodos de arreglos

// conocer cantidad de elementos de un arreglo
console.log(`El arreglo frutas tiene ${frutas.length} elementos`);

// agregar elemento al final del arreglo
console.log("agregamos naranja al arreglo con push: ");
frutas.push("Naranja")
console.log(frutas);

// quitar ultimo elemento de un arreglo
const frutaExtraida = frutas.pop();
console.log("fruta extraida con pop: ",frutaExtraida);
console.log("frutas quedó: ", frutas);

// quitar primer elemento de un arreglo
const frutaExtraida2 = frutas.shift();
console.log("fruta extraida con shift: ",frutaExtraida2);
console.log("frutas quedó: ", frutas);

// agregar elemento en primer posicion de areglo
frutas.unshift(frutaExtraida2)
console.log("fruta agregada con unshift: ",frutaExtraida2);
console.log("frutas quedó: ", frutas);

// recorriendo arreglos
console.log("bucle for de frutas");
for (let i = 0; i < frutas.length; i++) {
    console.log(frutas[i]);    
}

const numeros = [1,2,3,4,5,6,7,8,9]

// accediendo a elementos con forEach
console.log("accediendo a elementos con forEach");
numeros.forEach(numero => console.log(numero))

// accediendo a numeros por condicion
const pares = []
numeros.forEach(function (numero){
    if (numero % 2 === 0) {
        pares.push(numero)
    }
})
console.log("los pares son: ", pares);

// filter
const impares = numeros.filter(function (numero){
    return numero % 2 !== 0;
})
console.log("los impares son: ", impares);

const pares2 = numeros.filter(num => num % 2 === 0);
console.log("los pares2 son: ", pares2);

// map
const numerosInvertidos = []
numeros.map(num => numerosInvertidos.unshift(num))
console.log("numeros invertidos con map: ", numerosInvertidos);