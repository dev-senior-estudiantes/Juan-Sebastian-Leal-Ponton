import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args)  {

        /*
         * melisa tiene n pesos
         * xiomara tiene la mitad de lo que tiene melisa
         * maria tiene la mitad de lo que tienen melisa y xiomara juntas
         * hacer  calcule y imprima la cantidad de dinero de las 3
         */

         double melisa = Double.parseDouble(JOptionPane.showInputDialog("DIgite la cantidad de pesos que tiene melisa: "));

         double xiomara = melisa / 2;

         double maria = (xiomara + melisa)/2;

         double total = melisa + xiomara + maria;

         System.out.println("El total de dinero que tienen las 3 es: "+ total);
        
    }
}
