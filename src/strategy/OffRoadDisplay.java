package strategy;

public class OffRoadDisplay implements DisplayStrategy{
    @Override
    public void display() {
        //code duplication as Sports car (say both has same display )
        System.out.println("OffRoad Car Display...");
    }
}
