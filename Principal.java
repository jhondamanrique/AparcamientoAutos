
import java.util.Scanner;

public class Principal{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Metodos m = new Metodos();
        int n = 0;//tamaño de la matriz
        System.out.println("Ingrese el tamaño de la matriz");
        n = sc.nextInt();
        ObjVehiculo[][] matriz = new ObjVehiculo[n][n];
        matriz = m.LlenarCeldas(matriz);
        System.out.println("Calculando nuevo pago...");
        matriz = m.calcularNuevoPago(matriz);
        m.mostrarInformacionCeldas(matriz);
    }
}