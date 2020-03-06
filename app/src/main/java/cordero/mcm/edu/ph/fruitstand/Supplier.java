package cordero.mcm.edu.ph.fruitstand;

public class Supplier {

    private String name, location, fruit;
    private int supplierID;

    public Supplier(int supplierID, String name, String location, String fruit){
        this.supplierID = supplierID;
        this.name = name;
        this.fruit = fruit;
        this.location = location;
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
    public void setFruit(String fruit){
        this.fruit = fruit;
    }
    public String getFruit(){
        return fruit;
    }
    public void setSupplierID(int supplierID){
        this.supplierID = supplierID;
    }
    public int getSupplierID(){
        return supplierID;
    }

}
