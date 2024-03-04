public class Shape {

    protected String shapeName; // ex. circle, triangle, etc.
    protected String itemName; // ex. pie, pizza slice, etc.
    protected double perimeter;
    protected double area;

    public Shape(String sName, String iName) {
        shapeName = sName;
        itemName = iName;
        perimeter = 0;
        area = 0;
    }

    public double calculateArea() {
        System.out.println(
                "!!! If this prints, you still have some work to do. There's not a formula for area of a \'shape\'");
        return -1;
    }

    public double calculatePerimeter() {
        System.out.println(
                "!!! If this prints, you still have some work to do. There's not a formula for perimeter of a \'shape\'");
        return -1;
    }

    // Two shapes are considered equal if they have the same shapeName, perimeter,
    // and area.
    public boolean equals(Shape other) {
        if (shapeName.equals(other.shapeName) && perimeter == other.perimeter && area == other.area)
            return true;
        else
            return false;
    }

    public String toString() {
        return "The " + itemName + " is a " + shapeName + " with a perimeter of " + perimeter + " and an area of "
                + area + ".";
    }
}
