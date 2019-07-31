package mediastorequestion;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Product {
    private final double EXTRA_FEE = 0.50;
    private int id;
    private String title;
    private LocalDate dateBorrow, dateBack;

    public Product(int id, String title, LocalDate dateBorrow) {
        this.id = id;
        this.title = title;
        this.dateBorrow = dateBorrow;
    }

    public LocalDate getDateBorrow() {
        return dateBorrow;
    }

    public void setDateBorrow(LocalDate dateBorrow) {
        this.dateBorrow = dateBorrow;
    }

    public LocalDate getDateBack() {
        return dateBack;
    }

    public void setDateBack(LocalDate dateBack) {
        this.dateBack = dateBack;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getFee() {
        Double fee = this.getPrice();
        if (this.dateBack != null) {
            Long period = ChronoUnit.DAYS.between(dateBorrow, dateBack);
            if(period > this.getBorrowPeriodInDays())
                fee += (EXTRA_FEE * period) - (EXTRA_FEE * getBorrowPeriodInDays());
        }
        return fee;
    }

    public abstract double getPrice();

    public abstract int getBorrowPeriodInDays();

    public abstract String toString();

}
