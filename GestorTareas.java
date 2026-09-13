import java.util.ArrayList;
import java.util.Scanner;
public class GestorTareas {
    public static void main(String[] args) {
        ArrayList<String> tareas = new ArrayList<>();
        Scanner sc = new Scanner (System.in);
        boolean seguir = true;
        
        while (seguir) {
            System.out.println("\\n--- Gestor de Tareas ---");
            System.out.println("1. Añadir tarea.");
            System.out.println("2. Ver tarea.");
            System.out.println("3. Marcar tarea como completada");
            System.out.println("4. Salir.");
            System.out.print("Elige una opción: ");

            int opcion = sc.nextInt();
            sc.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.println("Escribe la tarea: ");
                    String nuevaTarea = sc.nextLine();
                    tareas.add(nuevaTarea);
                    System.out.println("Tarea añadida");
                    break;

                case 2:
                    mostrarTareas (tareas);
                    break;
                    
                case 3:
                    mostrarTareas (tareas);
                    if (!tareas.isEmpty()) {
                        System.out.println("¿Qué número de tarea quieres marcar como completada?");
                        int numero = sc.nextInt();
                        sc.nextLine();

                        int indice = numero - 1; // el usuario cuenta desde 1 pero la lista desde 0.

                        if (indice >= 0 && indice < tareas.size()) {
                            String tareaActual = tareas.get(indice);
                            tareas.set(indice, "✔ " + tareaActual);
                            System.out.println("Tarea marcada como completada.");
                        } else {
                            System.out.println("¡Ese número no existe!");
                        }
                    }
                    break;

                case 4:
                    seguir = false;
                    System.out.println("¡Hasta luego!");
                    break;    
                    
                    default: 
                    System.out.println("¡Opción inválida!");
            }
        }
        sc.close();
    }

    // Método adicional para no repetir el mismo código de listar en dos sitios
    private static void mostrarTareas(ArrayList<String> tareas) {
        System.out.println("\nTus tareas: ");
        if (tareas.isEmpty()) {
            System.out.println("No tienes tareas todavía");
        } else {
            for (int i = 0; i < tareas.size(); i++) {
                System.out.println((i + 1) + ". " + tareas.get(i));
            }
        }
    }
    
}
