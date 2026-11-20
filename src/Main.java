public class Main {

    static void main(String[] args) {

        Coche coche = new Coche("Toyota", "Corolla",1990,4);
        Moto moto = new Moto("motoaza","alucinante",2026,1000);


        coche.mostrarInformacion();
        System.out.println("---------------------");
        System.out.println(coche.descripcionCorta());
        System.out.println("---------------------");
        moto.mostrarInformacion();
        System.out.println("---------------------");
        System.out.println(moto.descripcionCorta());
    }
}

