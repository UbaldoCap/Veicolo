public enum ListaSuoni {

    MOTO("ronft"),
    MACCHINA("beep");

    public String suono;
    ListaSuoni(String suono) {
        this.suono = suono;
    }

    public String getSuono() {
        return suono;
    }
}
