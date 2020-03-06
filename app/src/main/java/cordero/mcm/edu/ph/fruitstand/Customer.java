package cordero.mcm.edu.ph.fruitstand;

public class Customer {

    private String name, location, fruit;
    private int customerID;

    public Customer(int customerID, String name, String location, String fruit){
        this.customerID = customerID;
        this.name = name;
        this.location = location;
        this.fruit = fruit;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setLocation(String location){
        this.location = location;
    }
    public String getLocation(){
        return location;
    }
    public void setFruit (String fruit){
        this.fruit = fruit;
    }
    public String getFruit(){
        return fruit;
    }
    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }
    public int getCustomerID() {
        return customerID;
    }


}
