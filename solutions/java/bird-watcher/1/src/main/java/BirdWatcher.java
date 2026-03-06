import java.util.Arrays;

class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        // throw new UnsupportedOperationException("Please implement the BirdWatcher.getLastWeek() method");
        return birdsPerDay;
    }

    public int getToday() {
        // throw new UnsupportedOperationException("Please implement the BirdWatcher.getToday() method");
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        // throw new UnsupportedOperationException("Please implement the BirdWatcher.incrementTodaysCount() method");
        birdsPerDay[birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        // throw new UnsupportedOperationException("Please implement the BirdWatcher.hasDayWithoutBirds() method");
        return Arrays.stream(birdsPerDay).anyMatch(n -> n == 0);
    }

    public int getCountForFirstDays(int numberOfDays) {
        // throw new UnsupportedOperationException("Please implement the BirdWatcher.getCountForFirstDays() method");
        return Arrays.stream(birdsPerDay).limit(numberOfDays).sum();
    }

    public int getBusyDays() {
        // throw new UnsupportedOperationException("Please implement the BirdWatcher.getBusyDays() method");
        return (int) Arrays.stream(birdsPerDay).filter(n -> n >= 5).count();
    }
}
