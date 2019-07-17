public class Main {

    public static void main(String[] args) {

        Pizza basicPizza = new TomatoSouce(new Mozzarella(new PlainPizza()));

        System.out.println("Description" + basicPizza.getDescription());

    }

}
