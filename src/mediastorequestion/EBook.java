package mediastorequestion;

import java.time.LocalDate;

public class EBook extends Product {

    private final double EBOOK_PRICE = 7.0;
    private final int BORROW_PERIOD_IN_DAYS = 28;
    private final String TYPE = "EBOOK";

    public EBook(int id, String title, LocalDate dateBorrow) {
        super(id, title, dateBorrow);
    }

    @Override
    public double getPrice() {
        return EBOOK_PRICE;
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
