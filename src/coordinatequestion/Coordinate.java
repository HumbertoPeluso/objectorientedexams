package coordinatequestion;

public class Coordinate implements Magnitude { // implements is part of the solution
   // Modify the Coordinate class so that it properly implements the Magnitude interface. Two Coordinates should be
    // compared by first checking the x value. Whichever Coordinate has the smaller x value, then that Coordinate
    // will be taken as being smaller. If the two x values are the same, then use the y value as a decider.
    // Solve problem of both Coordinates being equal.


    private double x, y;

    public Coordinate (double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    public String toString()
    {
        return "(" + x + ", " + y + ")";
    }


    // solution
    @Override
    public boolean lessThan(Magnitude one, Magnitude two) {

        Coordinate coordinateOne = (Coordinate) one;
        Coordinate coordinateTwo = (Coordinate) two;

        if(coordinateOne.x < coordinateTwo.x)
            return true;
        if(coordinateOne.x > coordinateTwo.x)
            return false;

        // x are equal
        if(coordinateOne.y < coordinateTwo.y)
            return true;

        return false;
    }

    public static void main(String[]args){

        Magnitude one = new Coordinate(2, 4);
        one.lessThan(one, one);

    }
}
