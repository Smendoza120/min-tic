let cajas = document.getElementsByTagName('div');
// let cajas = document.getElementsByClassName('caja');
let primeraCajas = document.getElementById('primeraCaja');
// cajas[1].textContent = 'Hola mundo';
// cajas[2].innerHTML = '<h1>Hello World</h1>';
// let cajas = document.getElementsByClassName('caja');
// primeraCajas.innerHTML = '<u>Hola mundo</u>';

// --------- Creando Nodos
//1.-Crear el elemento
let caja = document.createElement('div');
//2.-Crear un nodo de texto
let contenido = document.createTextNode('Hola Mundo');
//3.-Añadir el nodo de texto al elemento
caja.appendChild(contenido);
//4.-Agregar atributos a la caja
caja.setAttribute('class', 'caja naranja');
//5.-Agregar el elemento al documento
// let contenedor = document.getElementById('contenedor');
// contenedor.appendChild(caja);


// --------- Modificando la clase o id de un elemento
caja.id = 'primera';
caja.className = 'caja naranja';

// --------- Conociendo el elemento padre
let padre = cajas[1].parentNode;

// padre.insertBefore(caja, primeraCajas);

padre.replaceChild(caja, cajas[4]);

padre.removeChild(cajas[2]);

