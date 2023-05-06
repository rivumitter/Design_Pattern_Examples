package decorator;

public class DecoratorMain {
    public static void main(String[] args) {

        Burger burger1 = new ZingerBurger("Zinger Burger",200);

        System.out.println("Normal Burger"+burger1);

        burger1 = new ToppingsMayo(burger1);

        System.out.println("After adding Mayo: "+burger1.getDescription() + burger1.getCost());

        burger1 = new ToppingCheese(burger1);

        System.out.println("After adding cheese: "+burger1.getDescription() + burger1.getCost());

    }
}
