package clase;

import java.util.ArrayList;
import java.util.List;

public abstract class MijlocTransport {

    protected List<ICalator> calatori;

    public abstract void anuntaCalatori();

    public MijlocTransport() {
        this.calatori = new ArrayList<>();
    }

    public void adaugaCalar(ICalator calator) {
        calatori.add(calator);
    };
    public void stergeCalar(ICalator calator) {
        calatori.remove(calator);
    };
}
