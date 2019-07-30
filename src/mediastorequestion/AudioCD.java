package mediastorequestion;

import java.util.Date;

public class AudioCD extends Product {

    private final double AUDIO_CD_PRICE = 10.0;

    public AudioCD(int id, String title, Date dateBorrow) {
        super(id, title, dateBorrow);
    }

    @Override
    public double getPrice() {
        return AUDIO_CD_PRICE;
    }

    @Override
    public String toString() {
        return null;
    }
}
