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

//Metodo burbuja
/*
    Es un metodo de ordenamiento, que lo que hace es hacer un bucle mirando el numero actual con el numero siguiente, si es mayor lo cambia, de lo contrario
    lo deja igual:

        4 5 2 1 3
        4 2 1 3 5
        2 1 3 4 5
        1 2 3 4 5   Ordenado: como vemos se repide una y otra vez, hasta que nuestro arreglo este de una manera ordenada.

    Ahora veremos el metodo en codigo:
        for(int i=0; i<(nElementos-1); i++){
            for(int j=0; j<(nElementos-1); j++){
                if(arreglo[j] > arreglo[j+1]){
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = aux;
                }
            }
        }
            
            Se crea un bucle for con el iterador (i) y que sea menor al numero de elementos -1, dentro de ello, se crea otro, con otro iterador (j) de la
            misma manera que el anterior, luego se crea un if y se hace la formula para saber si el inicial es mayor al siguiente, se crea otra variable.
            Esta variable lo que hace es guardar el arreglo, luego llamamos a ese arreglo y lo igualamos al mismo + 1, y despues el areglo + 1 lo igualamos
            al auxiliar, ya solo nos queda imprimir de manera acendente o decendente y quedaria el metodo burbuja.
*/

//Metodo por insercion.
/*
    Es el mismo metodo que hacen los humanos para ordenar una baraja de cartas, lo que hace este metodo es tomar el numero actual y comparalo con el numero
    de la izquierda, si es mayor cambia, de lo contrario sigue comprobando.

    La formula quedaria de la siguiente manera: 
        
        for(int i=0; i < nElementos; i++){
            pos = i;
            aux = arreglo[i];
            
            while((pos > 0) && (arreglo[pos-1] > aux)){
                arreglo[pos] = arreglo[pos-1];
                pos--;
            }
            arreglo[pos] = aux;
        }

        Realizamos un bucle for, para poder recorrer el metodo, para comenzar con el metodo, se crean 2 variables mas (pos y aux), la primera variable se 
        iguala al iterador, la segunda variable se iguala al arreglo del iterador, despues realizamos un bucle while dentro del for, donde los parametro 
        son, pos mayor a 0 y arreglo de pos -1 sea mayor al aux, dentro del bucle while, le decimos que arreglo[pos] es igual a arreglo [pos-1] y tambien 
        disminuimos a pos en 1, pos--, solo quedaria imprirmir nuestro resultado y ya tendriamos el metodo de insercion.
*/

//Metodo por seleccion
/*
    Toma el numero menor y lo ingresa en el primer posicion del arreglo, luego tomamos el segundo numero menor y lo ponemos en la segunda posicion y asi
    sucesivamente, hasta que nuestro arreglo quede ordenado y a sea de forma creciente o decreciente.

    La formula es de la siguiente manera: 
        
        for(int i=0; i <nElementos; i++){
            min = i;
            for(int j = i+1; j < nElementos; j++){
                if(arreglo[j] < arreglo[min]){
                    min = j;
                }
            }
            aux = arreglo[i];
            arreglo[i] = arreglo[min];
            arreglo[min] = aux;
        }

        Primero se crea un bucle for, para poder recorrer nuestro arreglo, luego de ello creamos 2 variables mas, en este caso (min y aux), a min lo 
        igualaremos a nuestro iterador que es i, luego creamos otro bucle for y ponemos otro iterador + 1 (j + 1), lo terminamos como siempre y dentro 
        agregamos un if que arreglo[j] sea menor a arreglo[min], si es correcto, min se iguala a (min = j), dentro del primer bucle for, agregamos la  
        segunda varialbe y la igualamos al arreglo con el iterador (aux = arreglo[i]), luego nuestro arreglo i lo igualamos a arreglo min 
        (arreglo[i] = arreglo[min]) y por ultimo nuestro arreglo min lo igualamos con la segunda variable aux (arreglo[min] = aux), de esta manera tenemos
        nuestro metodo por seleccion.
*/

//Busquedas en java.

//Busqueda secuencial
/*
    Se usa cuando queremos buscar un determinado elemento en un arreglo, no es la busqueda mas eficiente, porque si hay mas datos, tomara mas tiempo, 
    el arreglo no necesariamente tiene que estar ordenado.

    La formula quedaria de la siguiente manera:
    int i = 0;
        while(i < arreglo.length && band == false){
            if(arreglo[i] == dato){
                band = true;
            }
            i++;
        }

        Para este buscador necesitamos un bucle while, para ello, tenemos que agregar la variable i y inicializarla en 0, entonces los parametros de while 
        son, mientras (i) sea menor que la longitud de nuestro arreglo y agregamos una variable negativa en este caso (band == false) sea falsa, realice 
        el bucle, dentro de ese bucle, agregamos un if, si el arreglo[i] es igual al dato, entonces pasamos el valor a positivo, de lo contrario siga 
        ejecutando, y cuando salga del if, agregue 1 a i (i++).
        
        if(band == false){
            JOptionPane.showMessageDialog(null, "No se encontro el dato en el arreglo");
        } else{
            JOptionPane.showMessageDialog(null, "Si se encontro el dato, esta en la pocision: " + (i - 1));
        }

        Fuera del bucle while, agregamos los parametros que queremos mostrar, si la variable sigue negativa, quiere decir que no se encontro el dato, de    
        lo contrario si lo encontro, y mostramos la pocicion en pantalla, para eso agregamos la i, pero tambien tenemos que agregar -1, ya que en el bucle
        while, cuando se finaliza el codigo, se incrementa en 1.
*/

//Busqueda binaria
/*
    Para poder usar esata busqueda, el arreglo tiene que estar ordenado ascendentemente y se usa para buscar un dato dentro de un arreglo.
    
    La formula quedaria de la siguiente manera: 

    int arreglo[] = {1,2,3,4,5};
        int dato, inf, sup, mitad, i;
        boolean band = false;
        
        dato = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero a buscar: "));
        
        i=0;
        inf = 0;
        sup = arreglo.length;
        mitad = (inf + sup) / 2;
        
        while(inf <= sup && i<arreglo.length){
            if(arreglo[mitad] == dato){
                band = true;
                break;
            }
            if(arreglo[mitad] > dato){
                sup = mitad;
                mitad = (inf + sup) / 2;
            }
            if(arreglo[mitad] < dato){
                inf = mitad;
                mitad = (inf + sup) / 2;
            }
            i++;
        }

        Para esta busqueda, necesitamos mas variables que en el anterior, necesitamos las siguientes varialbes: inferior, superior, mitad y un iterador (i),
        necesitamos inicializarlas todas, la i se iguala a 0, inferior se iguala a 0, la superior se iguala a la cantidad de datos en el arreglo, la mitad
        se saca sumando la inferior y la superior, despues se divide en 2, despues de crear las variables vamos a crear el bucle while, los parametros son 
        los siguientes, mientras inferior sea menor o igual a superior y el iterador es menor a la cantidad de valores del arreglo, se crean 3 if, que son
        los diferentes resultados, el primer if es si arreglo[mitad] es igual al dato ingresado, si se cumple, band pasa a verdadero y se agrega un break,
        el siguiente if es si arreglo[mitad] es mayor al dato, entonces superior es igual a mitad y mitad es igual a inferior mas superior dividio 2 y por  
        ultimo, si arreglo[mitad] es menor al dato, entonces inferior es igual a mitad y mitad es iguala inferior mas superior dividido en 2, despues se 
        suma en 1 el iterador (i++)
        
        
        if(band == false){
            JOptionPane.showMessageDialog(null, "No se encontro el dato");
        } else{
            JOptionPane.showMessageDialog(null, "El numero ha sido encontrado en la posicion: " + mitad);
        }

        Fuera del bucle while, tenemos 2 opciones, si el numero solicitado esta en el problema anterior o si no esta, entonces si band es falso, significa
        que no esta el numero solicitado, de lo contrario si esta y lo mostramos en pantalla, se pone mitad, debido a que esta variable tiene almacenado el
        resultado.
*/


//Matriz
/*
    Son arreglos bidimencionales, que se representaria mejor como filas y columnas, agregaremos un ejemplo para que se entienda de una mejor manera:
   
        Manera grafica de verlo                                     Primera manera de pasarlo a java.
            n   n   n   n   n                                       int m[][] = {{1,2,3,4,5},{2,4,6,8,10},{2,3,6,9,12,15}};
            0   1   2   3   4                                       
    m    0  1   2   3   4   5       m = filas.                      Segunda manera de pasarlo a java.
    m    1  2   4   6   8   10      n = columnas.   
    m    2  3   6   9   12  15

    
*/
