import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double descuento = 0.10;

        System.out.println("Ingrese el valor de la compra: ");
        double valorCompra = scan.nextDouble();

        hacerDescuento(valorCompra, descuento);
    }

    public static void hacerDescuento (double valorCompra, double descuento){
        if (valorCompra >=120.0){
            double valorTotal = valorCompra - (valorCompra * descuento);
            System.out.println("Aplicando descuento, el valor total de su compra es: " + valorTotal);
        } else {
            System.out.println(" Descuento no aplicado, el valor de su compra es: " + valorCompra);
        }
    }
}
