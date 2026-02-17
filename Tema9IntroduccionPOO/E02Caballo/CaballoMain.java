package Tema9IntroduccionPOO.E02Caballo;

public class CaballoMain {

    public static void main(String[] args) {
        Caballo babieca = new Caballo("Babieca", 6);
        Caballo lykos = new Caballo("Lykos", 10);
        Gato felix = new Gato("Felix", 2);
        Gato rosa = new Gato("Rosa", 1);

        lykos.setDieta("algarrobas");
        lykos.setNombre("dhfsfhgsdhgs");



        System.out.println(babieca.decirNombre());
        System.out.println(babieca.cabalgar());
        System.out.println(babieca.relinchar());
        System.out.println(lykos.decirNombre());
        System.out.println(lykos.comer());
        System.out.println(lykos.cabalgar());

        System.out.println();

        System.out.println(felix.decirNombre());
        System.out.println(felix.maullar());
        System.out.println(rosa.decirNombre());
        System.out.println(rosa.ronronear());

    }
}
