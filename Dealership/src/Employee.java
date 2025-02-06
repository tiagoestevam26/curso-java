public class Employee {

    private String name;


    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void runCreditHistory(Customer customer, double loanAmount, Vehicle vehicle) {
        boolean approved = (Math.random() > 0.4);
        if (approved) {
            System.out.println("\nApproved Credit for Customer " + customer.getName()+" with loan amount " + loanAmount+"!");
            processTransaction(customer,vehicle);
        }
        else {
            System.out.println("\nDeclined Credit for Customer " + customer.getName()+"!");
        }
    }

    public void processTransaction(Customer customer, Vehicle vehicle) {
        vehicle.setOwner(customer);
        System.out.println("\nThe transaction has been processed! " +vehicle.getModel() + " " + vehicle.getYear() + " is now property of " + vehicle.getOwner().getName()+"!");
    }

    public void handleCustomer(Customer customer, boolean finance, Vehicle vehicle) {
        if(vehicle.isAvailable()==false) {
            System.out.println("\n"+vehicle.getModel()+" " +vehicle.getYear()+" is no longer available!");
        } else if(finance == true){
            runCreditHistory(customer, vehicle.getPrice() - customer.getCashOnHand(), vehicle);
        } else if (vehicle.getPrice() < customer.getCashOnHand()) {
            processTransaction(customer, vehicle);
        } else{
            System.out.println("\nCustomer does not have enough cash on hand!");
        }


    }


}
