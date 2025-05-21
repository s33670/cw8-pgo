public class Wąż extends Zwierze {
    private boolean jadowity;

    public Wąż(String nazwa, int wiek, boolean jadowity) {
        super(nazwa, wiek);
        this.jadowity = jadowity;
    }

    @Override
    public String wydajDzwiek() {
        return "Sss";
    }

    @Override
    public String poruszajSie() {
        return "Pełznie po ziemi.";
    }

    @Override
    public String srodowiskoNaturalne() {
        return "Dżungla.";
    }

    public void ukas() {
        System.out.println("Wąż atakuje");
    }
}
