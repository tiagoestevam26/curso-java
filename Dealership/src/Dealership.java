


public class Dealership {
    public static void main(String[] args) {

        Vehicle vehicle1 = new Vehicle("Siena", 2006, "black", 15000);
        Vehicle vehicle2 = new Vehicle("Ranger", 2001, "grey", 80000);
        Customer customer1 = new Customer("male", 10000, "Tiago");
        Customer customer2 = new Customer("female", 100000, "Violet");
        Employee employee1 = new Employee("Martha");


        customer1.purchase(vehicle1, employee1, false);
        customer2.purchase(vehicle2, employee1, false);
        customer1.purchase(vehicle1, employee1, true);
        customer2.purchase(vehicle1, employee1, false);



    }

}

