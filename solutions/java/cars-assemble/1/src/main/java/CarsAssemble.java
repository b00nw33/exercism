public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        // throw new UnsupportedOperationException("Please implement the CarsAssemble.productionRatePerHour() method");
        int CARS_PER_HOUR = 221;

        double success_rate = switch (speed) {
            case 1,2,3,4 -> 1;
            case 5,6,7,8 -> .9;
            case 9 -> .8;
            case 10 -> .77;
            default -> 0;
        };

        return CARS_PER_HOUR * speed * success_rate;
    }

    public int workingItemsPerMinute(int speed) {
        // throw new UnsupportedOperationException("Please implement the CarsAssemble.workingItemsPerMinute() method");

        return (int) productionRatePerHour(speed) / 60;
    }
}
