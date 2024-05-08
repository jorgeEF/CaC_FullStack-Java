// objeto global window
console.log(window.document);

// se puede acceder a document directamente
console.log(document.body);

// document tiene todas las etiquetas, elementos y atributos del html

// seleccionar elementos del DOM
const titulo = document.getElementById('tituloPrincipal')
console.log("el valor del elemento seleccionado tituloPrincipal es: ", titulo.innerText);

// modificar el valor de un elemento del DOM
titulo.innerText = "Manipulando el DOM"

console.log("el valor modificado de tituloPrincipal es: ", titulo.innerText);

// seleccionar el primer elemento que coincida con el selector css
const primerElemento = document.querySelector('.miClase')
console.log("primer elemento seleccionado con querySelector: ", primerElemento);

// seleccionar todos los elementos de id, clase, etc.. especificado
const parrafos = document.querySelectorAll('.otro');
console.log("los parrafos seleccionados son: ", parrafos);

// convertir nodelist en un array
const parrafosArray = Array.from(parrafos);

// desestructurar el array
parrafosArray.forEach(parrafo => console.log(parrafo.textContent));

// modificar atributos
const imagen = document.querySelector('.main-div img');
imagen.src = "https://picsum.photos/id/682/600/400"

