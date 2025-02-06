import java.awt.print.Book;

public class Customer {


    private String name;
    private String gender;
    private int cashOnHand;

    public Customer(String gender, int cashOnHand, String name) {
        this.gender = gender;
        this.cashOnHand = cashOnHand;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    public int getCashOnHand() {
        return cashOnHand;
    }

    public void setCashOnHand(int cashOnHand) {
        this.cashOnHand = cashOnHand;
    }

    public void purchase(Vehicle vehicle, Employee employee, Boolean finance) {
        employee.handleCustomer(this, finance, vehicle);
    }

}



