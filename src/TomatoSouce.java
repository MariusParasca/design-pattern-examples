public class TomatoSouce extends ToppingDecorator {
    public TomatoSouce(Pizza tempPizza) {
        super(tempPizza);

        System.out.println("Adding Dough");

        System.out.println("Adding Tomato Souce");
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription() + ", TomatoSouce";
    }

    @Override
    public double getCost() {
        return tempPizza.getCost() + .40;
    }

}
