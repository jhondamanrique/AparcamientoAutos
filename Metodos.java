
import java.util.Scanner;

public class Metodos {

    Scanner sc = new Scanner(System.in);

    public ObjVehiculo[][] LlenarCeldas(ObjVehiculo[][] m) {
        int numeroCelda = 1;
        {
            for (int i = 0; i < m.length; i++) {//filas
                for (int j = 0; j < m.length; j++) { //columnas
                    ObjVehiculo o = new ObjVehiculo();
                    System.out.println("Ingrese la marca del vehiculo");
                    o.setMarca(sc.next());
                    System.out.println("Ingrese el tipo del vehiculo");
                    o.setTipo(sc.next());
                    System.out.println("Ingrese el cilindraje del vehiculo");
                    o.setCilindraje(sc.nextInt());
                    if (o.getCilindraje() > 900 && o.getCilindraje() <= 1600) {
                        o.setPagoAnterior(150000);
                    } else if (o.getCilindraje() > 1600 && o.getCilindraje() <= 2000) {
                        o.setPagoAnterior(200000);
                    } else {
                        o.setPagoAnterior(250000);
                    }
                    o.setNumeroCelda(numeroCelda);
                    numeroCelda++;
                    m[i][j] = o;
                }

            }
            return m;
        }
    }

    public ObjVehiculo[][] calcularNuevoPago(ObjVehiculo[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                m[i][j].setPagoActual((int) (m[i][j].getPagoAnterior() * 1.23));

            }

        }
        return m;
    }

    public void mostrarInformacionCeldas(ObjVehiculo[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.println("Celda " + m[i][j].getNumeroCelda() + ":");
                System.out.println("Marca: " + m[i][j].getMarca());
                System.out.println("Tipo: " + m[i][j].getTipo());
                System.out.println("Cilindraje: " + m[i][j].getCilindraje());
                System.out.println("Pago Anterior: " + m[i][j].getPagoAnterior());
                System.out.println("Pago Actual: " + m[i][j].getPagoActual());
                System.out.println("---------------------------------- \n");
            }
        }
    }
}
