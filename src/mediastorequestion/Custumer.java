package mediastorequestion;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.List;

public class Custumer {

    private int id;
    private String name;
    private LocalDate dateOfBirth;
    private boolean isAdult;

    public void borrow(List<Product> products){

        long age = LocalDate.from(dateOfBirth).until(LocalDate.now(), ChronoUnit.YEARS);

        if(age > 18)
            isAdult=true;
        else
            isAdult = false;



    }

}
