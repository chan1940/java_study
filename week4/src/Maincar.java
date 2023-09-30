public class Maincar {
    public static void main(String[] args) {

        Sonata sn = new Sonata();
        Genesis gn = new Genesis();

        sn.speedUp();
        System.out.println(sn.getSpeed());
        gn.speedUp();
        System.out.println(gn.getSpeed());
        sn.speedUp();
        System.out.println(sn.getSpeed());
        sn.speedDown();
        System.out.println(sn.getSpeed());

    }
}
