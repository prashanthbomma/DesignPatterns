package state_example_two;

public class Bicyling implements TravelMode {
    @Override
    public Object getETA() {
        System.out.println("Calculating ETA for bicycling");
        return 2;
    }

    @Override
    public Object getDirections() {
        System.out.println("Calculating Direction for bicycling");
        return 2;
    }
}
