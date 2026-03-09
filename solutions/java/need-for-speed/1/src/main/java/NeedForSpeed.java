class NeedForSpeed {
    private int speed;
    private int batteryDrain;
    private int distanceDriven;
    private int batteryRemaining;

    public NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        this.distanceDriven = 0;
        this.batteryRemaining = 100;
    }

    public boolean batteryDrained() {
        return batteryRemaining < batteryDrain;
    }

    public int distanceDriven() {
        return distanceDriven;
    }

    public void drive() {
        if (!batteryDrained()) {
            distanceDriven += speed;
            batteryRemaining -= batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }

    public int getSpeed() {
        return speed;
    }

    public int getBatteryDrain() {
        return batteryDrain;
    }
}

class RaceTrack {

    private int distance;

    public RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        int maxDistance = (100 / car.getBatteryDrain()) * car.getSpeed();
        return maxDistance >= distance;
    }
}
