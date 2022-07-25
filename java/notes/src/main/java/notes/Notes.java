//Nota importante. 

    /*
    En todo el lenguaje, se tiene que tratar el tipo de dato, de lo contrario siempre dara un error.
    */

//Imprimir datos.

    /*
    Para imprimir los datos, necesitamos agregar un comando especial:
        System.out.print(Aqui ponemos el dato)
    
    Impirmir datos y dar un salto de linea.
        System.out.println(Aqui ponemos el dato)
    */

//Variables

    /*
    Para guardar una variable en java, lo que necesitamos es usar las palabras reservadas.
    
        int = Tipo numero entero.
        double = Tipo numero decimal. 
        String = Datos de tipo letra o cadena de caracteres.
        Boolean = Datos de tipo booleano (true or false).
    */

// Crear constantes.

    /*
    Para crear una constante, se necesita de una palabra reservada llamada final.
        
        final int numero = 10;
    */

//Decirle al usuario que escriba algo para que luego lo imprima.
        
    /*
    Primero tenemos que isntalar una extencion que permite realizar este comando.

        Scanner entrada = new Scanner(System.in)
        
        Explicaremos mejor el codigo: 
        Primero agregamos la palabra Scanner, luego le asignamos un nombre cualquiera, despues le agregamos la palabra (new)
        y llamamos a Scaner, dentro de ello agregamos un comando el cual es (System.in) dentro de parentesis.
        
    De esta manera instalamos la extencion, la podemos visualizar en la parte superior del archivo.

    Una vez instalado lo anterior, procederemos a hacerle una pregunta al usuario, el cual tiene que responder.
    Pero para ello tenemos que agregar el tipo de dato correcto que queremos preguntar.   

        Para este ejemplo queremos preguntar que edad tiene el usuario, como esto es un dato numerico usaremos la variable int.

        int numero;  
        numero = entrada.nextInt(); 
        
        En la primera parte nombramos la variable como numero y agregamos la palabra reservada int.
        Despues llamamos a numero ya que no tiene datos, llamamos a entrada, que es la extencion instala anteriormente. 
        Le agregamos un punto (.) y agregamos next y la palabra reservada que queremos preguntar en este caso seria Int.
        Ya solo quedaria imprimirlo.
    */

//Ventanas emergentes

    /*
    Para crear una ventana emergente para poder ver las cosas de una mejor manera hacemos lo siguiente.

            String cadena;

            cadena = JOptionPane.showInputDialog("Agrega lo que quieras mostrar.");
        
       Primero crearmos una variable, en esta ocasion realizamos una cadena, luego llamamos a la cadena y la igualamos a (JOptionPane.showInputDialog()),
       una ves se realiza ello, se nos habilitara una extencion al inicio del archivo, y de esta manera podremos trabajar con cuadros emergentes.

       No olvides que de esta manera estamos tratando este apartado como un string, por lo que si queremos usarlo para un numero, tenemos que transformarlo.

            salarioHora =  Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
       
       De esta manera podemos guardar un dato numerico en la variable, pero este dato numero solo sirve para las variables enteras.

       Para guardar solo un digito con desimales haremos lo siguiente:
            
            salarioHora =  Double.parseDouble(JOptionPane.showInputDialog("Digite un numero"));
       
       En vez de agregar integer como en el ejemplo anterior, agregamos (Double) y luego llamamos a (parseDouble), de esta manera guardamos datos 
       con decimales.

       Ahora queremos guardar un caracter de una cadena, haremos lo siguiente.
            
            cadena = JOptionPane.showInputDialog("Agrega lo que quieras mostrar.").charAt(Agregamos el numero del elemento que queremos mostrar);
    */