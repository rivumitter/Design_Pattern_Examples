package observer;

public class ObserverMain {
    public static void main(String[] args) {
        Observable observable = new WeatherStation();

        var stationOne = new StationOne();
        var stationTwo = new StationTwo();

        observable.registerObserver(stationOne);
        observable.registerObserver(stationTwo);

        observable.notifyObservers();

        //////////////////////
        System.out.println("----After deregister----");

        observable.removeObserver(stationOne);
        observable.notifyObservers();
    }
}
