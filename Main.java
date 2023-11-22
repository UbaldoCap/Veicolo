public class Main {
    public static void main(String[] args) {
        Automobile automobile = new Automobile(0);
        Moto moto = new Moto(40);

        automobile.accellerare(20);
        automobile.decellerare(10);
        automobile.accellerare(5);
        automobile.fermarsi();

        moto.accellerare(10);
        moto.decellerare(20);
        moto.accellerare(3);
        moto.accellerare(0);
        moto.fermarsi();
    }
}
