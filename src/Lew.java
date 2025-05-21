public class Lew extends Zwierze {
    private double waga;

    public Lew(String nazwa, int wiek, double waga) {
        super(nazwa, wiek);
        this.waga = waga;
    }

    public double getWaga() {
        return waga;
    }

    @Override
    public String wydajDzwiek() {
        return "Roaar";
    }

    @Override
    public String poruszajSie() {
        return "Biegnie na czterech łapach.";
    }

    @Override
    public String srodowiskoNaturalne() {
        return "Sawanna afrykańska.";
    }

    public void pokazWage() {
        System.out.println("Lew waży " + waga + " kg.");
    }
}
