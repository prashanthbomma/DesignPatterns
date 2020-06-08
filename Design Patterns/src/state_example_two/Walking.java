package state_example_two;

public class Walking implements TravelMode {
    @Override
    public Object getETA() {
        System.out.println("Calculating ETA for walking");
        return 4;
    }

    @Override
    public Object getDirections() {
        System.out.println("Calculating Direction for walking");
        return 2;
    }
}
