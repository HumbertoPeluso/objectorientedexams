package mediastorequestion;

import java.util.Date;

public abstract class Product {

    private int id;
    private String title;
    private Date dateBorrow, dateBack;

    public Product(int id, String title, Date dateBorrow) {
        this.id = id;
        this.title = title;
        this.dateBorrow = dateBorrow;
    }

    public Date getDateBorrow() {
        return dateBorrow;
    }

    public void setDateBorrow(Date dateBorrow) {
        this.dateBorrow = dateBorrow;
    }

    public Date getDateBack() {
        return dateBack;
    }

    public void setDateBack(Date dateBack) {
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

    public abstract double getPrice();

    public abstract String toString();

}
