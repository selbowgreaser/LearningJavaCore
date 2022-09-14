public class Vehicle {
    int passengers;
    int fuelcap;
    int mpg;

    int range() {
        return fuelcap * mpg;
    }

    double fuelNeeded(int miles) {
        return (double) miles / mpg;
    }
}
