import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
        /*
         * el gobierno lanza un projecto de ayudas economicas para su poblacion dependiendo su estrato
         * estrato 0 = 5.000.000
         * estrato 1 = 3.500.000
         * estarto 2 = 2.500.000
         * estrato 3 = 1.000.000
         * estrato 4 = 0
         * estrato 5 impuesto = 2.500.000
         * estrato 6 impuesto = 5.000.000
         * mayor a estrato 6 error
         * menores a 0 error
         * donero destinado para compra de vivienda
         */

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite su estrato: ");
        int estrato = entrada.nextInt();
        System.out.print("Digite el valor de la vivienda: ");
        double valor = entrada.nextDouble();

        if (estrato == 0 ){
            System.out.println("El valor sin descuento es: "+valor);
            double descuento = 5000000;
            System.out.println("El descuento es de: "+ descuento);
            double total = valor - descuento;
            System.out.println("El valor con descuento es: "+total);
        }
        else if(estrato == 1){
            System.out.println("El valor sin descuento es: "+valor);
            double descuento = 3500000;
            System.out.println("El descuento es de: "+ descuento);
            double total = valor - descuento;
            System.out.println("El valor con descuento es: "+total);
        }
          else if(estrato == 2){
            System.out.println("El valor sin descuento es: "+valor);
            double descuento = 2500000;
            System.out.println("El descuento es de: "+ descuento);
            double total = valor - descuento;
            System.out.println("El valor con descuento es: "+total);
        }
          else if(estrato == 3){
            System.out.println("El valor sin descuento es: "+valor);
            double descuento = 1000000;
            System.out.println("El descuento es de: "+ descuento);
            double total = valor - descuento;
            System.out.println("El valor con descuento es: "+total);
        }
          else if(estrato == 4){
            System.out.println("El valor sin es: "+valor+" no tiene descuento");
        }
          else if(estrato == 5){
            System.out.println("El valor es: "+valor);
            double impuesto = 2500000;
            System.out.println("El impuesto es de: "+ impuesto);
            double total = valor + impuesto;
            System.out.println("El valor con impuesto es: "+total);
        }
        else if(estrato == 6){
            System.out.println("El valor es: "+valor);
            double impuesto = 5000000;
            System.out.println("El impuesto es de: "+ impuesto);
            double total = valor + impuesto;
            System.out.println("El valor con impuesto es: "+total);
        }
        else {
            System.out.println("error");
        }

        
        
        
        






    }
}
