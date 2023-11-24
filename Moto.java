public class Moto extends Veicolo implements SuonoRombo{

    public Moto(int velocita) {
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
        System.out.println("ronft");
    }

    @Override
    public void accendiRadio() {
        System.out.println("Mi dipiace non c'è radio");
    }
}
