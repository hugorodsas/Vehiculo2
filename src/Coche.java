public class Coche extends Vehiculo{
    private int numPuertas;

    public Coche(String marca, String modelo, int anio, int numPuertas) {
        super(marca, modelo, anio);
        this.numPuertas = numPuertas;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Numero de puertas: " + numPuertas);
    }

    /*@Override
    public String descripcioncorta(){
        return "Coche: " + marca + " " + modelo;
    }*/
}
