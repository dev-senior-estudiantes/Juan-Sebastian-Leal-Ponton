public class App {
    public static void main(String[] args) {
         /*
         * en dev senior para la cerificacion del modulo 4 se promedia 4 notas
         * 1 nota - 35%
         * 2 nota 0.25%
         * 3 nota 0.40%
         * calcular el promedio del estudiante
         */

         Scanner entrada = new Scanner(System.in);

         // declarar variables y pedir datos por consola
         float n1, n2, n3;
         System.out.print("Digite la nota 1 ");
         n1 = entrada.nextFloat();
         System.out.print("Digite la nota 2 ");
         n2 = entrada.nextFloat();
         System.out.print("Digite la nota 3 ");
         n3 = entrada.nextFloat();

         //operaciones 
         //n1 = n1 * 0.10f;
         n1 *= 0.35f;
         n2 *= 0.25F;
         n3 *= 0.40f;

         float promedio = n1 + n2 +n3;

         System.out.println("El promedio es: "+promedio);
    }
}
