package mediastorequestion;

import java.time.LocalDate;
import java.time.Period;

public class AudioCD extends Product {

    private final double AUDIO_CD_PRICE = 10.0;
    private final int BORROW_PERIOD_IN_DAYS = 14;
    private final String TYPE = "AudioCD";

    public AudioCD(int id, String title, LocalDate dateBorrow) {
        super(id, title, dateBorrow);
    }

    @Override
    public double getPrice() {
        return AUDIO_CD_PRICE;
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
