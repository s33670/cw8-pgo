public class Pingwin extends Zwierze {
    private String ulubionaRyba;

    public Pingwin(String nazwa, int wiek, String ulubionaRyba) {
        super(nazwa, wiek);
        this.ulubionaRyba = ulubionaRyba;
    }

    @Override
    public String wydajDzwiek() {
        return "kwa kwa";
    }

    @Override
    public String poruszajSie() {
        return "Chodzi chwiejąc się";
    }

    @Override
    public String srodowiskoNaturalne() {
        return "Antarktyda";
    }

    public void ślizg() {
        System.out.println("Pingwin ślizga się na brzuchu");
    }
}
