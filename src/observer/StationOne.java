package observer;

public class StationOne implements Observer{
    @Override
    public void update() {
        System.out.println("Displaying data in StationOne");
    }
}
