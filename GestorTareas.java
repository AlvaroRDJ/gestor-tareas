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
            System.out.println("3. Salir.");
            System.out.print("Elige una opción: ");

            int opcion = sc.nextInt();
            sc.nextLine(); // Limpiamos el salto de línea pendiente

            switch (opcion) {
                case 1:
                    System.out.println("Escribe la tarea: ");
                    String nuevaTarea = sc.nextLine();
                    tareas.add(nuevaTarea);
                    System.out.println("Tarea añadida");
                    break;

                case 2:
                    System.out.println("\nTus tareas: ");
                    if (tareas.isEmpty()) {
                        System.out.println("No tienes tareas todavía");
                    } else {
                        for (String tarea : tareas) {
                            System.out.println("- " + tarea);
                        }
                    } 
                    break;
                    
                case 3:
                    seguir = false;
                    System.out.println("Hasta luego!");
                    break;
                    
                    default: 
                    System.out.println("¡Opción inválida!");
            }
        }
        sc.close();
    }
    
}
