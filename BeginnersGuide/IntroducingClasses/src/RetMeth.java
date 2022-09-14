public class RetMeth {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        int range1;
        int range2;

        range1 = minivan.range();
        range2 = sportscar.range();

        System.out.println("Мини-фургон может перевезти " + minivan.passengers + " пассажиров на расстояние " + range1 +
                " миль");
        System.out.println("Мини-фургон может перевезти " + minivan.passengers + " пассажиров на расстояние " + range2 +
                " миль");
    }
}
