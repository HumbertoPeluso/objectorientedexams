package mediastorequestion;

import java.time.LocalDate;

public class DVD extends Product {
    private final int BORROW_PERIOD_IN_DAYS = 7;
    private final double DVD_PRICE = 12.0;
    private final String TYPE = "DVD";

    public DVD(int id, String title, LocalDate dateBorrow) {
        super(id, title, dateBorrow);
    }

    @Override
    public double getPrice() {
        return DVD_PRICE;
    }

    @Override
    public int getBorrowPeriodInDays() {
        return BORROW_PERIOD_IN_DAYS;
    }

    @Override
    public String toString() {
        return "title: "+this.getTitle()+" " +
                "type: "+TYPE+ " " +"Fee: "+super.getFee()+"\n"+
                "....................";
    }
}
