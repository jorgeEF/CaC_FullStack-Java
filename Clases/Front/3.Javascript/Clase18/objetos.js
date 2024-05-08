// Objetos Literales (no visto como instancia de una clase)

const c = new Object();
console.log(c);

// declaramos un objeto persona con propiedades y metodos
const persona = {
    nombre:'Juan',
    edad: 30,
    saludar:function(){
        console.log(`Hola me llamo ${this.nombre}`);
    }
};

console.log(persona);

// agregar propiedad
persona.ciudad = "La Rioja";

// eliminar propiedad
delete persona.ciudad;

// visualizamos atributos y accedemos sus metodos
console.log(persona["nombre"]); // notacion de corchetes
console.log(persona.edad); // notacion de punto
persona.saludar();

// recorrer propiedades de objeto
// for..in..
for(let propiedad in persona){
    console.log(typeof propiedad);
    console.log(`Propiedad: ${propiedad}, valor: ${persona[propiedad]}`);
}

// Arrays de objetos
const personas = [
    { nombre: 'Juan', edad: 30 },
    { nombre: 'Maria', edad: 25 },
    { nombre: 'Pedro', edad: 30 },
    { nombre: 'Ana', edad: 31 },
]
console.log("Array de personas: ", personas);

// filtrar por...
const personasDe30 = personas.filter(persona => persona.edad === 30);
console.log("personas de 30 filtradas: ", personasDe30);

// cantidad de elementos
console.log("cantidad de personas de 30 años: ", personasDe30.length);

const carrito = [
    {nombre: 'Monitor 27 pulgadas', precio: 500 },
    {nombre: 'Television', precio: 100 },
    {nombre: 'Tablet', precio: 200 },
    {nombre: 'Audifonos', precio: 300 },
    {nombre: 'Teclado', precio: 400 },
    {nombre: 'Celular', precio: 700 },
]

// recorremos con forEach
carrito.forEach(element => console.log("recorriendo carrito con forEach: ", element.nombre));

