public class Automobile extends Veicolo implements SuonoRombo {

    public Automobile(int velocita) {
        super(velocita);
    }

    @Override
    public void accellerare(int valore) {
        super.accellerare(valore);
    }

    @Override
    public void decellerare(int valore) {
        super.decellerare(valore);
    }

    @Override
    public void fermarsi() {
        super.fermarsi();
    }

    @Override
    public void suonaClacson() {
        System.out.println(ListaSuoni.MACCHINA.getSuono());
    }

    @Override
    public void accendiRadio() {
        System.out.println("Radio accesa per la macchina");
    }
}
