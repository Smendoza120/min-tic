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

//Encapsulamiento y metodos accesores.
/*
    Para hacer un encapsulamiento a datos que no queremos que sean modificados, lo que hacemos es ponerlos en privado en vez de publico. 

        private int edad;  De esta manera esta privada la edad, lo que quiere decir que solo el mismo archivo lo puede modificar. 
        public int edad;  De esta forma nuestra edad esta publica y la pueden modificar desde otros archivos  y tambien desde el mismo. 

    Los metodos accesores permiten consultar estos datos publicos, pero sin hacer cambio alguno, para ello utilizamos 2 metodos, los cuales son (Setters y 
    Getters).

        Setters: carga un valor. 
        Getters: nos devuelve el valor de Setters.

    Ahora realizaremos un ejemplo: 

        private int edad; 

            public void setEdad(int edad){
                this.edad = edad;
            }

        Explicaremos de manera mas detallada lo que acabamos de hacer, primero creamos la variable global de forma pribada que se trata de la edad, luego 
        la llamaremos con nuestro metodo Setter, para ello lo ponemos publico, que no retorne ningun valor y el nombre que se agrega es set y luego lo que
        deseemos en este caso edad y como parametros le agregamos otra variable relacionada al caso, en este caso edad y luego llamamos a la edad privada
        con this y la igualamos a la edad del parametro. 

            public int getEdad(){
                return edad;
            }
            
        Ahora veremos el metodo Getter, este metodo nos devuelve el Setter como lo explicamos anteriormente, para crear este metodo lo ponemos publico y 
        le agregamos el tipo de dato a mostrar en este caso es un entero, entonces agregamos int, luego agregamos la palabra get y despues un nombre 
        relacionado, en este caso Edad, no le agregaremos ningun parametro y por ultimo retornamos edad.

        Para poder llamar estos metodos en otro proyecto, lo que hacemos es llamarlo. 

            Clase1 objeto1 = new Clase1();

            objeto1.setEdad(10);
            System.out.println("La edad es: " + objeto1.getEdad());

        Primero llamamos a la otra hoja, luego agregamos el nombre que le dimos cuando creamos la llamada, en este caso objeto1 luego le agregamos el punto
        para poder llamar a los metodos y traemos a setEdad y le pasamos el parametro, y para poder visualizar y llamar lo de set agregamos el mismo nombre 
        objeto1 y con el punto llamamos a getEdad() y de esta manera nos muestra el resultado de set. 
*/

//Constates
/*
    Es lo mismo que una variable, pero con la peculiaridad de que no se puede modificar en ningun momento, su valor se sigue manteniendo.

            private final String nombre; 

        Para poder crear una constante necesitamos primero declarar si sera privada o publica, luego le agregamos la palabra final, despues agregamos el 
        tipo de dato y por ultimo agregamos el nombre de nuestra constante, pero no es todo para que nuestra constante funcione, necesitamos crear un 
        constructor.

            public Clase1(String nombre){
                this.nombre = nombre;
            }

        Agregamos public luego el nombre del archivo donde estamos que seria clase1 y como parametros agregamos una variable string, luego llamamos a la 
        constante y la igualamos al parametro, cuando llamemos al cosntructor y le demos el nombre ya quedaria creada nuestra constante. 
*/

//Miembros estaticos de una clase. 
/*
    La funcion estatic permite que si tenemos unas variables y le agregamos static a dichas variables, todas estas tendran el ultimo valor digitado, es 
    decir, si tenemos 3 variables diferentes y a todas estas le agregamos la palabra static, todas se igualan al ultimo valor digitado. 

        

    Para usar la funcion estatico, necesitamos agregar la palabra reservada static, hay 2 maneras de usar esta funcion, la primera es en un metodo y la 
    segunda es en un atributo.  

            private static String nombre = "Harold";

    El ejemplo anterior es un atributo estatico, primero agregamos si la variable sera o no publica, luego agregamos la palabra reservada static, luego 
    agregamos el tipo de dato seguido del nombre y por ultimo podemos darle el valor deseado.

    Ahora veremos el ejemplo con un metodo. 

            public static int sumar (int n1, int n2){
                int suma = n1 + n2;
                return suma;
            }
        
    En este ejemplo agregamos un metodo, el cual consiste en agregar si es publico o no, la palabra reservada static, luego el tipo de dato con su respectivo
    nombre y podemos agregarle parametros, para este ejemplo haremos una suma entonces los paramestros son n1 y n2, luego agregamos otra variable que 
    contiene la suma de n1 y n2 y luego la muesrta. 

    Ahora veremos como se llaman estos miembros estaticos, para poder llamarlos usaremos el nombre del archivo en este caso seria Clase1 y seguido del nombre
    le agregamos un punto y traemos lo que queremos mostrar en este caso la suma. 

        System.out.println(Clase1.sumar(3, 4)); 7

    La respuesta de esta suma seria 7.
*/

//Herencia 
/*
    La forma de reutilizacion de codigo, esto nos ahorraria tiempo 

    Para poder heredar los atributos de una clase a otra realizaremos lo siguiente:

        1. Creamos nuestros atributos ya sea de tipo privado o publico.
        2. Creamos el constructor y los metodos Get necesarios.
        3. Nos dirigimos a la clase hija o donde queremos usar los datos.
        4. En la parte de la clase, seguido del nombre agregamos la palabra reservada (extends) y agregamos el nombre de donde lo queremos traer.

        Clase padre:
            public class Persona {
                private String nombre;
                private String apellido; 
                private int edad;

                public Persona(String nombre, String apellido, int edad) {
                    this.nombre = nombre;
                    this.apellido = apellido;
                    this.edad = edad;
                }

                public String getNombre() {
                    return nombre;
                }

                public String getApellido() {
                    return apellido;
                }

                public int getEdad() {
                    return edad;
                }
            }

        Clase Hija: 
            public class Estudiante extends Persona{
                private int codigoEstudiante;
                private float notaFinal;

                public Estudiante(String nombre, String apellido, int edad, int codigoEstudiante, float notaFinal) {
                    super(nombre, apellido, edad);
                    this.codigoEstudiante = codigoEstudiante;
                    this.notaFinal = notaFinal;
                }

                public void mostrarDatos(){
                    System.out.println("Nombre: " + getNombre()
                                       + "\nApellido: " + getApellido()
                                       + "\nEdad: " + getEdad()
                                       + "\nCodigo del estudiante: " + codigoEstudiante
                                       + "\nNota final: " + notaFinal);

                }
            }

        Explicaremos mejor este codigo, primero agregamos la clase publica con el respectivo nombre que en este caso es Estudiante, luego realizamos el
        paso numero 4, tambien podremos agregar mas atributos, en este caso agregamos codigoEstudiante y notaFinal. 
         
        Ahora veremos el constructor, en los parametros agregamos todos los datos tanto los que heredamos como los creados en esta clase, como las clases
        heredadas ya estan inicializadas agregamos la palabra reservada super y como parametros le pasamos los nombres de los atributos heredados, lo demas
        se agrega con this. 
        
        Ahora veremos como podemos mostrar los datos heredados de otra clase, para ello los llamamos con el metodo get creado anteriormente y de esa manera
        usamos los atributos privados de cada clase. 
*/

//Clases y metodos final
/*
    El uso de la palabra final es para hacer una constante o tambien para que una clase no se pueda heredar, tambien podemos hacer que los metodos solo 
    tengan un nombre, ahora veremos un ejemplo de cada uno. 

    Para que no se herede mas una clase realizaremos lo siguiente: 

        Creamos la clase, pero al inicio le agregamos la palabra final, de esta manera: 
            
            final public class FiguraCerrada()

        De esta manera nos aseguramos de que no se pueda heredar esta clase.

    Ahora veremos como hacer que el nombre de un metodo no se pueda repetir en la herencia.

        Realizamos algo similar al pasado, agregamos el metodo luego agregamos la palabra reservada final, seguido de ello agregamos si el campo es vacio
        o nos retorna algo y por ultimo agregamos el nombre. 

            public final void dibujar()

    De esta manera si intentamos heredar y la clase tiene la palabra final, nos mostrara un error, tambien si un metodo tiene dicha palabra nos marcara el 
    error de que ya hay un metodo reservado con dicho nombre, para quitar este error, lo que tenemos es nombrar de otra manera el metodo. 
*/

//Sobre escritura de miembros:
/*
    Esto sirve para cuando queremos hacer un metodo con el mismo nombre en diferentes clases y estas se hereden, nos den el contexto de cada clase y no un
    contexto general, para ello realizaremos un ejemplo: 

        clase padre
            Animal

        clase hijas
            Persona
            Perro

        
            public class Persona extends Animal{

                @Override
                public void comer(){
                    System.out.println("Estoy comiendo sentado y con cubiertos");
                }
            }

        Aqui tenemos la clase Persona y heredamos a Animal, creamos un metodo que se llama comer y le damos a mostrar por pantalla una oracion, pero 
        crearemos otro metodo para Perro. 

            public class Perro extends Animal{

                @Override
                public void comer(){
                    System.out.println("Estoy comiendo con mi platito en el suelo");
                }
            }

        Este metodo tambien tiene como nombre comer, para poder diferenciar uno de otro el aplicativo nos dice que tenemos que agregar un comando, este 
        comando se llama @Override y el programa lo agrega automaticamente, ahora si llamamos a nuestra clase main e imprimimos ello nos tiene que mostrar
        un resultado diferente.

            public static void main(String [] args){

                    Persona persona = new Persona();
                    Perro perro = new Perro();

                    persona.comer(); Estoy comiendo sentado y con cubiertos
                    perro.comer(); Estoy comiendo con mi platito en el suelo
            }

        Ahora inicializamos a nuestras clases, persona y perro, y cuando llamamos el metodo comer, las respuestas son totalmente diferentes, de esta manera 
        hacemos una sobre escritura.
*/

//Clases y metodos Abstractos
/*
    Clase abstracta: 
        - Solo se usa como super clase, por lo que si o si tiene que tener hijos. 
        - No se pueden crear objetos.

    Lo veremos mejor con un ejemplo. 

    Haremos una app que nos diga como comen las plantas y los animales. 

        1.Crearemos una clase que se llame SerVivo.
        2.Luego creamos una clase Planta y una clase Animal, estas 2 son herencias de la clase SerVivo. 
        3.Como si sabemos como se alimentan las plantas, entonces no creamos otro hijo, por lo que quedaria ahi.
        4.Para los animales si es mas dificil, ya que hay 2 clases los herbivoros y los carnivoros, por lo que Animal seria una clase abstracta y sus 2 
          hijos serian AnimalCarnivoro y AnimalHerbivoro.

    Ahora lo haremos un poco mas grafico. 

            public abstract class SerVivo {
                public abstract void alimentarse();
            }
         
        Para crear una clase abstracta agregamos la palabra public y en vez de void agregamos abstract, pero como eso es una clase abstracta, tambien lo 
        tiene que ser el metodo, por lo que el metodo quedaria de manera publica, se agrega la palabra abstract luego void y por ultimo el nombre, cuando 
        son metodos abstractos no se puede instanciar, lo que quiere decir que no se puede agregar nada dentro de los corchetes, solo se cierra con un 
        punto y coma. 

        
            public abstract class Animal extends SerVivo{
    
                @Override
                public abstract void alimentarse();
            }
            
        Ahora veremos la otra clase abstracta quer seria la clase animal, omitimos la planta debido a que no es una clase abstracta, como podemos observar
        en el ejemplo anterior, se hace de la misma manera, agregamos public, luego abstract seguido de ello agregamos la clase con su respectivo nombre, 
        aqui heredamos a la superior que seria SerVivo, y como se esta sobre escribiendo el nombre del metodo, se le agrega el comando visto en la parte 
        anterior, agregamos public la palabra reservada abstract luego void y el nombre. 

        
        Ahora veremos como llamamos a esos metodos y poder ver como se alimenta cada ser vivo: 

            public static void main(String [] args){
                Planta planta = new Planta();
                AnimalCarnivoro animalC = new AnimalCarnivoro();  
                AnimalHerbivoro animalH = new AnimalHerbivoro();

                planta.alimentarse(); La planta se alimenta a traves de la fotosintesis
                animalC.alimentarse(); El animal carnivoro se alimenta de carne
                animalH.alimentarse(); El animal herbivoro se alimenta de plantas
            }

        Si intentamos llamar a la clase Animal o a la clase SerVivo aparecera un error debido a que son abstractos, entonces para poder ver los resultados,
        llamamos a los metodos que no lo son, y el resultado lo podemos ver plasmado. 
*/

//Polimorfismo
/*
    Son muchas formas que puede tomar un objeto.

    Para entender esto realizaremos un ejemplo: 

        Para este ejemplo tenemos 1 clase padre y 3 clases hijas, la clase padre va a tener 3 argumentos, los cuales son la marca, el modelo y la matricula
        con la palabra reservada protected, esta palabra permite llamar a los atributos de una manera mas facil, realizamos el respectivo constructor y 
        tambien los respectivos guetters, y crearemos un metodo para mostrar los datos.

        Ahora nos iremos con las clases hijas que heredaran estos 3 argumentos (modelo, marca, matricula), y en esta clase agregaremos otro atributo, el 
        cual es el numero de puertas, realizamos el metodo de la herencia, luego agregamos el respectivo constructor incluyendo loas atributos de la herencia
        tambien agregamos el respectivo metodo getter, seguido de ello crearemos un metodo para mostrar los datos.

        Haremos lo mismo con las siguientes 2 clases, pero una tendra un cilindraje y la otra tendra la capacidad que puede cargar, se realizan los 
        constructores junto con los metodos getters, tambien se agregaran los metodos para mostrar los datos, como en todas las clases usamos el mismo nombre
        para mostrar los datos agregamos el comando para sobre escribir los datos.

        Ahora realizaremos el proceso del polimorfismo, nos dirigimos a la clase principal, crearemos una lista de arreglos de nuestra clase padre para 
        mostrar las diferentes opciones: 

            Vehiculo misVehiculos[] = new Vehiculo[4];
        
            misVehiculos[0] = new Vehiculo("GH67", "Ferrari", "A89");
            misVehiculos[1] = new VehiculoTurismo("78HJ", "Audi", "P14", 4);
            misVehiculos[2] = new VehiculoDeportivo("45GH", "Toyota", "KJ8", 500);
            misVehiculos[3] = new VehiculoFurgoneta("JI8", "Toyota", "J9", 2000);

            for (Vehiculo vehiculos : misVehiculos) {
                System.out.println(vehiculos.mostrarDatos());
                System.out.println();
            }

            for (int i =0; i < 4; i++) {
                System.out.println(misVehiculos[i].mostrarDatos());
                System.out.println();
            }

        El primer comando es para crear la lista de arreglos, lo que sigue es para rellenar los campos, para aplicar el polimorfismo, llamamos al nombre 
        de la lista de arreglos, agregamos la posicion que queremos mostrar los datos, y seguido de ello agregamos la palabra new para crear un nuevo vehiculo
        y agregamos el nombre de cada clase con los parametros agregados en dichas clases, por ultimo agregamos un bucle for para mostrar los datos, este 
        es un buble for each, pero con un bucle for tambien funcionaria.
*/

//Conversión ascendente de tipos (upcasting)
/*
    Ir a la gerarquia de clases hacia arriba.
    Cuando un objeto de la clase hija a un objeto de la clase padre o super clase, para hacer ello, lo veremos en un ejemplo.

            VehiculoTurismo miVehiculo = new VehiculoTurismo("GT67", "Ferrari", "A89", 4);

            Vehiculo vehiculo = miVehiculo;

            System.out.println(vehiculo); Herencia.VehiculoTurismo
        
        Primero llamamos a una clase hija, en este caso sera VehiculoTurusmo y le ponemos un nombre miVehiculo, y creamos un nuevo vehiculo y le agregamos 
        los parametros como su marca, modelo, matricula y el numero de puertas, ahora en la segunda linea llamamos a nuestra clase padre y la nombramos de 
        otra manera vehiculo, pero en vez de crear un nuevo vehiculo, lo que hacemos es igualarla al nombre de la clase hija, al imprimir la clase padre, 
        nos informa que se trata de la clase hija. 
*/

//Conversion decendente de tipos (dowcasting)
/*
    Ir a la gerarquia de clases hacia abajo.
    Ahora convertiremos un objeto de la clase padre a un objeto de la clase hija, pero para ello tenemos que crear primero un (upcasting), entonces tenemos
    que hacer una convercion implicita, no es como el anterior ejemplo que era directa, para entender mejor este concepto, haremos un ejemplo: 

            Vehiculo vehiculo = new VehiculoDeportivo("GH89", "Audi", "HI9", 500); 

            VehiculoDeportivo nuevoVehiculo = (VehiculoDeportivo) vehiculo;

            System.out.println(nuevoVehiculo); Herencia.VehiculoDeportivo

    La primera linea es una conversion acendente o upcasting, como ya convertimos nuestro metodo padre en un metodo hijo, ahora si podemos hacer el dowcasting
    para ello llamamos a nuestra clase hija en este caso es VahiculoDeportivo le agregamos un nombre y lo igualamos a un parentesis donde ira el nombre de 
    la clase hija osea VehiculoDeportivo y seguido del parentesis agregamos el nombre de la clase hija, cuando lo imprimimos nos informara que esa clase 
    padre es VehiculoDeportivo.
*/

//Herencia multiple
/*
    Una herencia multiple es heredar los atributos y metodos de mas de una super clase, lo que quiere decir que si tenemos una super clase como persona 
    y esta tiene 2 hijos que son musico y estudiante y creamos otra clase que se llame musicoEstudiante y hereda los atributos y metodos de los 2 hijos de 
    persona, de esta manera se hace una herencia multiple, pero en java no se puede hacer de una manera directa, por lo que veremos las interfaces, para 
    lograr este tipo de herencias.
*/

//Interfaces
/*
    -Permite simular la herencia multiple.
    -La interfaz solo es publica o default. 
    -Todos sus metodos son abstractos.
    -Todos sus atributos son final.

    Ahora entenderemos mejor el tema de las interfaces con un ejemplo.

    Para hacer las interfaces, al momento de crear un archivo como clase, la creamos como interfaz, al crearla de esta manera los metodos serian abstractos,
    entonces seguiremos con el ejemplo anterior, creamos la interfaz Persona, con un metodo llamado hablar, seguido de ello creamos las 2 interfaces hijas,
    que serian Musico con el metodo tocarMusica y Estudiante con el metodo estudiar, ahora creamos la clase MusicoEstudiante, este si seria una clase y para
    poder heredar no agregamos la palabra extends en cambio agregamos la palabra implements y agregamos el nombre de nuestras 2 interfaces seria 
    (Musico, Estudiante), se agrega una coma para agregar la cantidad de interfaces que queremos heredar. 

    En la clase MusicoEstudiante es donde el programa nos pide tener los metodos abstractos y le agregamos el contenido:

            @Override
            public void hablar(){
                System.out.println("Estoy hablando español");
            }

            @Override
            public void tocarMusica(){
                System.out.println("Estoy tocando la guitarra");
            }

            @Override
            public void estudiar(){
                System.out.println("Estoy estudiando");
            }

        Una vez agregado, nos dirigimos a la clase principal, para poder ejecutar nuestros metodos, entonces llamamos a la clase MusicoEstudiante y le ponemos 
        los parametros, quedaria de la siguiente manera:

            MusicoEstudiante musicoE = new MusicoEstudiante();

            musicoE.hablar();
            musicoE.estudiar();
            musicoE.tocarMusica();
*/

//Api
/*
    Conjunto de herramientas que estan integradas en el lenguaje, que pueden usarse para crear mejores aplicaciones, tambien solucionan problemas que 
    haciendo manualmente se demora mas. 

    Si queremos saber mas del tema, podemos buscar en internet api de java y nos aparece la documentacion, con la descripcion de cada caracteristica y uso 
    de java.
*/

//Excepciones
/*
    Son errores que surgen mientras estamos haciendo un programa, como por ejemplo intentar dividir por 0, acceder a un vector fuera de sus limites, ETC.
    Cuando ocurren estos errores la maquina virtual o nuestro entorno de trabajo crea un objeto de la clase excepcion. 
*/

//Jerarquia de excepciones
/*
                            Throwable
                        ________|_________
                       |                  |
                    Exception           Error
               ________|_________
              |                  |
         IOException       RunTimeException

    La rama padre de los errores se llama Throwable, de las cuales tiene 2 hijos las cuales son Error y Exception. 

        Error se refiere a los errores de la computadora, entonces son errores que no podemos solucionar.

        Exception tenemos 2 hijas las cuales son IOExeption y RunTimeException. 

            -IOException: Excepciones Verificadas, esto se refiere a cuando creas un programa para que lea un archivo en la computadora, pero resulta que 
            alguien lo borra por accidente, entonces el programa lo detecta y te informa del error, por lo que te informa que tienes que si o si arreglar
            el problema. 
             
            -RunTimeException: Excepciones no verificadas, este tipo de errores ya son causados por el programador, un ejemplo claro es intentar dividir un numero entre 0, el programa
             nos dira que es un error, por lo que tenemos que corregirlo, a lo que el el programa tiene a hacer que lo ignores, porque lo que si quieres
             lo puedes solucionar o tambien puedes optar por no solucionarlo. 
*/

//Declaracion de las excepciones de un metodo
/*
    Cuando hay una excepcion verificada tenemos 2 opciones: 
        
        -Declaramos la Exepcion. 
        -La capturamos con un try catch.

    Para poder declarar esatas excepciones lo que hacemos es lo siguiente: 

            public void leerArchivo() throws FileNotFoundException {
                File archivo = new File("D:\\prueba\\texto.txt");
                FileReader fr = new FileReader(archivo);
            }

            public void leerArchivo2() throws IOException {
                leerArchivo();
            }
         
        En este ejemplo estamos creando una app que nos lea un archivo y le agregamos la ruta donde esta el archivo que queremos leer, pero nos pasara un 
        error debido a que el archivo solicitado no esta, entonces para que el metodo no nos aparezca como un error, agregamos la palabra reservada 
        (throws) y agregamos el tipo de error que posiblemente se encuentre debido a no encontrar el archivo, en el primer ejemplo nos arroja un error de 
        tipo (FileNotFoundException) y el segundo metodo lo creamos para llamar al primero y este metodo tiene un error de tipo IOException, importamos el 
        error y ya nuestro programa nos detecta que no tenemos ningun error. 
*/

//Try catch para expresiones verificadas 
/*
    Esto se usa para decirle al programa intenta leer el archivo, pero si no lo encuentras enviale este mensaje al usuario, pero sigue con tu aplicativo 
    sin que haya una interrupcion, lo veremos mejor en un ejemplo. 

            public void leerArchivo2(){
                try{ 
                    leerArchivo();
                } catch(FileNotFoundException ex){
                    JOptionPane.showMessageDialog(null, "No se ha encontrado el archivo deseado, por favor verifique la ruta");
                } catch (IOException e){
                    JOptionPane.showMessageDialog(null, "Ha ocurrido una excepcion verificada");
                }
                System.out.println("Programa terminado");
            }

        Tenemos este metodo que se llama leerArchivo2 y queremos leer el ejercicio del ejemplo pasado, pero como sabemos que no existe el archivo porque 
        se elimino entonces implementamos el try catch, en la parte de try agregamos la ruta del metodo que queremos leer, en el catch como parametros
        le ponemos el nombre del error y seguido de ello le agregamos un nombre cualquiera y abrimos llaves para agregar un mensaje de error y el usuario 
        sepa que paso algo inesperado en el programa, si hay varios errores lo que hacemos es agregar otro catch con el nombre del error y agregamos otro 
        nombre, si ejecutamos el programa pasaran 2 cosas, 1 que lea el archivo y nos muestre el contenido del archivo o 2 que nos muestre el mensaje 
        informandonos del error, por ultimo agregamos otro mensaje en consola si queremos. 
*/

//Try catch para expresiones no verificadas 
/*
    Cuando queremos hacer un try catch a expreciones no verificadas, hacemos exactamnete lo mismo que el ejemplo anterior, para entenderlo mejor lo veremos
    en un ejemplo: 

            public void operaciones2(){
                try{
                  operaciones();
                }   catch(ArithmeticException a){
                    JOptionPane.showMessageDialog(null, "Error, ha intentado dividir un numero entre 0");
                }
            }

        Creamos este metodo que se llama operaciones2 y agregamos el try para que intente ejecutar operaciones, este metodo tiene como operacion la division
        de un numero etero entre 0, por lo que en el catch agregamos el nombre del error y agregamos un nombre cualquiera, despues pasamos un mensaje 
        informando que no se puede dividir un numero entero entre 0, y una vez sale del try catch el programa se sigue ejecutando de manera normal.
*/

//Uso del throw para excepciones personalizadas
/*
    El uso de esta herramienta es para crear excepciones que no tiene incluido el programa, por ejemplo crearemos una aplicacion que nos deje introducir 
    numeros, pero si introducimos el 0 nos muestra una excepcion, con un mensaje que queramos, para entenderlo mejor haremos un ejemplo: 

            public class Excepcion0 extends Exception{
    
                public Excepcion0(){
                    super("Se ha introducido el numero 0");
                }
            }

        Creamos una clase que se llama Excepcion0 y como crearemos una excepcion le agregamos la palabra reservada extends, es la misma que usamos para 
        heredar, pero agregamos la palabra Exception, dentro de ella agregamos un constructor y dentro agregamos un mensaje personalizado dentro de 
        la funcion super, ahora veremos que pasa si la llamamos e introducimos el 0. 

        
            public void introducirNumeros() throws Excepcion0{
                Scanner entrada = new Scanner(System.in);

                do {
                    System.out.print("Digite un numero: ");
                    numero = entrada.nextInt();

                    if(numero == 0){ //Quiero que se produzca una excepcion personalizada
                        throw new Excepcion0();
                    }
                } while (numero != 0);
            }

        En nuestra clase principal, crearemos un metodo que se llama introducirNumeros, agregamos el Scanner para poder solicitar datos en la cosnola, 
        creamos un bucle do while donde solicitaremos los numeros y mientras numero sea diferente de 0, dentro de nuestro if decimos que si se introduce 
        el numero 0 nos muestre nuestra excepcion.

        Para mostrar esta excepcion agregamos la palabra reservada (throw) y llamamos a nuestra clase, el programa nos mandara un error y nos dara 2 opciones 
        la primera opcion es agregar un try catch que fue lo que vimos en la seccion pasada y la segunda opcion es decirle al metodo que puede haber una 
        excepcion, esta se agrega con otra paralabra reservada (throws), esta palabra se parecida a la que usamos en nuestro if, pero tienen contextos 
        totalmente diferentes, seguido de ello agregamos el nombre de la excepcion.

        Ahora solo queda imprimir nuestro metodo introducirNumeros en en metodo main y si presionamos el 0, nos mostrara la excepcion y nos motrara la 
        respectiva ruta. 
*/

//Interfaces graficas
//Ventanas (JFrame)
/*
    Para crear una ventana, primero debemos crear una clase que herede a un metodo que se llama (JFrame), seguido de ello agregamos el constructor, seguido
    de ello agregamos la palabra this y llamamos a la funcion setSize, nos pedira el ancho y alto, lo cual podemos agregar, quedaria asi: 

            public class Ventana extends JFrame{
                public Ventana(){
                    this.setSize(1000, 500);//Establecemos el tamaño de la pantalla
                }
            }

        De esta manera se realiza el proceso para crear una ventana, ahora mostraremos el procedimiento junto con un ejemplo para poder llamar y visualizar 
        la ventana creada: 

            public static void main(String[] args) {
                Ventana v1 = new Ventana();

                v1.setVisible(true); //Hacemos visible la ventana
            }

        Estamos en la clase principal y llamamos a nuestra clase ventana, le agregamos un nombre, pero cuando la llamamos le pasamos el siguiente metodo
        (setVisible(true)), le agregamos true ya que de esta manera la podemos visualizar, de manera nativa esta opcion esta en false.    
*/

//Finalizar programa con la X y agregar el titulo a la ventana
/*
    Veremos como hacer para que el programa deje de ejecutarse siempre y cuando le demos a la X y tambien como agregar un titulo a nuestra ventana.
            
            public Ventana(){
                this.setSize(1000, 500);//Establecemos el tamaño de la pantalla
                setDefaultCloseOperation(EXIT_ON_CLOSE); //Cuando cierre la ventana, el programa se cierra automaticamente.
                setTitle("Titulo"); //Agregamos el titulo de la ventana
            }
                
        En nuestra clase de ventana agregamos el metodo (setDefaultCloseOperation) y si leemos la documentacion, como parametro le podemos agregar 
        diferentes opciones, para que nos finalice la ejecucion al darle a la X es (EXIT_ON_CLOSE).
        
        Ahora para agregarle el titulo a nuestra ventana agregamos el metodo (setTitle) y como parametro escribirmos lo que queremos mostrar. 
*/

//Ubicacion de la ventana
/*
    Ahora veremos como ubicar la ventana en algun lado de la pantalla a nuestro gusto, mostraremos el codigo y lo explicaremos: 

            public Ventana(){
                this.setSize(500, 500);//Establecemos el tamaño de la pantalla
                setLocation(300, 150); //Establecemos la posicion inicial de la ventana
                setBounds(300, 150, 500, 500); //Fusion entre setSize y setLocation
                setLocationRelativeTo(null); // Establecemos la ventana en el centro de la pantalla.
                setLocation(300, 150); //Establecemos la posicion inicial de la ventana  
            }

        Con el metodo setLocation, nos pide 2 datos (x, y), en este apartado agregamos las coordenadas de la ventana y cuando ejecutemos el programa esta 
        aparecera en dicha ubicacion, hay una manera de fusionar el tamaño y la localizacion de la ventana, para ello agregamos el metodo (setBounds), en 
        esta nos pedira primero las coordenadas de la ventana en la pantalla y luego nos pedira las medidas de ancho y alto de la ventana. 
        
        Para hacer que nuestra ventana siempre aparezca en el centro de cualquier pantalla se usa el metodo (setLocationRelativeTo(null)), seagrega null 
        como parametro y de esta manera la ventana queda centrada, en ese orden de ideas omitiriamos usar setLocation y setBound.
*/

//Bloquear dimension de la ventana, agregar un color de fondo, establecer un tamaño minimo a la ventana
/*
    Para poder bloquear la dimension de la ventana agregamos el siguiente metodo (setResizable(false)), este metodo esta como true por defecto, pero si le
    agregamos false, el usuario no puede modificar el tamaño de la ventana.

    Para agregar un color de fondo en nuestra ventana, necesitamos agregar el siguiente metodo (this.getContentPane().setBackground(Color.YELLOW)), primero
    agregamos el metodo this y llamamos a getContentPane, seguido de ello agregamos un punto y llamamos el metodo para agregar el color de fondo el cual 
    es setBackground y como parametros agregamos la palabra reservada (Color), un punto y agregamos el color deseado.

    Para configurar la ventana para que tenga un tamaño minimo tenemos que agregar el metodo (setMinimumSize(new Dimension(200, 200))), cuando llamamos 
    este metodo nos pedira un parametro, entonces creamos una dimension y le pasamos el anchoy alto de nuestra pantalla minima, esto sirve para cuando el 
    usuario pueda modificar el tamaño de la ventana solo tenga un tamaño minimo, el codigo quedaria de la siguiente manera: 

            public Ventana(){
                setResizable(false); //Bloquear la dimension de la ventana
                setMinimumSize(new Dimension(200, 200)); //Tamaño minimo de la ventana
                this.getContentPane().setBackground(Color.YELLOW); //Establecer color de fondo
            }
*/

//Creacion de panel
/*
    Un panel es lo que estara sobre la ventana y donde podemos agregar todas las funcionalidades, como botones, imagenes, ETC, ahora mostraremos como 
    crear un panel, ponerlo sobre la ventana y luego darle un color:

            private void iniciarComponentes(){
                JPanel panel = new JPanel();

                this.getContentPane().add(panel); //Agregamos el panel a la ventana
                panel.setBackground(Color.pink); // Establecemos el color del panel 
            }

        Para que quede todo mas organizado creamos un nuevo metodo el cual se llama iniciarComponentes, para poder crear un panel agregamos el siguiente 
        metodo (JPanel), le agregamos un nombre y creamos un nuevo panel, para agregarlo sobre la ventana agregamos this y con un punto llamamos al 
        metodo (getContentPane().add(panel), seguido del metodo lo añadimos y como parametro le agregamos el nombre del panel creado, para darle color a 
        nuetro panel, llamamos al panel con el nombre establecido le ponemos el punto para llamar al metodo y agregamos el metodo del color, lo unico que
        nos falta es llamar al metodo creado del panel dentro de nuesta ventana y estaria listo el entorno de trabajo. 
*/

//Creacion de etiquetas
/*
    Se pueden agregar 2 tipos de etiquetas, serian los Strings que son etiquetas de texto y la otra son imagenes, en este apartado veremos como ingresar
    un texto, como modificarlo y moverlo dentro del panel.

            private void iniciarComponentes(){
                JPanel panel = new JPanel();
                this.getContentPane().add(panel);

                JLabel etiqueta = new JLabel(); //Creamos una etiqueta
                etiqueta.setText("Hola mundo"); //Establecemos el texto de la etiqueta
                panel.setLayout(null); //Desactivamos parametros de ubicacion por defecto
                etiqueta.setBounds(10, 10, 60, 10);
                panel.add(etiqueta); //Agregamos la etiqueta al panel   
            }

        Explicaremos mejor este ejemplo, las 2 primeras lineas es lo mismo que vimos en el ejemplo pasado, primero crearemos una etiqueta de texto, para 
        ello agregamos el metodo (JLabel) le agregamos un nombre y creamos un nuevo JLabel. 

        Ahora vamos a imprimir el texto dentro de la etiqueta, llamamos al nombre de la etiqueta agregamos el punto y pasamos el metodo (setText), como 
        parametro agregamos el texto que queremos imprimir. 
 
        Para modificar la ubicacion de nuestro texto necesitamos deshablidar la ubicacion por defecto que tiene el panel, para ello llamamos al panel y le
        pasamos el parametro (setLayaut) y como parametro le agregamos null, de esta manera nuestro texto se ira a la ubicacion (0, 0).
         
        El texto creado lo queremos agregar en una coordenada para que no quede centrado, para ello llamamos a nuestra etiqueta y le agregamos el metodo 
        setBound, ete metodo ya lo habiamos visto, los parametros son las coordenadas y seguido de ello el tamaño que ocuara el texto, tanto el alto como 
        el ancho (x, y, width, height).

        Por ultimo nos queda agregar la etiqueta a nuestro panel, ya que si no la agregamos el programa no lo visualizara, para ello llamamos a nuestro 
        panel y le agregamos el metodo add y como parametro le ponemos la etiqueta.
*/

//Cambiar el color de letra y el fondo
/*
    Para poder cambiar el color de la letra haremos lo siguiente: 
        
            private void iniciarComponentes(){
                etiqueta.setForeground(Color.WHITE); //Color de letras
                etiqueta.setOpaque(true); // Desactivamos la configuracion por defecto de la etiqueta
                etiqueta.setBackground(Color.BLACK);
            }

        En este ejemplo omitiremos lo que vimos anteriormente y solo tendremos en el codigo lo necesario para cambiar el color de la letra y el fondo de 
        la etiqueta, para cambiar el coor de la letra llamamos a la etiqueta y le pasamos como parametro (setForeground) y como parametro agregamos la 
        palabra reservada (Color) y le pasamos el color seguido de un punto.
        
        Ahora para agregarle color al fondo de la etiqueta primero tenemos que desactivar una opcion que tiene por defecto, esta opcion dice que el color
        de fondo de las etiquetas es transparente, por lo que llamamos a la etiqueta y llamamos al metodo (setOpaque) y como parametro le agregamos true
        de esta manera ya solo nos queda ingresar el color de fondo, de la misma manera que lo hicimos con la ventana o con el panel que es llamando a 
        la etiqueta y como parametro le agregamos (setBackground) y como parametros le agregamos el color. 
*/

//Cambiar ubicacion del texto
/*
    Para cambiar la ubicacion del texto lo podemos hacer de 2 maneras, la primera es dentro del parametro de la creacion del texto o se puede hacer de 
    manera independiente, veremos las 2 formas de hacerlo:

            JLabel etiqueta = new JLabel("Hola mundo",SwingConstants.CENTER);

        La primera es dentro de nuestra creacion de etiqueta, en los parametros de JLabel, agregamos como primer parametro el texto que queremos mostrar, 
        de segundo parametro agregamos el siguiente metodo (SwingConstants.CENTER), con este metodo agregamos la direccion donde queremos dejar el texto
        esta alineacion solo es de manera horizontal, ahora lo veremos de una manera independiente. 

            etiqueta.setHorizontalAlignment(SwingConstants.CENTER);

        De la segunda manera llamamos a nuestra etiqueta y llamamos al metodo (setHorizontalAligment) y como parametro agregamos lo mismo que en la pasada
        (SwingConstants.CENTER) y de esta manera quedaria centrado de una forma independiente.
*/

//Modificar la fuente del texto
/*
    Para poder modificar el tipo de letra necesitamos llamar a nuestra etiqueta, luego llamamos al metodo (setFont) y como parametro creamos un nuevo Font
    entro de este Font le agregamos los siguientes parametros (tipo de letra, estilo de letra, tamaño), para el tipo de letra podemos agregar los mismos
    tipos de letra que tenemos en el aplicativo de (WORD).
            
            etiqueta.setFont(new Font("Chiller",Font.ITALIC, 20)); //Establecemos la fuente 

        Podemos establecer el estilo de la letra de 2 maneras, la primera como esta en el ejemplo que llamamos a Font y el metodo seria el tipo de letra 
        en este caso es cursiva, pero se puede poner en negrilla, ETC. 

            etiqueta.setFont(new Font("Chiller",(0-1-2-3), 20));

        El estilo de fuente se puede modificar de manera numerica y nos evitamos en agregar nuevamente el Font, para ello podemos agregar un numero de 0 a 
        3, el 0 es letra normal, el 1 es negrilla o BOLD, 2 es cursiva o ITALIC y 3 es negrilla y cursiva. 
*/

//Etiqueta tipo imagen
/*
    Para poder ingresar imagenes necesitamos primero crear una carpeta en la seccion de files o simplemente arrastrar la imagen a la carpeta donde estas 
    trabajando, luego de ello vamos a crear otro Label, le agregamos el nombre deseado y cuando lo creamos como parametro le agregamos el siguiente metodo
    (new ImageIcon) y como parametro agregamos la ruta de la imagen, si esta en una carpeta agregamos el nombre de la carpeta, luego un slash y por ultimo
    el nombre de la imagen con su extencion. 

            JLabel etiqueta2 = new JLabel(new ImageIcon("images/balon.png"));
            etiqueta2.setBounds(10, 80, 400, 400);
            panel.add(etiqueta2);

        Haremos el procedimiento con las caracteristicas, aqui podemos ver como esta creado el nuevo Label, luego agregaremos la ubicacion de la imagen con
        su respectivo tamaño, este tamaño es de la etiqueta mas no es el tamaño de la imagen, por ultimo solo nos queda agregar la etiqueta al panel. 
*/

//Tamaño de la imagen
/*
    Para modificar el tamaño de una imagen tenemos que hacer un proceso algo extenso, pero no es complicado primero mostraremos el ejemplo y explicaremos 
    el paso a paso.

            etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(), Image.SCALE_SMOOTH)));

        Primero llamamos a nuestra etiqueta (etiqueta2), agregamos el metodo (setIcon) y como parametro creamos un icono (new ImageIcon), como 
        parametro llamamos a la imagen y el parametro seria obtener imagen (getImage), volvemos a llamar otro metodo el cual se usa para escalar nuestra 
        imagen (getScaledInstance) los parametros son el ancho, alto y el tipo de escalado (width, height, scale), para agregar el escalado tenemos que 
        llamar al metodo (Image) y tenemos varias opciones para scalar las cuales podemos observar, es recomentable usar un escalado suave.

        Para evitar estar cambiando el ancho y el alto de nuestra seccion de escalado podemos hacer lo siguiente, llamamos la etiqueta que queremos cambiar
        y le pasamos el metodo getWidth y getHeight, cada uno para su respectivo ancho y alto, de esta manera si modificamos el tamaño de la etiqueta imagen
        se escala la imagen tambien.
*/

//Crear un boton
/*
    Para crear un boton haremos el mismo proceso que el ejemplo pasado, mostramos el ejemplo y se explica paso a paso: 

            JButton boton1 = new JButton();
        
            boton1.setBounds(100, 100, 100, 40); //Posicion del boton y tamaño
            boton1.setText("Click"); //Establecemos un texto al boton
            boton1.setEnabled(true); //habilitar o deshabilitar botones
            boton1.setMnemonic('a'); //Establecemos alt + letra

            panel.add(boton1);

        Primero creamos el boton, para crearlo agregamos el metodo (JButton), le ponemos un nombre (boton1) y se crea el boton (new JButton).

        Tenemos que crear la posicion de nuestro boton junto con el tamaño deseado, para esto llamamos al boton y le pasamos el parametro (setBounds), le 
        pasamos los parametros y quedaria posicionado. 

        Podemos agregarle texto a nuestro boton, llamamos al boton y le pasamos el parametro (setText) y agregamos el texto deseado.

        Si queremos deshabilitar el boton para que no puedan usarlo, vamos a llamar a nuestro boton y le pasamos el metodo (setEnabled) y el parametro es 
        false, para activarlo nuevamente lo pasamos a true. 

        Para hacer click al boton sin hacer uso del mouse si no con un comando del teclado usaremos el siguiente metodo, llamamos al boton y le agregamos 
        el metodo (setMnemonic) y atretamos la letra dentro de comillas simples. 

        Por ultimo solo nos queda importar nuestro boton en el panel, para ello llamamos al panel y lo añadimos (panel.add(boton1)) lo que nos queda es 
        ejecutar la app y quedaria todo listo para usar.
*/

//Fuente y color de la letra de un boton.
/*
    Para agregarle color a la letra de un boton, tenemos que llamar al boton, seguido de ello le pasamos el metodo (setForeground) y agregamos el color
    deseado, quedaria de la siguiente manera: 

            boton1.setForeground(Color.BLUE);

    Para modificar la fuente del texto llamamos a nuestro boton, le pasamos el metodo (setFont) y creamos un nuevo font, le pasamos los parametros al nuevo 
    font como el tipo de letra, el grosor y el tamaño y de esta manera quedaria modificado el tamaño de nuestra letra del boton 
            
             boton1.setFont(new Font("cooper black", Font.BOLD, 20));
*/

//Color de fondo y ingreso de imagenes a un boton
/*
    Para agregar el color de fondo en un boton, lo que tenemos que hacer es llamar a nuestro boton, para este ejemplo creamos otro boton con el nombre 
    (boton2)y pasarle el metodo (setBackground), como parametros le agregamos el color, quedaria de la siguiente manera: 

            boton2.setBackground(Color.blue);

    Ahora veremos como agregar una imagen al boton, para agregar una imagen llamamos al metodo (ImageIcon) le agregamos un nombre y terminamos de crear el 
    metodo.

    Ahora para poder ingresaruna imagen realizamos el siguiente paso a paso: 

        -llamamos a nuestro boton y le pasamos el metodo (setIcon).
        -llamamos a ImageIcon y los parametros son el nombre del metodo anterior y le pasamos el metodo (getImage).
        -Agregamos el metodo para escalar el cual es (getScaledInstance) y le pasamos los parametros los cuales son el (ancho, alto, tipo de escalado)
        -tambien lo podemos ajustar al tamaño de nuestro boton, llamano a nuestro boton y agregando el metodo getWidth y getHeight

            boton2.setIcon(new ImageIcon(clickAqui.getImage().getScaledInstance(boton2.getWidth(), boton2.getHeight(), Image.SCALE_SMOOTH)));
*/

//Borde de un boton
/*
    Para la creacion de bordes, lo mostraremos con otro boton, entonces el nombre de este es (boton3), primero mostraremos el ejemplo y luego lo explicamos 
            
            boton3.setBorder(BorderFactory.createLineBorder(Color.GREEN, 4, true));

        -Primero llamamos a nuestro boton.
        -Luego le pasamos el metodo (setBorder) y agregamos la extencion.
        -Llamamos a la clase (BorderFactory) y se le pasa el metodo (createLineBorder).
        -Existen 3 metodos para crear bordes, lo que cambia entre uno y otro es el tipo de parametros, el primero solo tiene el parametro de color, el 
        segundo tiene el parametro de color y ancho del borde, el ultimo tiene color, ancho y si quiere la puntas redondeadas o no. 
*/

//Radio botones o boton de opciones
/*
    Le damos un listado al usuario con opciones y el usuario escoge la opcion deseada. 

    Para crear este tipo de botones lo que tenemos que hacer es llamar a la clase (JRadioButton), le agregamos un nombre y terminamos de crear la clase, le 
    podemos pasar parametros, tambien si queremos que la casilla este o no marcada, quedaria de la siguiente manera: 

            JRadioButton radioBoton1 = new JRadioButton("Opcion 1", true);

    Para posicionar estos radio botones, son de la misma manera que lo vimos en los ejemplos pasados, podemos usar varias cosas vistas anteriormente como 
    modificar las letras, agregar un texto por separado para no agregarlo en los parametros de la creacion de la clase.

    Podemos deshabilitar una de las opciones con el siguiente metodo, llamamos al boton y llamamos al metodo (setEnabled)si se agrega true, el boton puede 
    ser usado, pero si agregamos false el boton se pone en color gris y no se permite usar. 

    Como ya vimos la creacion de los radio botones, ahora veremos como hacer un conjunto de radio botones, esto nos sirve para cuando tenemos mas opciones
    y marcamos una de ellas, las otras automaticamente se desmarcaran, para ello llamamos una clase (ButtonGroup), le agregamos un nombre y solo nos queda
    terminar de llamar la clase.
     
    Para agruparlos solo basta con llamar a nuestra clase creada y añadimos la lista de botones, quedaria de esta manera: 

            ButtonGroup grupoRadioBotones = new ButtonGroup();
            grupoRadioBotones.add(radioBoton1);
            grupoRadioBotones.add(radioBoton2);
            grupoRadioBotones.add(radioBoton3);
*/

//Botones de activacion
/*
    Este tipo de botones se usan para dejar marcada una opcion y si le damos click nuevamente esta opcion se desmarca, se hace de una manera similar a la 
    leccion anterior.

    Para crear estos botones lo que necesitamos es llamar a la siguiente clase (JToggleButton) le pasamos un nombre, como parametro le podemos agregar un 
    texto, si le agregamos un true el boton quedara seleccionado de manera automatica, quedaria de la siguiente manera: 

            JToggleButton botonActivacion1 = new JToggleButton("Opcion 1", true);       
            botonActivacion1.setBounds(50, 100, 100, 40);
            panel.add(botonActivacion1);

    Tambien agregamos el posicionamiento de nuestro boton y lo agregamos al panel, ahora veremos como hacer para que todos los bonotes no se puedan oprimir 
    para ello agregamos una clase llamada (ButtonGroup) y le agregamos un nombre, una vez terminada la clase, llamamos a esa clase con el nombre que le 
    dimos y añadimos los botones creados: 

            ButtonGroup grupoBotonesActivacion = new ButtonGroup();
            grupoBotonesActivacion.add(botonActivacion1);
            grupoBotonesActivacion.add(botonActivacion2);
            grupoBotonesActivacion.add(botonActivacion3);
*/

//Crear una caja de texto
/*
    Las cajas de texto se usan para cuando hacemos formularios y se le pide una informacion a la persona, para crear una caja de texto se usa la siguiente 
    clase (JTextField), seguido de ello le agregamos un nombre y terminamos de crear la clase, no le pasamos ningun parametro.

    La ubicamos de la misma manera y tambien podemos añadir un texto predeterminado a la caja con el siguiente metodo (setText), solo nos falta añadir la
    caja al panel y quedaria de la siguiente manera: 

            JTextField cajaTexto = new JTextField();
            cajaTexto.setBounds(50, 50, 100, 30);
            cajaTexto.setText("Hola...");
            panel.add(cajaTexto);
*/

//Crear areas de texto
/*
    Para crear un area de texto usaremos la clase llamada (JTextArea) le agregamos un nombre, aqui tambien tenemos que cuadrar la ubicacion de nuestra aera
    y tambien el tamaño de nuestra aera, podemos escribir un texto por defecto con el metodo (setText), otro metodo util es este (append), este nos sirve 
    para poder agregar mas texto sin reemplazar el que ya escribimos inicialmente, podemos bloquear el area de texto para que no sea modificado con este 
    metodo (setEditable), si le pasamos como parametro false, ya no se puede modificar, pero si el programa lo deja en true por defecto para poder hacer 
    uso de esta area de texto, lo que nos queda es añadirlo al panel y quedaria de la siguiente manera: 

            JTextArea areaTexto = new JTextArea();
            areaTexto.setBounds(20, 20, 300, 200);
            areaTexto.setText("Hola");
            areaTexto.append("\nEscribe por aqui");//Añade mas texto al area
            areaTexto.setEditable(true);//Permitir o no edutar el contenido
            panel.add(areaTexto);
*/

//Barras de desplazamiento para el area de texto.
/*
    Estas barras de desplazamiento son para el area de texto, estas se usan para cuando un usuario agrega mucho texto y se desborda de nuestra aera, nos 
    agregue una barra de desplazamiento y nos permita visualizar todo el contenido escrito, para ello necetamos llamar a una clase (JScrollPane), la 
    agregamos un nombre y terminar de crear la clase, en el parametro escribimos a que le queremos agregar las barras, seguido de ello tenemos que agregar
    la misma area y ubicacion del area de texto, para finalizar agregarmos la barra al panel, quedaria asi: 

            JScrollPane barrasDesplazamiento = new JScrollPane(areaTexto);
            barrasDesplazamiento.setBounds(20, 20, 300, 200);
            JScrollBar ScrollPaneConstants;
            panel.add(barrasDesplazamiento);
*/

//Crear casillas de verificacion
/*
    Para crear las casillas de verificacion llamamos a la clase (JCheckBox), le agregamos un nombre y despues terminamos de crear la clase, como parametros 
    le agregamos el contenido que tendra y luego si queremos que este marcado o no, con true o false, luego agregamos la posicion de nuestro check box y 
    por ultimo lo agregamos al panel quedaria de la siguiente manera: 

            JCheckBox casillaVerificacion1 = new JCheckBox("Leche", true);
            casillaVerificacion1.setBounds(20, 20, 100, 40);
            panel.add(casillaVerificacion1);
*/

//Crear listas desplegables
/*
    Para crear una lista desplegable, llamaremos a la clase (JComboBox), pero antes de crearla necesitamos un arreglo de objetos, para este ejemplo 
    crearemos una lista de paises: 

            String paises[] = {"Peru", "Colombia", "Paraguay", "Ecuador"};

    Una vez tenemos nuestro arreglo de objetos, agregamos el nombre de la lista dentro de los parametros de nuestra clase [JComboBox), solo nos queda 
    agregar la ubicacion de nuestra y añadirlo: 

            JComboBox listaDesplegable = new JComboBox(paises);
            listaDesplegable.setBounds(20, 20, 100, 30);
            panel.add(listaDesplegable);

    Hay unos metodos usados con frecuencia los cuales son los siguientes: 

            listaDesplegable.addItem("Mexico"); //Agregar mas datos.
            listaDesplegable.setSelectedItem("Ecuador"); //Seleccionar el primer objeto

    El primero nos ayuda a agregar otro dato a nuestro arreglo de objetos, solo se llama a la clase con el nombre que le pusimos y el usamos el metodo 
    (addItem) y como parametro agregamos el texto que queremos agregar.

    El segundo nos ayuda a establecer el dato a mostrar antes de usar la lista, entonces llamamos a la clase y le pasamos el metodo (setSelectedItem) en el 
    cual podemos agregar el nombre que queremos mostrar siempre y cuando este en el arreglo o tambien podemos llamar al arreglo y poner la posicion que 
    queremos mostrar. 
*/

//Usar modelos dentro de las listas desplegables.
/*
    Para explicar mejor esta parte primero compartire el codigo y lo explicare paso a paso: 

            Persona persona1 = new Persona("Harold Sanchez", 24, "Colombiano");
            Persona persona2 = new Persona("Tania Bustamante", 20, "Argentina");

            DefaultComboBoxModel modelo = new DefaultComboBoxModel();
            JComboBox listaDesplegable = new JComboBox(modelo);

            modelo.addElement(persona1);
            modelo.addElement(persona2);

            listaDesplegable.setBounds(20, 20, 200, 30);
            panel.add(listaDesplegable);

        Para este ejemplo explicaremos como se creo todo:

        -Traemos a la clase (JcomboBox) y le agregamos un nombre. 
        -Luego llamamos otra clase que se llama (DefaultComboBoxModel) y tambien le agregamos un nombre, esta clase se incorpora dentro de la clase 
        anterior, entonces el parametro de (JcomboBox) es (modelo).
        -Agregamos la ubicacion de nuestra lista desplegable.
        -Añadimos la lista al panel. 
        -Para este ejemplo crearemos una clase que se llama (Persona) en la cual tiene como parametros (nombre, edad, nacionalidad), agregamos el 
        constructor y los setters y getters.
        -Vamos al archivo principal y creamos 2 personas con sus respectivos datos.
        -Por ultimo llamamos al modelo y añadimos las personas con el metodo (addElement).
        -De esta manera queda importado, pero no nos mostrara los datos si no agregamos una clase toString en la clase persona, una ves agregado ya nos 
        muestra los datos.
*/

//Crear campo de contraseña
/*
    Para crear un campo de contraseña necesitamos la clase (JPasswordField) le agregamos un nombre, una vez finalizado podemos agregarle como parametro 
    una contraseña por defecto, tambien tenemos que agregar las coordenadas de nuestro cuadro de texto y añadirlo al panel:

            JPasswordField campoContraseña = new JPasswordField();
            campoContraseña.setText("Programacion");
            campoContraseña.setBounds(20, 20, 150, 30);
            panel.add(campoContraseña);

    Para poder visualizar la contraseña necesitamos hacer otro proceso, primero creamos un String vacio, seguido de ello hacemos un bucle for para recorrer
    nuestro arreglo de String y hacemos una suma iterativa con la contraseña, pasandole el metodo para mostrar contraseña y con el arreglo iterativo, por 
    ultimo solo nos queda imprimir, quedaria de la siguiente manera: 

            String contraseña = "";
            for(int i=0; i<campoContraseña.getPassword().length;i++){
                contraseña += campoContraseña.getPassword()[i];
            }
            System.out.println("Contraseña: " + contraseña);
*/

//Crear tablas
/*
    Para entender esta parte primero agregaremos el ejemplo y explicaremos paso a paso que se hizo. 

            DefaultTableModel modelo = new DefaultTableModel();
        
            modelo.addColumn("Nombre");
            modelo.addColumn("Edad");
            modelo.addColumn("Nacionalidad");

            String persona1[] = {"Alejandro", "21", "Peruano"};
            String persona2[] = {"Rosa", "22", "Mexicana"};
            String persona3[] = {"Harold", "24", "Colombiano"};

            modelo.addRow(persona1);
            modelo.addRow(persona2);
            modelo.addRow(persona3);     

            JTable tabla = new JTable(modelo);
            tabla.setBounds(20, 20, 300, 200);
            panel.add(tabla);

            JScrollPane scroll = new JScrollPane(tabla);
            scroll.setBounds(20, 20, 300, 200);
            panel.add(scroll);

        -Llamamos a la clase (JTable), en la cual le agregaremos un nombre, seguido de ello agregamos la ubicacion y la añadimos al panel.
        -Llamamos a la clase (DefaultTableModel) con su respectivo nombre, a la clase (JTable) le pasamos como parametro a modelo, debido a que a partir 
        de modelo crearemos las filas y las columnas.
        -Para rellenar nuestra tabla primero llamamos las columnas, traemos al modelo y le pasamos el metodo (addColumn) y agregamos los enunciados.
        -Para rellenar las filas primero creamos unos arreglos con los parametros que pusimos en las columnas y los añadimos con el metodo (addRow).
        -Para poder visualizar nuestra tabla tenemos que crear un scroll, para ello llamamos a la clase (JScrollPane) le damos un nombre, le pasamos el 
        parametro de tabla y agregamos la ubicacion que es la misma que la tabla y la añadimos al panel.
*/

//Crear listas
/*
    Haremos lo mismo que el ejemplo pasado, pondremos primero el ejemplo y explicaremos paso a paso lo que realizamos: 

            DefaultListModel modelo = new DefaultListModel();
        
            modelo.addElement(new Persona("Harold Sanchez", 24, "Colombiano"));
            modelo.addElement(new Persona("Maria Paula", 22, "Colombiana"));
            modelo.addElement(new Persona("Cristian Moreno", 23, "Mexicano"));

            JList lista = new JList(modelo);
            lista.setBounds(20, 20, 200, 300);
            panel.add(lista);

            JScrollPane scroll = new JScrollPane(lista);
            scroll.setBounds(20, 20, 200, 300);
            panel.add(scroll);

        -Llamamos a nuestra clase (JList) para crear la lista con su respectivo nombre, luego agregamos la ubicacion y la añadimos a nuestro panel.
        -Llamamos a otra clase que se llama (DefaultListModel) con su respectivo nombre. 
        -A la clase (JList) nos falto agregar el parametro, el cual se le agrega el nombre de (DefaultListModel).
        -Para empezar a agregar datos a la lista llamamos al modelo y le pasamos el parametro (addElement), como parametro agregamos la clase persona 
        que ya habiamos creado anteriormente con los datos (nombre, edad, nacionalidad).
        -Por ultimo crearemos el Scroll y quedaria nuesta lista.
*/

//Eventos - Oyente de accion
/*
    Los eventos se usan para programar una accion determinada, para entender esta parte lo haremos con un boton, vamos a compartir el ejemplo y lo 
    explicamos.

            ActionListener oyenteDeAccion = new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent ae) {
                    saludo.setText("Hola " + cajaTexto.getText());
                }
            };
            boton.addActionListener(oyenteDeAccion);

        -Primero llamamos a nuestro boton y le pasamos el siguiente metodo (addActionListener).
        -Luego llamamos a una clase que se llama (ActionListener), le agregamos un nombre y al terminar de crear la clase nos aparecera un error, el 
        aplicativo nos dira que tenemos que ingresar unas acciones extra.
        -El aplicativo agregara una clase anonima, esta clase se encarga de hacer la funcion del boton el nombre es(actionPerformed) y como parametro 
        tiene (ActionEvent ae).
        -En esta clase anonima llamamos a saludo y le pasamos el metodo (setText) dentro agregamos lo que queremos mostrar, en el ejemplo imprimimos un 
        mensaje y concatenamos lo que tiene dentro la caja de texto.
*/

//Eventos - Oyente de raton
/*
    Los eventos de raton, son los eventos como hacer click dentro y fuera de un lugar, entrar o salir del lugar, lo veremos con mas profundidad y como 
    lo podemos implementar, primero compartire el ejemplo y luego dare la explicacion.

            MouseListener oyenteDeRaton = new MouseListener() {
            
                @Override
                public void mouseClicked(MouseEvent e) {
                    areaTexto.append("mouseClicked\n"); //Presionar y soltar
                }

                @Override
                public void mousePressed(MouseEvent e) {
                    areaTexto.append("mousePressed\n"); //Presionar
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                    areaTexto.append("mouseReleased\n"); //Presiono y suelto afuera
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    areaTexto.append("mouseEntered\n"); //Dentro del area
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    areaTexto.append("mouseExited\n"); //Fuera del area
                }
            };
            boton.addMouseListener(oyenteDeRaton);

        -Llamamos el lugar para usar la accion del mouse, en este caso es el boton, luego le pasamos el metodo (addMouseListener).
        -Como es una interface llamamos a la clase (MouseListener) y le agregamos un nombre, al finalizar la clase el aplicativo nos mostrara un error, por
        lo que tenemos que importar la extencion.
        -El programa nos agrega todos los metodos que tiene el mouse, dentro de cada evento agregamos la accion que queremos realizar, para este ejemplo 
        solo queremos mostrar que hace cada accion. 
        -Por ultimo nos queda agregar el parametro al metodo (addMouseListener) el metodo que le agregamos es de la clase creada.
*/

//Diferentes metodos de los eventos de raton
/*
    Cuando hacemos click podemos agregar metodos para hacer varias cosas, mostraremos el ejemplo y lo explicaremos:

            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.isAltDown()){
                    areaTexto.append("Alt\n");
                } else if(e.isControlDown()){
                    areaTexto.append("CTL\n");
                } else if(e.isShiftDown()){
                    areaTexto.append("Shift\n");
                } else if(e.isMetaDown()){
                    areaTexto.append("Click derecho\n");
                } else {
                    areaTexto.append("Click izquierdo\n");
                }
                
                if(e.getClickCount() == 2){
                    areaTexto.append("Doble Click\n");
                }
            }

        Este ejemplo es parte del ejercicio pasado.
        -En los parametros hay dos textos uno que dice (MouseEvent) y el otro es una (e), aqui haremos una condicional y llamaremos al segundo parametro.
        -Llamamos a la (e) y agregamos el metodo (isAltDown) este quiere decir que si hacemos click junto con Alt este imprimira Alt.
        -Con (isControlDown) nos imprimira CTL si le damos a CTL junto al click.
        -Con (isShiftDown) nos imprimira Shift si le damos a Shidt junto con el click.
        -Con (isMetaDown) nos imprimira que dimos click derecho si hicimos click con el boton derecho.
        -La segundo condicional llama a (e) le pasa el metodo (getClickCount) y lo iguala a 2, quiere decir que si hacemos 2 clicks nos imprimira Doble Click.   
*/

//Oyente del movimiento del raton
/*
    Este tipo de oyente son 2 tipos de acciones, uno es cuando movemos el mouse y el siguiente es cuando tenemos precionado el click izquierdo y movemos 
    el mouse, veremos el codigo para entenderlo mejor:

            private void eventoDeMovimientoRaton(){
                MouseMotionListener oyenteMovimientoRaton = new MouseMotionListener() {

                    @Override
                    public void mouseDragged(MouseEvent e) {
                        areaTexto.append("mouseDragged\n");//Mover el mouse con el click mantenido
                    }

                    @Override
                    public void mouseMoved(MouseEvent e) {
                        areaTexto.append("mouseMoved\n");//Mover el mouse sin uso del click
                    }
                };
                panel.addMouseMotionListener(oyenteMovimientoRaton);
            }

        Para este ejemplo queremos que si movemos el mouse dentro de del panel ya empiece a contar las acciones, por eso llamaremos al panel para hacer 
        este ejemplo. 

        -Llamamos al panel y le pasamos el metodo (addMouseMotionListener).
        -Luego llamamos a la clase (MouseMotionListener) y le agregamos un nombre, cuando terminemos de crear la clase nos arrojada un error, por lo que 
        el programa nos desplegara los 2 metodos que tiene esta clase.
        -El primero metodo es para cuando movemos el raton con el click mantenido. 
        -El segundo metodo es para cuando moevemos el raton sin hacer uso del click.
        -Por ultimo agregamos el nombre de la clase dentro del parametro de (addMouseMotionListener) de esta manera hacemos uso del movimiento del raton.
*/

//Eventos - Oyente de la rueda del raton
/*
    Este tipo de eventos es para saber si hemos girado el raton, pero tambien mostraremos si giramos hacia arriba o hacia abajo, compartiremos el ejemplo
    y lo explicaremos paso a paso. 

            private void eventoRuedaDelRaton(){
                MouseWheelListener ruedaRaton = new MouseWheelListener() {

                    @Override
                    public void mouseWheelMoved(MouseWheelEvent e) {
                        if(e.getPreciseWheelRotation() == -1){
                            areaTexto.append("Rueda hacia arriba\n");
                        }   else if(e.getPreciseWheelRotation() == 1){
                            areaTexto.append("Rueda hacia abajo\n");
                        }
                    }

                };
                panel.addMouseWheelListener(ruedaRaton);
            }

        Este ejemplo tambien se hizo dentro del panel.
        -Llamamos al panel y agregamos el metodo (addMouseWheelListener).
        -Luego llamamos a la clase (MouseWheelListener) y le agregamos un nombre, al finalizar la clase nos mostrara un error, por lo que el programa nos
        arrojara el metodo de esta clase, de esta manera ya solo nos queda imprimir un texto, pero mostraremos otro metodo para indicar si esta moviendo 
        la rueda del rato hacia abajo o hacia arriba.
        -Para ello tomamos el segundo parametro de la clase la cual es (e) y le pasamos el metodo (getOreciseWheelRotation) y la igualamos a -1, de esta 
        manera la rueda va para arriba.
        -Para saber si esta girando hacia abajo, hacemos el mismo proceso, llamamos al segundo parametro de la clase y le pasamos el mismo metodo pero lo 
        igualamos a 1 y de esta manera nos dira que la rueda esta siendo girada para abajo.
        -Solo queda ingresar el nombre de la clase dentro del metodo creado inicialmente (addMouseWheelListener).
*/

//Eventos - Teclado
/*
    Estos eventos se usan para darle funcionalidades a las teclas, primero compartire el ejemplo y se explicada paso a paso: 

            KeyListener eventoTeclado = new KeyListener() {
                @Override
                public void keyTyped(KeyEvent e) {
                    areaTexto.append("keyTyped\n"); //Cuando presionamos una tecla diferente de a-z y 0-9
                }

                @Override
                public void keyPressed(KeyEvent e) {
                    areaTexto.append("keyPressed\n"); //Presionamos una tecla
                }

                @Override
                public void keyReleased(KeyEvent e) {
                    areaTexto.append("keyReleased\n"); //Presionar y soltar
                }
            };

            cajaTexto.addKeyListener(eventoTeclado);

        -Primero llamamos a caja de texto ya que es donde aplicaremos estos eventos y le pasamos el metodo (addKeyListener).
        -Luego llamamos a la clase (KeyListener) le agregamos un nombre y finalizamos la creacion de la clase, una vez creada esta clase nos arroja un error
        como en ejemplos pasados, le damos al error y nos agrega los metodos de la clase, los cuales son 3.
        -El primer metodo es (keyTyped) este se acciona cuando presionamos las teclas entre los rangos (a-z y 0-9), las otras teclas especiales no las toma 
        en cuenta.
        -El segundo metodo es (keyPressed) este metodo se acciona cuando presionamos cualquier tecla.
        -El tercer metodo es (keyRelased) este metodo se acciona cuando presionamos y soltamos una tecla.
        -Por ultimo agregamos el nombre de la clase dentro del metodo (addKeyListener).

        Mostrare otro ejemplo el cual es un metodo para el segundo parametro de nuestra clase.

                if(e.getKeyChar() == 'p'){
                   areaTexto.append("Letra P\n");
                }
                if(e.getKeyChar() == '\n'){
                    areaTexto.append("Enter\n");
                }
                if(e.getKeyChar() == ' '){
                    areaTexto.append("Espacio\n");
                }

        En este ejemplo pusimos unas condicionales, las cuales les da una funcion distinta a cada tecla y lo que hace es llamar al segundo parametro y le 
        agregamos el metodo (getKeyChar) y la igualamos a la letra p, esto quiere decir que cuando presionemos dicha letra hara una accion especifica pasa, 
        lo mismo con los otros if.     
*/

//Diseños(Layout)
/*
    Es un gestor de diseño, que se usa por defecto por los objetos JPanel, si usamos la propiedad (FlowLayout), la interfaz nos quedara ordenada en forma 
    de fila, para poder lograr esto, seleccionamos el panel, click derecho, set Layout y ahi seleccionamos la propiedad FlowLayout.
    
    Para los demas layauts se hacen de la misma manera pero cada uno tiene una funcionalidad diferente:

        -FlowLayout: Nos ordela los elementos del panel de manera horizontal.
        -BoxLayout: Nos permite ordenar los elementos de manera horizontal o vertical, dependiendo lo que queramos hacer.
        -BorderLayout: Agregar un diseño al borde la cual se separa en 5 partes (superior, inferior, izquierda, derecha y centro).
        -GridLayout: Con esta propiedad podemos decirle cuantas filas y columnas queremos usar en nuestro aplicativo, nosotros modificamos cuantas filas y
        columnas queremos que tenga nuestro GridLayout.
        -GridBagLayout: Esta propiedad nos da mas flexibilidad a la hora de editar las dimensiones de todo lo que agregmos en nuestro panel, solo tenemos
        que modificar atributos como ancho, altura, margenes, ETC. 
*/

//Barras de menu
//Creacion
/*
    Para crear una barra de menu, creamos un archivo (JFrame), hay un apartado que dice (Swing menus), en esta parte podemos crear una barra de menu, primero 
    insertamos la que dice (menu bar), y ahi empezamos a agregar botones con sus respectivas funcionalidades, tambien podemos agregar iconos, cambiar el 
    tamaño de la letra, colores, ETC. 
*/

//Sub menu y componentes
/*
    Los submenus, son menus dentro de otro menu, para poder realizarlo arrastramos la opcion de (menu) y la agregamos, para ponerle los otros elementos 
    arrastramos la opcion de (menu item).

    Para crear un radio boton dentro de un menu lo que hacemos es arrastrar l aopcion que dice (menuItem - RadioButton) y para agruparlos y que se 
    desmarquen los demas, lo que hacemos es irnos al apartado de (Swing controls) y arrastramos la opcion (Button group), nos dirigimos al codigo y en el 
    constructor de la ventana llamamos al grupo de botones y añadimos la lista de radio botones.

    Para crear un check box dentro de un menu, nos vamor al apartado (Swing menus) y arrastramos la opcion que dice (Menu item - CheckBox) y quedaria 
    agregado nuestro check box.
*/

//Menu desplegable (JPopupMenu)
/*
    Este tipo de menus se usan practicamente en todos los programas, son los menus que salen cuando damos un click derecho y nos despliega mas opciones 
    para poder hacerlo primero agregamos un panel sin incluir el menu creado anteriormente, luego nos dirigimos al apartado (Swing menus), seleccionamos 
    la opcion que dice (popup menu) y la arrastramos dentro de nuestro menu, pero tenemos que hacer unas cositas mas debido a que aun no esta implementado 
    dentro del panel.

    Nos dirigimos al panel y le agregamos un evento, este evento esta en mouse y se llama (MouseReleased), le decimos que si presionamos el click derecho 
    nos agregue el menu desplegable dentro del panel: 

            private void panelMouseReleased(java.awt.event.MouseEvent evt) {                                    
                if(evt.isPopupTrigger()){
                    menuDesplegable.show(evt.getComponent(), evt.getX(), evt.getY());
                }
            } 

        Llamamos al menu desplegable y le damos el parametro (show) y le agregamos los parametros que es la ventana que queremos mostrar y las coordenadas, 
        como queremos que nos salga exactamente en donde hicimos click, por esta razon agregamos estos metodos.
*/

//Estilos de ventana (LookAndFeel)
/*
    Para incorporar los estilos de una ventana, nos dirigimos a nuestro codigo de la ventana, y nos dirigimos al apartado del main, agregamos las iniciales
    (UIM) y el programa lo auto completa y le pasamos el parametro (setLookAndFeel), nos dirigimos a la seccion (javax.swing.plaf), hay varios los cuales
    podemos usar, copiamos el nombre que queremos usar y lo pegamos en el parametro de (setLookAndFeel) y seguido de ello agregamos un punto y pegamos la 
    ruta del estilo, quedaria de la siguiente manera: 

            try {
                UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
            } catch (ClassNotFoundException ex) {
                //Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                //Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                //Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedLookAndFeelException ex) {
                //Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
            }

        Al agregar el (UIManager), el aplicativo nos mandara un error, el cual importaremos los try catch, como solo queremos cambiar la apariencia de la 
        ventana, podemos comentar todos los catch.
*/

//Importar estilos de ventana (LookAndFeel)
/*
    Para importar una libreria de estilos a nuestro netbeans y poder usarlo, nos dirigimos a una pagina llamada (JTatto), descargamos la libreria y los
    importamos en los archivos de nuestro proyecto, mas especificiamente en (Libraries) y para usarlos es de la misma manera que el ejemplo anterior, para
    que nos funcione a la perfeccion nuestro estilo de ventana lo dejamos antes de agregar el comando para modificar los estilos de la ventana.
*/

//Crear ventanas secundarias (JDialog)
/*
    Para crear una ventana secundaria le damos click derecho a nuestro proyecto y creamos un archivo (JDialog), haremos un ejemplo, crearemos una ventana 
    principal con un boton y cuando lo presionemos nos aparece la ventana secundaria:

        -Primero creamos nuestra ventana principal (JFrame), le agregamos un boton.
        -Dentro del codigo de nuestro boton, lo que haremos es llamar al constructor de la ventana secundaria.
        -Como parametros nos pedira 2 cosas, la primera es la ubicacion de nuestra ventana secundaria y la segunda es si podemos o no manipular nuestra 
        ventana principal mientras tenemos la ventana secundaria abierta (true) no la podemos manipular y (false) si la podemos manipular.
        -Cuando llamamos al constructor le pusimos un nombre, entonces para poder mostrar la ventana correctamente, llamamos a nuestro constructor y le 
        pasamos el parametro (setVisible) y le agregamos true.

    Ya explicamos como crear una ventana y como la podemos mostrar en pantalla, pero ahora vamos a agregarle un boton a la ventana secundaria, donde 
    tendra un boton que dira salir y cuando lo presionemos se cierra la ventana secundaria.

        -Agregamos el boton y nos dirigimos dentro del codigo del boton.
        -Solo agregamos la funcion (dispose), de esta manera la ventana se cerrara cuando presionemos el boton.
*/

//Mostrar datos en un arbol jerárquico (JTree)
/*
    Es un arbol de muestra todo el contenido que tenemos en un carpeta, por ejemplo la carpeta de proyectos, para entender mejor esto, lo explicaremos paso
    a paso:

        -Primero crearemos nuestra ventana (JFrame), en la caja de componentes en la seccion de (Swing Controls).
        -Seleccionamos la que dice (Tree) y la arrastramos a nuestra ventana.
        -Para modificar el contenido, seleccionamos el componenten en la ventana y nos dirigimos al apartado (model) y agregamos el nombre de nuestro 
        codigo, donde tenemos nuestros datos. 

    Ya explicamos como agregar nuestro arbol y tambien como modificarlos, pero ahora veremos como crear el constructor y agregar nuestros contenidos.

        -Nos dirigimos a la parte de nuestro codigo, en la parte superior llamamos a la clase (DefaultTreeModel) le agregamos un nombre y lo instanciamos.
        -Esta clase necesita un parametro especial, para ello necesitamos llamar a otra clase la cual es (DefaultMutableTreeNode), donde le ponemos un 
        nombre, la instanciamos y como parametro le agregamos el nombre que queremos mostrar como contenido.
        -Agregmamos el nombre de la clase (DefaultMutableTreeNode) dentro del parametro de la clase (DefaultTreeModel), de esta manera agregamos el primer
        contenido de nuestro arbol.

            DefaultMutableTreeNode raiz = new DefaultMutableTreeNode("Raiz");
            DefaultTreeModel modeloTree = new DefaultTreeModel(raiz);
    
    Para agregar mas datos a nuestro arbol necesitamos crear una clase, y la agregamos al constructor de nuestra ventana antes de iniciar los componentes
    (initComponents) ya que si lo agregamos despues se produce un error.
        
        -Agregamos nuestra clase con un nombre deseado, dentro de esta clase agregamos una clase que ya habiamos visto la cual es (DefaultMutableTreeNode).
        -Cambiamos el nombre y el parametro de esta clase y ya solo quedaria llamar a la primera clase y añadimos los datos, quedaria de esta manera:


            private void cargarDatosModeloTree(){
                DefaultMutableTreeNode colores = new DefaultMutableTreeNode("Colores");
                DefaultMutableTreeNode colorRojo = new DefaultMutableTreeNode("Rojo");
                DefaultMutableTreeNode colorAzul = new DefaultMutableTreeNode("Azul");
                colores.add(colorAzul);
                colores.add(colorRojo);

                DefaultMutableTreeNode deportes = new DefaultMutableTreeNode("Deportes");
                DefaultMutableTreeNode futbol = new DefaultMutableTreeNode("Futbol");
                DefaultMutableTreeNode baloncesto = new DefaultMutableTreeNode("Baloncesto");
                deportes.add(futbol);
                deportes.add(baloncesto);

                raiz.add(colores);
                raiz.add(deportes);
            }

        En este codigo mostramos como agregar datos a nuestro arbol.
*/

//Eventos en el arbol (JTree)
/*
    Para agregarle eventos a nuestro arbol haremos los siguientes pasos:
    
        -Selecionamos el arbol y en la parte de los comando nos dirigimos a (code) y modificamos la casilla de que dice (post-init-code) y llamamos al 
        arbol y le pasamos el metodo (getSelectionModel), luego le pasamos otro metodo (addTreeSelectionListener).
        -Luego llamamos a la clase (TreeSelectionListener), le agregamos un nombre y lo instanciamos.
        -Dentro de esa clase agregamos la siguiente clase (valueChanged), al agregarlo nos carga con los parametros, se le agrega el (@Override), debido 
        a que se esta haciendo una sobrecarga.
        -En la clase creada agregamos la siguiente clase (DefaultMutableTreeNode), le agregamos un nombre y la instanciamos sin parametros.
        -Agregamos una clase que vamos a crear mas adelante, lo ultimo que hacemos es agregarle el nombre de la clase (TreeSelectionListener) al parametro
        de (addTreeSelectionListener).

            TreeSelectionListener oyenteTree = new TreeSelectionListener(){
                @Override
                public void valueChanged(TreeSelectionEvent e){
                    DefaultMutableTreeNode nodoSeleccionado = (DefaultMutableTreeNode) arbol.getLastSelectedPathComponent();
                    eventosNodoSeleccionado(nodoSeleccionado);
                }
            };

            arbol.getSelectionModel().addTreeSelectionListener(oyenteTree);

        De esta manera ya tenemos la funcion de hacer algo con cada contenido, ahora haremos que nos muestre una imagen a un costado deacuerdo a cada 
        contenido:

        -Vamos a crear nuestra clase la cual habiamos agregado en el ejemplo anterior (eventosNodoSeleccionado) y como parametros le agregamos 
        (efaultMutableTreeNode) y (nodoSeleccionado).
        -Hacemos una condicional la cual dice que si seleccionamos rojo, nos muestre una imagen en rojo, asi sucesivamente hasta ocupar todas las opciones.

            private void eventosNodoSeleccionado(DefaultMutableTreeNode nodoSeleccionado){
                if(nodoSeleccionado.toString().equals("Rojo")){
                    etiquetaImagen.setIcon(new ImageIcon(getClass().getResource("/images/rojo.jpg")));
                } else if(nodoSeleccionado.toString().equals("Azul")){
                    etiquetaImagen.setIcon(new ImageIcon(getClass().getResource("/images/azul.png")));
                } else if(nodoSeleccionado.toString().equals("Futsal")){
                    etiquetaImagen.setIcon(new ImageIcon(getClass().getResource("/images/futsal.jpg")));
                } else if(nodoSeleccionado.toString().equals("Futbol Completo")){
                    etiquetaImagen.setIcon(new ImageIcon(getClass().getResource("/images/futbol.jpg")));
                } else if(nodoSeleccionado.toString().equals("Baloncesto")){
                    etiquetaImagen.setIcon(new ImageIcon(getClass().getResource("/images/baloncesto.jpg")));
                } 
            }

        De esta manera terminamos nuestra funcionalidad en el arbol.
*/

//Esto es una nuava unidad (Archivos)
// contenido
/*
    En este apartado veremos los siguientes temas: 

        -Teoria de archivos
        -La clase file
        -Crear un archivo o directorio
        -Escritura sobre un archivo de texto
        -Lectura de un archivo de texto
        -Ejercicio1 - Crear una agenda de contactos
        -Escritura sobre un archivo binario
        -Añadir contenido a un archivo binario
        -Ejercicio2 - inscripciones a una competencia de atletismo
*/

//Archivos
/*
    Es una forma en la cual podemos hacer que nuestros datos esten accesibles, hay 2 tipos de archivos, los cuales son archivos de texto y archivos 
    binarios.

        -Archivos de texto: Se pueden abrir con cualquier editor de texto y lo puedes leer sin dificultad, porque todo esta ahi. 
        -Archivos binarios: Contienen informacion codificada en binario, con el proposito de almacenar y procesar en ordenadores, es una manera de oculatar
        informacion, ya que solo estan diseñados para que lo lean las computadoras.
*/

//Clase file
/*
    La clase file es util para recuperar informacion sobre un archivo o directorio, para usar esta clase lo que haremos es llamarla, le agregamos un nombre
    y la instanciamos, esta nos pedira un parametro el cual es la ruta del archivo que queremos examinar, tenemos 2 tipos de formas para buscar archivos, 
    la primera es con la ruta relativa y la segunda es la ruta absoluta.

            File archivo = new File("C:\\Users\\sanch\\OneDrive\\Documentos\\NetBeansProjects\\ClaseFile\\prueba.txt"); 
            File archivo = new File("CarpetaPrueba"); //Ruta relativa: tiene que estar dentro del proyecto 

        -La ruta absoluta es la que tiene todo el enlace donde se encuentra nuestro archivo, entonces lo que haremos es agregar dicha direccion, de esta 
        manera podemos leer archivos que estan fuera de la carpeta del proyecto.
        -La ruta relativa solo es agregar el nombre del archivo que queremos revisar, el problema de usar este tipo de rutas, es que el archivo tiene que 
        estar dentro de la carpeta del proyecto.

    Esta clase tiene sus diferentes constructores y metodos para poder usarlos de una manera adecuada.
*/

//Crear un archivo o directorio
/*
    Para crear un archivo o un directorio, tenemos que llamar a la clase que vimos anteriormente (File) le agregamos un nombre y la instanciamos con el 
    nombre que le queremos poner a nuestro archivo, seguido de ello agregamos una condicional y como parametro le agregamos el nombre de nuestra clase con 
    el metodo (createNewFile), nos arroja un error, pero solo tenemos que importar el (try catch), dentro de cada parametro agregamos una descripcion 
    para ver que el programa se este ejecutando con normalidad. 

            File archivo = new File("C:\\Users\\sanch\\OneDrive\\Documentos\\NetBeansProjects\\ArchivosDeTexto12\\prueba.txt");
        
            try {
                if(archivo.createNewFile()){
                    System.out.println("El archivo se ha creado correctamente");
                }
            } catch (IOException ex) {
                System.err.println("No se pudo crear el archivo " + ex);
            }

    Ahora veremos como crear una carpeta, tenemos que seguir los mismos pasos, lo unico que cambia es el metodo que le agregamos a la clase creada la cual 
    es (mkdir), este metodo no tiene ningun error, por lo que podemos seguir simplemente con nuestra condicional, quedaria de la siguiente manera: 

            File archivo = new File("carpetaPrueba");
        
            if(archivo.mkdir()){
                System.out.println("Se ha creado el directorio correctamente");
            } else {
                System.err.println("Error, no se ha podido crear el directorio");
            }

    Para incorporar la creacion de las carpetas, nos dirigimos a nuestra clase main, dentro de ella llamamos a la clase (ArchivosDeTexto), le agregamos un 
    nombre y la instanciamos, esta clase no tiene un metodo obligatorio, por lo que llamamos a nuestra clase y como metodo le agregamos los metodos creados
    para añadir la carpeta y el archivo, quedaria de la siguiente manera: 
            
            ArchivosDeTexto archivos = new ArchivosDeTexto();
        
            archivos.crearArchivo();
            archivos.crearDirectorio();
*/

//Escritura sobre un archivo de texto
/*
    Para escribir dentro de un archivo de texto llamamos a la clase (FileWriter), le agregamos un nombre y la instanciamos, como parametro nos pedira a 
    donde queremos añadir el archivo, por lo que le pasamos como parametro el nombre de la primera clase que creamos (File), el programa nos arrojara un 
    error, este error nos pide que agreguemos un (try catch), una vez agregado, llamamos a la clase (FileWriter) y le pasamos el metodo (write) y como 
    parametro le agregamos el texto deseado, si queremos agregar mas texto, solo tenemos que llamar nuevamente a la clase y pasarle el parametro (write)
    haciendo el respectivo salto de linea (\n), si no realiza el salto de linea, lo que tenemos que ahcer es agregar un retorno (\r) y de esta manera 
    quedaria el codigo: 

            try {
                FileWriter escribir = new FileWriter(archivo);
                escribir.write("Hola que tal?");
                escribir.write("\r\nMas texto");
                escribir.close();
            } catch (IOException ex) {
                System.err.println("Error, no se pudo escribir sobre el archivo");
            }

    El problema de hacerlo de esta manera, es que si queremos agregar mas texto reemplazando lo que tenemos, el programa sobre escribira lo que ya se 
    habia agregado, para ello solo tenemos que agregar un parametro mas a la clase el cual es un booleando, si le pasamos true, el texto agregado no se 
    reemplazara, pero si agregamos false quedara como estaba antes, el codigo quedaria de la siguiente manera: 

            try {
                FileWriter escribir = new FileWriter(archivo, true);
                escribir.write("\r\nMucho mas texto");
                escribir.write("\r\nAhora mas");
                escribir.close();
            } catch (IOException ex) {
                System.err.println("Error, no se pudo escribir sobre el archivo");
            }
*/

//Lectura de un archivo de texto
/*
    Para poder leer un archivo lo que hacemos es llamar una clase (FileReader), le agregamos un nombre y como parametro le agregamos el archivo el cual es 
    el nombre de la primera clase creada, el aplicativo nos arrojara un error por lo que tenemos que agregarle un (try catch), seguido de ello llamamos 
    otra clase (BufferedReader) le agregamos un nombre y la instanciamos, como parametro le agregamos el nombre de la clase (FileReader), el aplicativo nos
    arrojara un error, nos dira que tenemos que agregar un (try catch), cuando se anidan estos (try catch) lo que podemos hacer es borrar el try y la parte
    del catch la agregamos despues del primer catch, quedaria de la siguiente manera: 

            String cadena;
        
            try {
                FileReader lector = new FileReader(archivo);
                BufferedReader lectura = new BufferedReader(lector);
                cadena = lectura.readLine();
                while(cadena != null){
                    System.out.println(cadena);
                    cadena = lectura.readLine();
                } 
            } catch (FileNotFoundException ex) {
                System.err.println("Error, " + ex);
            } catch (IOException ex) {
                System.err.println("Error, " + ex);
            }

    De esta manera quedaria el codigo, pero queda una cosa por explicar y es como imprimimos el texto que tenemos en el archivo, para ello necesitamos 
    crear una variable, esta variable la igualamos al nombre de la segunda clase creada (BufferedReader) y le pasamos el parametro (readLine), de esta 
    manera nos estaria imprimiendo la primera fila de nuestro texto, pero necesitamos mostrar todo, entonces creamos un bucle while y le decimos que 
    mientras cadena sea diferente de vacio nos imprima la cadena, ya solo queda agregamor a la clase main y ejecutamos.
*/

//Archivos binarios
/*
    Con estos archivos, podemos guardar datos encriptados por lo que se guarda en formato de bytes, podemos guardar cualquier cosa de esta manera.

        -Primero llamamos a la clase (FileOutputStream), le agregamos un nombre, la instanciamos y le pasamos un parametro el cual es el nombre del archivo
        que crearemos junto con su extencion, puede ser de manera relativa o absoluta.
        -Nos arrojara un error, por lo cual lo importaremos y tambien agregamos el respectivo (try catch).
        -Luego llamamos a la clase (ObjectOutputStream), le agregamos un nombre y la instanciamos, como parametro le agregamos el nombre de la primera 
        clase creada, tambien le creamos el respectivo (try catch) ya que nos arroja un error.

            try {
                FileOutputStream archivo = new FileOutputStream("personas.bin");
                ObjectOutputStream escritura = new ObjectOutputStream(archivo);
            } catch (FileNotFoundException ex) {
                System.err.println("Error, " + ex);
            } catch (IOException ex) {
                System.err.println("Error, " + ex);
            }

        -Creamos otro archivo donde contendra los datos de la persona, los cuales son el nombre y la edad, le creamos el respectivo constructor.
        -Para poder almacenar los datos como bytes, tenemos que agregale algo a la clase es como una extencion la cual se llama (implements Serializable)
        -agregamos las respectivas variables las cuales son nombre y edad para este ejemplo.

            public class Persona implements Serializable{
                private String nombre;
                private int edad;

                public Persona(String nombre, int edad) {
                    this.nombre = nombre;
                    this.edad = edad;
                }
            }

        -Para poder ingresar los datos, tenemos que llamar a la clase creada la cual es la persona, con sus respectivos datos, le agregamos una nueva 
        persona, para este ejemplo creamos 3 personas. 
        -Llamamos a la clase (ObjectOutputStream) y le pasamos el metodo (writeObject), esta clase tiene muchos metodos de escritura, tenemos que saber
        cual metodo se ajusta mas a lo que queremos hacer, y como parametro le pasamos el nombre de las personas.
        -Cerramos la clase.

            private void excribirBinario(){
                try {
                    FileOutputStream archivo = new FileOutputStream("personas.bin");
                    ObjectOutputStream escritura = new ObjectOutputStream(archivo);

                    Persona persona1 = new Persona("Harol", 24);
                    Persona persona2 = new Persona("Maria", 22);
                    Persona persona3 = new Persona("Juan", 25);

                    //Escribimos objetos sobre el archivo binario
                    escritura.writeObject(persona1);
                    escritura.writeObject(persona2);
                    escritura.writeObject(persona3);

                    escritura.close();//cerramos el archivo.

                } catch (FileNotFoundException ex) {
                    System.err.println("Error, " + ex);
                } catch (IOException ex) {
                    System.err.println("Error, " + ex);
                }
            }

        -Para agregar lo que hicimos a nuestra clase main y todo funcione correctamente, tenemos que llamar a la clase raiz, la cual es el nombre del 
        archivo, le agregamos un nombre y la instanciamos.
        -Agregamos el nombre de la clase que llamamos y le pasamos la clase donde se encuentra la escritura.

            public static void main(String[] args) {
                ArchivosBinarios archivos = new ArchivosBinarios();
                archivos.excribirBinario();
            }
*/

//Lectura de un archivo binario
/*
    Para la lectura de un archivo binario, se hace un metodo similar a lo que explicamos anteriormente, pero en vez de output, lo que agregamos es input
    

        -Primero llamamos a la clase (FileInputStream), le agregamos un nombre y lo instanciamos, como parametro le agregamos el nombre del archivo que 
        deseamos leer, luego le agregamos el (try catch).
        -Llamamos a una segunda clase la cual es (ObjectOutputStream) le agregamos un nombre y lo instanciamos, el parametro que le agregamos es el 
        nombre de la clase que creamos anteriormente y le agregamos el (try catch)

            private void leerBinario(){
                try {
                    FileInputStream archivo = new FileInputStream("personas.bin");
                    ObjectInputStream lectura = new ObjectInputStream(archivo);

                } catch(EOFException ex){
                    return;// Finalizo de leer todo el archivo binario
                } catch (FileNotFoundException ex) {
                    System.err.println("Error, " + ex);
                } catch (IOException ex) {
                    System.err.println("Error, " + ex);
                } catch (ClassNotFoundException ex) {
                    System.err.println("Error, " + ex);
                }    

            }

        -Tenemos que crear un archivo donde nos muestre los datos, entonces creamos una clase y le imprimimos por consola el nombre y edad.
        -Luego nos dirigimos al archivo de la lectura, llamaremos a la clase de personas y le agregamos un nombre.
        -Hacemos un bucle infinito con un while, en el cual le agregamos el nombre de la clase personas y la igualamos al nombre de la clase 
        (ObjectInputStream) y le agregamos el parametro (readObject), hay muchos metodos similares para cada caso en especifico.
        -Nos arrojara un error porque nos pedira importar un (try catch), cuando lo importamos, tambien nos arrojara un error, por lo que tenemos que 
        convertirlo a la clase persona.
        -Volvemos a llamar a la clase (ObjectInputStream) y como parametro le agregamos la clase creada en persona la cual es (mostrarDatos).
        -Para que el bucle pueda terminar en algun momento, lo que hacemos es agregar un (catch) y como parametro le agregamos (EOFException ex) y 
        agregamos return.

            private void leerBinario(){
                Persona objetoPersona;

                try {
                    FileInputStream archivo = new FileInputStream("personas.bin");
                    ObjectInputStream lectura = new ObjectInputStream(archivo);

                    while(true){ //recorremos el archivo binario
                        objetoPersona = (Persona) lectura.readObject();
                        objetoPersona.mostrarDatos();
                    }

                } catch(EOFException ex){
                    return;// Finalizo de leer todo el archivo binario
                } catch (FileNotFoundException ex) {
                    System.err.println("Error, " + ex);
                } catch (IOException ex) {
                    System.err.println("Error, " + ex);
                } catch (ClassNotFoundException ex) {
                    System.err.println("Error, " + ex);
                }    
            }
*/

//Añadir contenido a un archivo binario
/*
    Para añadir contenido es similar a la creacion de un archivo binario, tenemos que modificar unas cosas.
        
        -Primero modificamos el parametro de la primera clase, le agregamos un true.
        
            FileOutputStream archivo = new FileOutputStream("personas.bin", true);

        -Luego creamos otra clase, le agregamos un nombre y le decimos que herede de la clase (ObjectInputStream).
        -Agregamos los respectivos constructores, y añadimos una nueva clase (writeStreamHeader) y le agregamos el metodo (reset), lo que hace este 
        metodo es resetear la cabecera que agrega la clase (ObjectInputStream).


            public class AñadirContenido extends ObjectOutputStream{

                public AñadirContenido(OutputStream out) throws IOException {
                    super(out);
                }

                public AñadirContenido() throws IOException, SecurityException {
                }

                @Override
                public void writeStreamHeader() throws IOException{
                    reset();
                }
            }

        -Nos dirigimos nuevamente a la clase para crear mas contenido en el archivo y llamamos a la clase creada, le agregamos un nombre y la 
        instanciamos, como parametro le agregamos la primera clase.
        -Solo nos falta crear mas datos, los cuales son el nombre y edad de la persona, lo añadimos a la clase principal y todo quedaria perfecto.

            AñadirContenido escritura = new AñadirContenido(archivo);
*/
