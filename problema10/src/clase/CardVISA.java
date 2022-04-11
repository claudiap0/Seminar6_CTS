package clase;

public class CardVISA implements ModPlata{
    @Override
    public void platesteCalatoria(float pret) {
        System.out.println("A fost realizata plata cu card VISA in valoare de: " + pret);
    }
}
