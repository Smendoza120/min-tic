$(document).ready(function () {
    let boton = $('#boton');
    let caja = $('.caja');

    boton.on('mouseenter', function(){
        caja.animate({
            
        })
    })

    boton.on('mouseleave', function(){
        caja.css('background', 'black')
    })
});