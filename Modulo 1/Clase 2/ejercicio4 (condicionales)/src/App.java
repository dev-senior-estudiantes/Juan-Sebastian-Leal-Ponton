import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        /*
         *  if(condicion){
         *      intruciones
         *  }
         * else if{
         * 
         * }
         * else{
         * 
         *      instruciones
         * }
         */

         Scanner entrada = new Scanner(System.in);

         System.out.print("DIgite el numero: ");
         int numero = entrada.nextInt();

         //implementar condicional

         if(numero == 0){
            System.out.println("El numero "+numero+" es nulo");
         } 
         else if(numero > 0){
            System.out.println("El numero "+numero+" es positivo");
         }
         else {
            System.out.println("El numero "+numero+" es negativo");
         }
        
    }
}
