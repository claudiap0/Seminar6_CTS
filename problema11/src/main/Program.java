package main;

import clase.Autobuz;
import clase.Calator;
import clase.ICalator;
import clase.MijlocTransport;

public class Program {
    public static void main(String[] args) {
        MijlocTransport autobuz = new Autobuz(168);
        ICalator calator1 = new Calator("Ionescu");
        ICalator calator2 = new Calator("Vlad");
        ICalator calator3 = new Calator("Constantinescu");

        autobuz.adaugaCalar(calator1);
        autobuz.adaugaCalar(calator2);

        autobuz.anuntaCalatori();

        autobuz.stergeCalar(calator2);
        autobuz.stergeCalar(calator3);

        autobuz.anuntaCalatori();
    }
}
