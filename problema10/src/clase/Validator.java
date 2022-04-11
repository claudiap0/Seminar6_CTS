package clase;

public class Validator {

    private float pretCalatorie;
    private ModPlata modPlata;

    public Validator(float pretCalatorie) {
        this.pretCalatorie = pretCalatorie;
        setModPlata(new CardVISA());
    }

    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }

    public void validareCalatorie() {
        modPlata.platesteCalatoria(pretCalatorie);
    }
}
