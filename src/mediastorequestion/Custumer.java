package mediastorequestion;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Custumer {

    private int id;
    private String name;
    private LocalDate dateOfBirth;
    private List<Product> borrowedProducts = new ArrayList<>();
    private boolean isAdult;

    public Custumer(int id, String name, LocalDate dateOfBirth) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.isAdult = LocalDate.from(dateOfBirth).until(LocalDate.now(), ChronoUnit.YEARS) >= 18;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public List<Product> getBorrowedProducts() {
        return borrowedProducts;
    }

    public void setBorrowedProducts(List<Product> borrowedProducts) {
        this.borrowedProducts = borrowedProducts;
    }

    public boolean isAdult() {
        return isAdult;
    }

    public void setAdult(boolean adult) {
        isAdult = adult;
    }

    public void borrow(Product product) {

        product.setDateBorrow(LocalDate.now());
        this.borrowedProducts.add(product);

    }

    public void returnProduct(Product product, LocalDate date){
        product.setDateBack(date);
    }

    public String toString(){
        String custumer = "Nome: "+name+"\n";
        String products = "Products: ";
        for(Product product:borrowedProducts){
            products += product.toString()+"\n";
        }
        return custumer+products;
    }

}
