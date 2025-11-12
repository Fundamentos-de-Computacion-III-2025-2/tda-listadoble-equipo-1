import javax.swing.*;
import javax.swing.JOptionPane;

public class Main {

        /*
        En este metodo va toda la interfaz del usuario
        Las clases NodoDoble y ListaDoble deben tener solo implementación (nada de interfaz o visualización),
        excepto los métodos de mostrarInicioFin y mostrarFinInicio (son los únicos que pueden imprimir en consola
        o devolver un String para después imprimirlo desde aquí o mostrarlo en un JOptionPane aquí en Main.java).
         */

        /*
        Pueden usar JOptionPane o hacer la interfaz por consola.
        Deben definir un menú con las siguientes opciones:
                "1. Insertar un elemento al inicio\n"+
                "2. Insertar un elemento al final\n"+
                "3. Insertar un elemento en orden\n"+
                "4. Eliminar un elemento al inicio\n"+
                "5. Eliminar un elemento al final\n"+
                "6. Eliminar un elemento\n"+
                "7. Buscar un elemento\n"+
                "8. Mostrar los datos de inicio a fin\n"+
                "9. Mostrar los datos de fin a inicio\n"+
                "10. Salir\n","Menú de opciones",3));
        */

        public static void main(String[] args) {

            int opcion = 0;
            int elemento;
            ListaDoble lista = new ListaDoble();

            do {
                try {
                    opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "1. Insertar un elemento al inicio\n"+ //TODO @María José Arévalo Coronado
                                    "2. Insertar un elemento al final\n"+
                                    "3. Insertar un elemento en orden\n"+ //TODO @TODO María Celeste Román Ruiz
                                    "4. Eliminar un elemento al inicio\n"+ //TODO @TODO María Celeste Román Ruiz
                                    "5. Eliminar un elemento al final\n"+ //TODO @María José Arévalo Coronado
                                    "6. Eliminar un elemento\n"+
                                    "7. Buscar un elemento\n"+ //TODO @María Celeste Román Ruiz
                                    "8. Mostrar los datos de inicio a fin\n"+
                                    "9. Mostrar los datos de fin a inicio\n"+ //TODO @TODO María José Arévalo Coronado
                                    "10. Salir\n",
                            "Menú de opciones", 3));
                    switch (opcion) {
                        case 1://Insertar un elemento al inicio TODO @María José Arévalo Coronado
                            break;
                        case 2://Insertar un elemento al final
                            elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Ingresa el elemento a insertar al final:", "Insertar al Final", 3));
                            lista.insertarFinal(elemento);
                            JOptionPane.showMessageDialog(null, "Elemento " + elemento + " insertado al final.");
                            break;
                        case 3: //Insertar en orden TODO @TODO María Celeste Román Ruiz
                            break;
                        case 4: //Eliminar al inicio TODO @TODO María Celeste Román Ruiz
                            break;
                        case 5: //Eliminar al final TODO @María José Arévalo Coronado
                            break;
                        case 6: //Eliminar
                            if (!lista.listaVacia()) {
                                elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                        "Ingresa el elemento a eliminar:", "Eliminar Elemento", 3));
                                int eliminado = lista.eliminarElemento(elemento);
                                if (eliminado != -1) {
                                    JOptionPane.showMessageDialog(null, "Elemento " + eliminado + " eliminado con éxito.");
                                } else {
                                    JOptionPane.showMessageDialog(null, "El elemento " + elemento + " no se encontró en la lista.",
                                            "Búsqueda", JOptionPane.INFORMATION_MESSAGE);
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "¡La lista está vacía! No se puede eliminar.",
                                        "Error", JOptionPane.ERROR_MESSAGE);
                            }
                            break;
                        case 7: //Buscar elemento TODO @María Celeste Román Ruiz
                            break;
                        case 8: //MostrarLista
                            String datosInicioFin = lista.mostrarInicioFin();
                            if(datosInicioFin.isEmpty()){
                                JOptionPane.showMessageDialog(null, "La lista está vacía.",
                                        "Lista de Inicio a Fin", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(null, "Lista (Inicio -> Fin):\n" + datosInicioFin,
                                        "Lista de Inicio a Fin", JOptionPane.PLAIN_MESSAGE);
                            }
                            break;
                        case 9: //MostrarLista TODO @TODO María José Arévalo Coronado
                            lista.mostrarFinInicio();
                            break;
                        case 10: //Salir
                            JOptionPane.showMessageDialog(null, "Programa Finalizado");
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opción Incorrecta");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "error" + e.getMessage(),
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            } while (opcion != 10);
    }
}