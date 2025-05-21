public class ZarzadzanieZoo {
    public static void main(String[] args) {
        Zwierze lew = new Lew("Lew Simba", 5, 250);
        Zwierze pingwin = new Pingwin("Pingwin Marek", 3,"Okoń" );
        Zwierze waz = new Wąż("Wąż Adam", 4, true);

        Zwierze[] zwierzeta = {lew, pingwin, waz};

        for (Zwierze z : zwierzeta) {
            z.wyswietlInformacje();
            System.out.println("Dźwięk: " + z.wydajDzwiek());
            System.out.println("Ruch: " + z.poruszajSie());
            System.out.println("Środowisko: " + z.srodowiskoNaturalne());
            System.out.println();

        if (z instanceof Lew) {
            ((Lew) z).pokazWage();
        } else if (z instanceof Pingwin) {
            ((Pingwin) z).ślizg();
        } else if (z instanceof Wąż) {
            ((Wąż) z).ukas();
        }

        System.out.println();
    }
    }
}
