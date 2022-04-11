package clase;

public class SMS implements ModPlata {

    @Override
    public void platesteCalatoria(float pret) {
        System.out.println("A fost realizata plata cprin SMS a sumei de: " + pret);
    }
}
