public class Sheep implements  Animal {

    public Sheep() {
        System.out.println("Sheep is Made");
    }

    @Override
    public Animal makeCopy() {
        System.out.println("Sheep is Being Made");

        Sheep sheep = null;

        try {
            sheep = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return sheep;
    }

    @Override
    public String toString() {
        return "Sheep{}";
    }
}
