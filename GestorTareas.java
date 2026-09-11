import java.util.ArrayList;
import java.util.Scanner;
public class GestorTareas {
    public static void main(String[] args) {
        ArrayList<String> tareas = new ArrayList<>();
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Introduce una tarea: ");
        String nuevaTarea = sc.nextLine();
        tareas.add(nuevaTarea);

        System.out.println("\nTareas: ");
        for (String tarea : tareas) {
            System.out.println("- " + tarea);
        }
        sc.close();
    }
    
}
