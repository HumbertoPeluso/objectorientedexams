package mediastorequestion;

import java.util.Date;

public class DVD extends Product{

private final double DVD_PRICE = 12.0;

    public DVD(int id, String title, Date dateBorrow) {
        super(id, title, dateBorrow);
    }

    @Override
    public double getPrice() {
        return DVD_PRICE;
    }

    @Override
    public String toString() {
        return null;
    }
}
