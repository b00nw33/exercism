public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        return 40;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int timeElapsed){
        return expectedMinutesInOven() - timeElapsed;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layers){
        int MINUTES_PER_LAYER = 2;

        return layers * MINUTES_PER_LAYER;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layers, int timeElapsed){
        return preparationTimeInMinutes(layers) + timeElapsed;
    }
}
