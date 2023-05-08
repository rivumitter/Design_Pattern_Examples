package observer;

public class StationTwo implements Observer {
    @Override
    public void update() {
        System.out.println("Displaying data in StationTwo");
    }
}
