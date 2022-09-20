$(document).ready(function () {
    let titulo = $('#titulo'),
        info = $('#info');

    info.append(`Ancho: ${titulo.width()} <br>`);

    info.append(`Ancho Interno: ${titulo.innerWidth()} <br>`);

    info.append(`Ancho Externo: ${titulo.outerWidth()} <br>`);

    info.append(`Ancho Externo: ${titulo.outerWidth(true)} <br><br>`);

    info.append(`Alto: ${titulo.height()} <br>`);

    info.append(`Alto Interno: ${titulo.innerHeight()} <br>`);

    info.append(`Alto Externo: ${titulo.outerHeight()} <br>`);

    info.append(`Alto Externo: ${titulo.outerHeight(true)} <br>`);
});