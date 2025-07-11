import java.util.Scanner;

public class App {
    private static String estudianteActualNombre = "N/A";
    private static double nota1 = 0.0;
    private static double nota2 = 0.0;
    private static double nota3 = 0.0;
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in); 
        int opcion;
        do {
            mostrarMenu();
            System.out.println("Ingrese su opcion ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    registrarEstudiante(scanner);
                    break;
                case 2:
                    mostrarEstudiante();
                    break;
                case 3:
                    double promedio = calcularPromedio();
                    if (promedio >= 0){
                        System.out.printf("El promedio del estudiante es: %.2f%n ", promedio);
                    }
                    break;
                case 0:
                    System.out.println("Gracias por usar el registro de estudiantes.");
                    break;
            
                default:
                    System.out.println("Opcion no valida intente de nuevo");
                    break;
            }
            if (opcion != 0) {
                System.out.println("\nPresione Enter para continuar...");
                scanner.nextLine(); // Limpiar el buffer
                scanner.nextLine(); // Esperar Enter
            }
        } while (opcion != 0);
        scanner.close();
    }
    public static void mostrarMenu(){
        System.out.println("\n ...Sistema de registro de estudiantes... ");
        System.out.println("1. Registrar estudiante ");
        System.out.println("2. Mostrar datos del estudiante ");
        System.out.println("3. Calcular promedio del estudiante");
        System.out.println("0. Salir ");
    }
     public static void registrarEstudiante(Scanner scanner){
        System.out.println("\n--REGISTRO DE ESTUDIANTE--");
        String nombre;
        do{
            System.out.println("Ingrese el nombre del estudiante: ");
            scanner.nextLine();
            nombre = scanner.nextLine();
            if (!validarNombre(nombre)){
                System.out.println("Error: el nombre no puede estar vacio ");
            }
        }while(!validarNombre(nombre));

        double nota1,nota2,nota3;
        do {
            System.out.println("Ingrese la primera nota: ");
            nota1 = scanner.nextDouble();
            if(!validarNota(nota1)){
                System.out.println("La nota debe estar entre 0 y 100. ");
            }
        }while(!validarNota(nota1));
        do {
            System.out.println("Ingrese la segunda nota: ");
            nota2 = scanner.nextDouble();
            if(!validarNota(nota2)){
                System.out.println("La nota debe estar entre 0 y 100. ");
            }
        }while(!validarNota(nota2));
        do {
            System.out.println("Ingrese la tercera nota: ");
            nota3 = scanner.nextDouble();
            if(!validarNota(nota3)){
                System.out.println("La nota debe estar entre 0 y 100. ");
            }
        }while(!validarNota(nota3));

        App.estudianteActualNombre = nombre;
        App.nota1 = nota1;
        App.nota2 = nota2;
        App.nota3 = nota3;

        System.out.println("Estudiante registrado exitosamente");
        
    }
     public static void mostrarEstudiante(){
        System.out.println("\n ---Informacion del estudiante--- ");
        if (estudianteActualNombre.equals("N/A")){
            System.out.println("No hay ningún estudiante registrado.");
            System.out.println("Por favor, registre un estudiante primero (opción 1).");
        }else{
            System.out.println("Nombre: " + estudianteActualNombre);
            System.out.printf(" Nota 1: %.2f%n ", nota1);
            System.out.printf("Nota 2: %.2f%n ", nota2);
            System.out.printf("Nota 3: %.2f%n ", nota3);
        }
    }
     public static double calcularPromedio(){
          if (estudianteActualNombre.equals("N/A")){
            System.out.println("No hay ningún estudiante registrado.");
            System.out.println("Por favor, registre un estudiante primero (opción 1).");
            return -1;
        }
        double promedio = (nota1+nota2+nota3)/3.0;
        return promedio;
    }
     public static boolean validarNota(double nota) {
        return nota >= 0 && nota <= 100;
    }
     public static boolean validarNombre(String nombre) {
        return nombre != null && !nombre.trim().isEmpty();
    }
}
