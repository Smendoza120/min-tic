function a () {
    console.log("a");
    function b () {
        var c = function c( cad ) {
            return cad.replace(/\s/g, "");
        }
        function d() {
            c("Frase con espacios");
        }
    }
}
a();