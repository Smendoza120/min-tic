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