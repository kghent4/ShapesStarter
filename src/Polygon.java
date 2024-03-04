public class Polygon extends Shape {

    // Instance Variables
    protected int numSides;
    protected int numAngles;

    public Polygon(String sName, String iName, int nSides, int nAngles) {
        super(sName, iName);
        numSides = nSides;
        numAngles = nAngles;
    }

    public String toString() {
        String ret = super.toString();
        ret += "\nLike all " + shapeName + "s, it has " + numSides + " sides and " + numAngles
                + " interior angles.";
        return ret;
    }
}
