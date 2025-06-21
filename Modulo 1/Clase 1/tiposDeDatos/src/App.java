import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        

        // entrada de datos por panel
        String nombre = JOptionPane.showInputDialog("Digite el nombre: ");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Digite la edad: "));
        float estatura = Float.parseFloat(JOptionPane.showInputDialog("Digite la estatura: "));
        double sueldo = Double.parseDouble(JOptionPane.showInputDialog("Digite el sueldo: "));
        char letra = JOptionPane.showInputDialog("Digite la letra: ").charAt(0);

        // salida de datos por ventana emergente
        JOptionPane.showMessageDialog(null, "El nombre es: " + nombre);
        JOptionPane.showMessageDialog(null, "La edad es: " + edad);
        JOptionPane.showMessageDialog(null, "El sueldo es: " + sueldo);




















        // entrada de datos por consola // = operador de asignacion

       // Scanner entrada = new Scanner(System.in);

       // int edad;
        //String nombre;
        //float estatura;
        //char letra;


        //System.out.print("Digite la edad: ");
        //edad = entrada.nextInt();
        //entrada.nextLine();//limpiar el buffer
        //System.out.print("DIgite el nombre: ");
        //nombre = entrada.nextLine();
        //System.out.print("Digite su estatura: ");
        //estatura = entrada.nextFloat();
        //System.out.print("Digite una letra: ");
        //letra = entrada.next().charAt(1);

        // declarar variables con literal de informacion

        //byte edad = 127;
        //float estatura = 1.76f;
        //double salario = 4.000;

        //imprimir datos por consola
        //System.out.println("La edad es: "+edad+ "\nEl nombre es: "+ nombre + "\nLa estatura es: "+estatura);


    }
}
