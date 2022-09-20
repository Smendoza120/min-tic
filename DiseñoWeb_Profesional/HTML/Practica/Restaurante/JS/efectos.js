$(document).ready(function () {

//Efecto menu
    $('.menu a').each(function(index, elemento){
        $(this).css({
            'top': '-200px'
        });

        $(this).animate({
            top: '0'
        }, 1500 + (index * 500));
    });

//Efecto Header
    if($(window).width() > 800){
        $('header .textos').css({
            opacity: 0,
            marginTop: 0
        });

        $('header .textos').animate({
            opacity: 1,
            marginTop: '-52px'
        }, 1300);
    }

//Scroll Elementos Menu
    let acercaDe = $('#acerca-de').offset().top,
        menu = $('#menu').offset().top,
        galeria = $('#galeria').offset().top,
        ubicacion = $('#ubicacion').offset().top;

    $('#btn-acerca-de').on('click', function(e){
        e.preventDefault();
        $('html, body').animate({
            scrollTop: acercaDe
        }, 500);
    });

    $('#btn-menu').on('click', function(e){
        e.preventDefault();
        $('html, body').animate({
            scrollTop: 1280
        }, 600);
    });

    $('#btn-galeria').on('click', function(e){
        e.preventDefault();
        $('html, body').animate({
            scrollTop: galeria
        }, 700);
    });

    $('#btn-ubicacion').on('click', function(e){
        e.preventDefault();
        $('html, body').animate({
            scrollTop: 2720
        }, 800);
    });
});