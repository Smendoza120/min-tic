// function saludo(){
//     alert('Hola');
// }

// function saludo2(){
//     alert('Hola 2')
// }

// let btnSaludar = document.getElementById('btn.saludar');
//Añadir evento
// btnSaludar.addEventListener('click', saludo);
// btnSaludar.addEventListener('click', saludo2);
//Remover evento
// btnSaludar.removeEventListener('click', saludo);

// ------ Eventos mas usados
/*
    click
    focus
    blur
    change
    onload
    mouseover
    mouseout
    resize
    submit
*/

function crearCaja(){
    let contenedor = document.getElementById('contenedor');
    let caja = document.createElement('div');
    caja.className = 'caja';
    contenedor.appendChild(caja);
}

let boton = document.getElementById('btn');
boton.addEventListener('mouseout', crearCaja);