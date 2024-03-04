import java.util.ArrayList;

public class Main {

    // Variable(s)
    public static ArrayList<Shape> shapes = new ArrayList<Shape>();

    public static void main(String[] args) {

        // Add shapes to list
        Shape pie = new Circle("pie", 5); // argument is radius
        Shape mint = new Circle("mint", 1);

        Shape pizzaSlice = new Triangle("pizza slice", 2, 3, 4, 2, 3); // arguments are sideLen1, sideLen2, sideLen3
        Shape cheeseCake = new Triangle("cheese cake", 2, 3, 4, 2, 3);

        Shape candyBar = new Rectangle("candy bar", 3, 1); // arguments are width, height
        Shape brownie = new Rectangle("brownie", 5, 5);

        shapes.add(pie);
        shapes.add(mint);
        shapes.add(pizzaSlice);
        shapes.add(cheeseCake);
        shapes.add(candyBar);
        shapes.add(brownie);

        System.out.println("\nLearning About Shapes!\n");

        for (Shape s : shapes) {
            System.out.println(s + "\n");
        }

    }
}
