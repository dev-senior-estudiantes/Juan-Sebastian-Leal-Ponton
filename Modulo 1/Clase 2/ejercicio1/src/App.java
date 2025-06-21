
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {


       double precioOriginal = Double.parseDouble(JOptionPane.showInputDialog("Digite el precio original del producto: "));

        double porcentajeDescuento = Double.parseDouble(JOptionPane.showInputDialog("Digite el porcentaje de descuento"));

        double descuento = (precioOriginal * porcentajeDescuento) / 100;
        
        double totalPagar = precioOriginal - descuento ;

        System.out.println("El precio original es:"+precioOriginal);
        System.out.println("El descuento es: "+ descuento);
        System.out.println("El valor a pagar es "+totalPagar); 

      
    }
}
