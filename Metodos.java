
import java.util.Scanner;

public class Metodos {
    Scanner sc = new Scanner(System.in);
    public ObjVehiculo[][] LlenarCeldas(ObjVehiculo[][] m){
        int numeroCelda = 1;
    {
        for (int i = 0; i < m.length; i++) {//filas
            for (int j = 0; j < m.length; j++) { //columnas
                ObjVehiculo o = new ObjVehiculo();
                System.out.println ("Ingrese la marca del vehiculo");
                o.setMarca(sc.next());
                System.out.println("Ingrese el tipo del vehiculo");
                o.setTipo(sc.next());
                System.out.println("Ingrese el cilindraje del vehiculo");
                o.setCilindraje(sc.nextInt());
                if(o.getCilindraje() > 900 && o.getCilindraje() <= 1600)
                {
                    o.setPagoActual(150000);
                }
                    
                else if(o.getCilindraje() > 1600 && o.getCilindraje() <= 2000)
                {
                    o.setPagoActual(200000);
                }
                else
                {
                    o.setPagoActual(250000);
                }
                o.setNumeroCelda(numeroCelda);
                numeroCelda++;
                m[i][j] = o;            
            }
            
        }    
        return m;
    }
    }
    public ObjVehiculo[][] calcularNuevoPago(ObjVehiculo[][] m){
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {

            
        }
        return m;
    }
}
}

    
