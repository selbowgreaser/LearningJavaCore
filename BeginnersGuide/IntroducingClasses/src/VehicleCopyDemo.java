public class VehicleCopyDemo {
    public static void main(String[] args) {
        Vehicle car1 = new Vehicle();
        Vehicle car2 = car1;
        Vehicle car3 = new Vehicle();

        car1.mpg = 26;
        car3.mpg = 13;

        System.out.println(car1.mpg);
        System.out.println(car2.mpg);
        System.out.println(car3.mpg);
    }
}
