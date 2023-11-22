public class Veicolo {
    private int velocita;

    public Veicolo(int velocita) {
        this.velocita = velocita;
    }

    public int getVelocita() {
        return velocita;
    }

    public void setVelocita(int velocita) {
        this.velocita = velocita;
    }

    public void accellerare(int valore) {
        if (valore == 0) {
            System.out.println("velocità costante " + velocita);
        } else {
            int velocitafinale = (velocita + valore);
            for (int i = velocita; i < velocitafinale; i++) {
                velocita++;
                System.out.println("accellerare " + velocita);
            }
        }
    }

    public void decellerare(int valore) {
        if (valore > velocita) {
            valore = velocita;
        }
        for (int i = (velocita - valore) ; i < velocita ; velocita--) {
            System.out.println("decellerare " + (velocita - 1));
        }
    }

    public void fermarsi() {
        velocita--;
        for (int i = 0; i <= velocita; velocita--) {
            System.out.println("fermarsi " + velocita);
        }
    }
}
