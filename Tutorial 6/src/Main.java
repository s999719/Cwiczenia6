public class Main {
    public static void main(String[] args) {

        Car bugattiChiron = new Car("Bugatti", "Chiron", 2022, 5000, 400);
        Truck scania = new Truck("Scania", "R500", 2020, 25000, 1500, 8);

        System.out.println("Bugatti Chiron Info:");
        bugattiChiron.printInfo();
        System.out.println();

        System.out.println("Scania Info:");
        scania.printInfo();
    }
}