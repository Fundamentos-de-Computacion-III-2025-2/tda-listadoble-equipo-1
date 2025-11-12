public class ListaDoble {
    protected NodoDoble inicio, fin; //Apuntadores para saber donde esta el inicio y el fin de la lista doble

    //Constructor para crear la lista doble vacía
    public ListaDoble(){
        inicio = null;
        fin =null;
    }

    //Metodo para saber si la lista doble está vacía
    public boolean listaVacia(){
        if(inicio==null){
            return true;
        }else{
            return false;
        }
    }

    //Metodo para agregar un NodoDoble al Inicio de la Lista Doble
    public void insertarInicio(int dato){
        //TODO: María José Arévalo Coronado

    }

    //Metodo para insertar al Final de la lista doble
    public void insertarFinal(int dato){
        //TODO Anahí Hernández Morales
    }


    /* Metodo para insertar un elemento suponiendo que la lista está en orden ascendente
    es decir, se debe comenzar a recorrer la lista e insertar el elemento antes del primer
    número mayor al elemento que se encuentre en la lista, si no se encuentar un dato mayor
    se inserta al final */

    public void insertarEnOrden(int dato){
        //TODO María Celeste Román Ruiz
    }


    //Eliminar al inicio
    public int eliminarInicio(){
        //TODO María Celeste Román Ruiz
        return -1;
    }

    //Eliminar al final
    public int eliminarFinal(){
        //TODO María José Arévalo Coronado
        return -1;
    }

    //Eliminar un elemento
    public int eliminarElemento(int elemento){
        //TODO Anahí Hernández Morales
        return elemento;
    }

    //Metodo para buscar un elemento
    public boolean buscarElemento(int elemento){
        //TODO María Celeste Román Ruiz
        return false;

    }

    //Imprimir los datos de la lista doble de inicio a fin
    public void mostrarInicioFin(){
        NodoDoble actual=inicio;
        System.out.println();
        while(actual!=null){
            System.out.print(actual.dato+" --> ");
            actual = actual.siguiente;
        }
    }

    //Imprimir los datos de la lista doble de fin a inicio
    public void mostrarFinInicio(){
        //TODO María José Arévalo Coronado
    }


}