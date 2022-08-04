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
   
        Manera grafica de verlo                                     
            n   n   n   n   n                                       
            0   1   2   3   4                                       
    m    0  1   2   3   4   5       m = filas.                      
    m    1  2   4   6   8   10      n = columnas.                   
    m    2  3   6   9   12  15                                      
                                                                       
//Primera manera de pasarlo a java.                                                                
        int matriz[][] = {{1,2,3,4,5},{2,4,6,8,10},{2,3,6,9,12,15}};
        
        En la primera manera agregamos los datos manuales y para ponerlos lo hacemos de esa manera y para imprimirlo, necesitamos 2 bucles for anidados
        siempre van las filas primero que las columnas.

        for(int i=0; i<nFilas; i++){
            for(int j=0; j<nCol; j++){
                System.out.print(matriz[i][j] + " - ");
            }
        }


//Segunda manera de pasarlo a java. 
        int m[][], nFilas, nColumnas;
        nFilas = 3; 
        nColumnas = 5;
        matriz = new int[nFilas][nColumnas];

        La segunda manera es si nosotros le preguntamos al usuario si desea ingresar la cantidad de filas y columnas, luego se usa un bucle for para 
        solicitar los datos, de esta manera: 

        System.out.println("Digite la matriz");
        for(int i=0; i < nFilas; i++){
            for(int j=0; j < nCol; j++){
                System.out.print("Matriz ["+i+"] ["+j+"]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        Hacemos 2 bucles anidados y de esta manera rellenamos el codigo y para mostrarlo, realizamos el mismo procedimiento que en la primera manera.
*/

//Programacion orientada a objetos (POO):

/*
    Es como expresamos las cosas de un nivel mas cercano a como lo hacemos fuera de la computadora, por ejemplo un coche:

        Color
        Marca
        KM
    
    tambien estan los metodos, que son lo que haremos con nuestro objeto: 
        
        Encender
        Acelerar
        Frenar
*/

//Clases 
/*        
    Para crear una clase, tenemos que crear un nuevo proyecto, este proyecto nos deja un archivo abierto, despues nos vamos a la carpeta de packages, 
    click derecho y creamos una clase (Java class), le ponemos el nombre deseado y tambien le damos los atributos que deseamos (color, nombre, marca)
    los atributos tienen que ir de la manera correcta, si son Strings o si son numeros enteros (int), ETC.

    Una vez finalicemos con la creacion de la clase, usaremos esos atributos, entonces para ello tenemos que llamarlos, para ello hacemos los siguiente:
        
        Coche coche1 = new Coche();
        
          -Se pone el nombre de la clase creada.
          -Se le agrega el nombre deseado que es como lo llamaremos, en este caso coche1.
          -Luego lo igualamos a new y agregamos nuemvamente el nombre de la clase creada con parentesis.
          -Para llamarlos, solo necesitamos el nombre que le pusimos, y para acceder a los atributos le agregamos un punto y nos dara las opciones.
*/

//Metodos
/*
//Creacion de metodos
    El metodo es una accion o comportamiento de un objeto, se hace de la siguiente manera: 

        public void Metodo(){
        --------------
        }

        -Public: modificador de acceso.
        -Void: Valor de retorno.
        -Metodo: nombre del metodo.
        -(): Esto es un argumento.

    Para hacer uso de los metodos se pueden traer de otros archivos de la misma carpeta package, para poder traerlo, llamamos al nombre, en el ejemplo esta
    como metodo y se realiza la accion de la siguiente manera: 

        Metodo me = new Metodo();

    De esta manera traemos todos los atributos de nuestro objeto, como vimos en el ejemplo pasado, con los colores del coche o tambien con la marca o km,
    pero lo hacemos en el archivo main para que todo quede de una manera mas organizada.
*/

//Parametros y argumentos
/*
    Para agregarle parametros a un metodo realizamos lo siguiente: 

        public void Metodo(int a, String b){
        --------------
        }

        objeto.Metodo(1, "Hola");

        En el archivo del metodo agregamos 2 variables y las pasamos como un parametro, esto hace que cuando se llame el metodo, se tenga que rellenar la 
        informacion como esta en el segundo ejemplo que seria un argumento, de esta manera tenemos los parametros y argumentos resueltos. 
*/

//Retorno de valores.
/*

    Para este retorno de valores, vamos a cambiar lo que habiamos hecho anteriormente 
    
        public int Metodo(){
        --------------
        }

        Ya no agregaremos la palabra void, si no el tipo de variable como (string, int, float) y para poder devolver los valores que queremos realizamos 
        lo trataremos con un ejemplo, en este caso queremos una suma: 

        public int Metodo(int numero1, int numero2){
            int suma = numero1 + numero2;
            return suma;
        }

        De esta manera esta como un metodo ahora llamaremos al metodo para poder ingresarle los valores y de esta manera poder imprimirlo, hay 2 maneras de
        imprimir este metodo:

        primera forma: 
        
        Metodo me = new Metodo();

        int resultado = me.suma(5,5)
        System.out.println(resultado); 10

        De esta manera llamamos al metodo, le agregamos el nombre deseado y para poder realizar la operacion, primero creamos una variable con un nombre
        deseado, en este caso sera resultado, luego llamamos al metodo y traemos al objeto, y dentro agregamos los valores, al final imprimimos la variable
        creada.

        segunda forma: 
        
        Metodo me = new Metodo();

        System.out.println(me.suma(5,5)); 10

        Continuamos llamando al metodo y luego agregamos la formula para imprimir en pantalla, pero dentro de la misma, agregamos la formula, de esta manera,
        podemos llegar al mismo resultado anterior.
*/

//Metodo constructor
/*
    Este metodo se utiliza para asegurarnos de que los objetos siempre tengan valores validos, un constructor se crea de la siguiente manera: 

        public Persona(String nombre, int edad){
            this.nombre = nombre;
            this.edad = edad;
        }
        
    Estos constructores son publicos pero no se le agrega un valor de retorno como veiamos anteriormente, solo le agregamos un nombre, en este caso Persona,
    y dentro le podemos agregar parametros, se pueden agregar de 2 formas estos parametros. 

    Primera forma (sea el mismo nombre de la variable externa o atributo) 
    
        public Persona(String nombre, int edad){
            this.nombre = nombre;
            this.edad = edad;
        }

        De esta forma, tenemos que decirle al programa cual variable es cual, para eso utilizamos this punto y luego agregamos el nombre de la variable, como
        se ve en el ejemplo, aqui le estamos diciendo esta variable es el atributo.

    Segunda forma (se ponen diferentes variables al atributo)
    
        public Persona(String _nombre, int _edad){
            nombre = _nombre;
            edad = _edad;
        }
        
        De esta manera, solo agregamos en nombre del atributo y lo igualamos a la variable que esta dentro de los parametros y como son diferentes el 
        programa detecta automaticamente, que se tratan de 2varables diferentes.

    Para imprimir los metodos, hacemos lo mismo de antes, lo llamamos y ponemos el nombre con el punto y llamamos el metodo, de esta manera: 

        Persona pe = new Persona("Harold", 24);
        
        pe.mostrarDatos();
*/

//Sobrecarga de mettodos y constructores.
/*
    Esto pasa porque agregamos uno o mas metodos, ya sean normales o constructores, veremos un ejemplo para entenderlo de una mejor manera: 

            public Persona(String nombre, int edad) {
                this.nombre = nombre;
                this.edad = edad;
            }

            public Persona(String dni) {
                this.dni = dni;
            }

        Aqui tenemos 2 constructores, cada uno tiene diferentes parametros, el primero tiene 2 y el segundo tiene 1, cuando llamemos a este constructor, 
        el programa nos preguntara cual de los 2 constructores usaremos, dependiendo que constructor queremos usar, le pasamos cierto tipo de datos o no,
        para que esta sobrecarga funcione, cada constructor o metodo debe tener diferentes cantidades de parametros.

            public void correr(){
                System.out.println("Soy " + nombre + ",  tengo " + edad + " años y estoy corriendo una maraton.");
            }

            public void correr(int km){
                System.out.println("He corrido " + km + " kilometros.");
            }
            
        Como vemos, pasa lo mismo que con los constructores, el primero no tiene parametros y el segundo si tiene 1 ahora veremos como los mostramos por 
        pantalla:

            Persona persona1 = new Persona("Harold", 24);
            persona1.correr();

            Persona persona2 = new Persona("1233496433");
            persona2.correr(100);

        Llamamos al constructor y como sabemos tiene solo 2 parametros, los cuales eran el nombre y la edad, aqui rellenamos etos campos, tambien lo ponemos
        el nombre y le damos el metodo de constructor que no tiene parametros, el segundo constructor tiene solo un parametro el cual pregunta el dni pero 
        de forma String, lo gual rellenamos en el ejemplo y tambien llamamos al otro metodo y le agregamos el parametro, en este caso es 100, y de esta 
        manera tenemos la sobrecarga de metodos y constructores.
*/

//Modificadores de acceso
/*
    Los modificadores de acceso significa que en la parte superior donde se agregan las variables globales de un archivo, se pueden clasificar entre privado
    y publico, si se deja en publico, cualquier archivo puede ingresar a dicho dato ya sea dentro del mismo paquete como fuera de el, y privado, significa
    que solo dicho archivo puede ingresar a ese dato. 

        private int atributo1;
        public int atributo1;

    Es el mismo nombre, pero uno tiene el estado privado y el otro tiene el nombre en publico. 

    Si queremos usar un dato publico de otra carpeta tenemos que importarla, para ello en la parte superior se agrega lo siguiente: 

        import paquete1.Clase1;

    Se pone la palabra reservada import y se pone el nombre del archivo y con un punto ingresamos a las caracteristicas.
*/

//Encapsulamiento
/*
    
*/