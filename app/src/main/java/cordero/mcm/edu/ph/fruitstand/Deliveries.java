package cordero.mcm.edu.ph.fruitstand;

public class Deliveries {

    private int date;
    private String fruitsdlvr;

    public Deliveries(int date, String fruitsdlvr){
        this.date=date;
        this.fruitsdlvr=fruitsdlvr;

        Customer customInfo = new Customer(0000, "Info", "Davao","apple");
        Supplier supplyInfo = new Supplier(0000,"Prutasan sa Imong Mama", "Davao","apple");

        //set text lang for the parameters based dun sa data na i-encode.
    }

}
