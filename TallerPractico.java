package tallerpráctico;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;


public class TallerPractico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMENU PRINCIPAL");
            System.out.println("1. ESTUDIANTE");
            System.out.println("2. PROFESOR");
            System.out.println("3. SALIR");
            System.out.println("Ingrese su opcion:");

            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    menuEstudiante();
                    break;
                case "2":
                    // Aquí se puede implementar el menú para el profesor
                    break;
                case "3":
                    System.exit(0);
                default:
                    System.out.println("Opción inválida. Por favor ingrese una opción válida.");
                    break;
            }
        }
    }

    private static void menuEstudiante() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMENU ESTUDIANTE");
            System.out.println("1. SOLICITAR PRUEBA");
            System.out.println("2. VERIFICAR CALIFICACIONES");
            System.out.println("3. REGRESAR AL MENU PRINCIPAL");
            System.out.println("Ingrese su opción:");

            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1" -> PruebaITSQMET.solicitarPrueba();
                case "2" -> PruebaITSQMET.verificarCalificaciones();
                case "3" -> {
                    return;
                }
                default -> System.out.println("Opción inválida. Por favor ingrese una opción válida.");
            }
        }
    }
}


class PruebaITSQMET {
    static ArrayList<Estudiante> estudiantes = new ArrayList<>();

    public static void solicitarPrueba() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del estudiante:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el apellido del estudiante:");
        String apellido = scanner.nextLine();
        System.out.println("Ingrese la edad del estudiante:");
        int edad = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingrese la cedula del estudiante:");
        String cedula = scanner.nextLine();
    }

    static void verificarCalificaciones() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
class Estudiante {
    String nombre;
    String apellido;
    int edad;
    String cedula;

    public Estudiante(String nombre, String apellido, int edad, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cedula = cedula;
    }

    public boolean puedeRendirPrueba() {
        if (this.edad >= 17) {
            int diaPrueba = Integer.parseInt(this.cedula.substring(this.cedula.length() - 1));
            DayOfWeek hoy = LocalDate.now().getDayOfWeek();
            System.out.println("El estudiante puede rendir la prueba.");
        } else {
            System.out.println("El estudiante no cumple con los requisitos para rendir la prueba.");
        }
            return switch (diaPrueba) {
                case 0, 1 -> hoy.equals(DayOfWeek.MONDAY);
                case 2, 3 -> hoy.equals(DayOfWeek.TUESDAY);
                case 4, 5 -> hoy.equals(DayOfWeek.WEDNESDAY);
                case 6, 7 -> hoy.equals(DayOfWeek.THURSDAY);
                case 8, 9 -> hoy.equals(DayOfWeek.FRIDAY);
                default -> false;
            };
        return false
         
    }
    public static void verificarCalificaciones() {
        Scanner scanner = new Scanner(System.in);
        for (Estudiante estudiante : estudiantes) {
            System.out.println("Ingrese la calificación de " + estudiante.nombre + " " + estudiante.apellido + ":");
            int calificacion = Integer.parseInt(scanner.nextLine());
            if (calificacion > 15) {
                System.out.println(estudiante.nombre + " " + estudiante.apellido + " ha aprobado la prueba.");
            } else {
                System.out.println(estudiante.nombre + " " + estudiante.apellido + " no ha aprobado la prueba.");
            }
        }
    }
}      







        
        



