public class ObjVehiculo{
    private String Marca;
    private String Tipo;
    private int Cilindraje;
    private int PagoAnterior;
    private int PagoActual;
    private int NumeroCelda;

    public ObjVehiculo(int Cilindraje, String Marca, int NumeroCelda, int PagoActual, int PagoAnterior, String Tipo) {
        this.Cilindraje = Cilindraje;
        this.Marca = Marca;
        this.NumeroCelda = NumeroCelda;
        this.PagoActual = PagoActual;
        this.PagoAnterior = PagoAnterior;
        this.Tipo = Tipo;
    }
    public ObjVehiculo() {
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public int getCilindraje() {
        return Cilindraje;
    }

    public void setCilindraje(int Cilindraje) {
        this.Cilindraje = Cilindraje;
    }

    public int getPagoAnterior() {
        return PagoAnterior;
    }

    public void setPagoAnterior(int PagoAnterior) {
        this.PagoAnterior = PagoAnterior;
    }

    public int getPagoActual() {
        return PagoActual;
    }

    public void setPagoActual(int PagoActual) {
        this.PagoActual = PagoActual;
    }

    public int getNumeroCelda() {
        return NumeroCelda;
    }

    public void setNumeroCelda(int NumeroCelda) {
        this.NumeroCelda = NumeroCelda;
    }

}