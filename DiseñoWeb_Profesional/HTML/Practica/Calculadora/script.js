function suma (){
    let numero1 = document.getElementById('numero1').value;
    let numero2 = document.getElementById('numero2').value;
    let resultado = Number(numero1) + Number(numero2);

    document.getElementById('resultado').value = resultado;
}