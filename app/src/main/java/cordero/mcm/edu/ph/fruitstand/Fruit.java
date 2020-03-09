package cordero.mcm.edu.ph.fruitstand;

public class Fruit {

    private String fruitType;
    private double fruitPrice;

    public Fruit(String fruitType, double fruitPrice){
        this.fruitType = fruitType;
        this.fruitPrice = fruitPrice;
    }

    public void setFruitType(String fruitType){
        this.fruitType = fruitType;
    }
    public String getFruitType(){
        return fruitType;
    }
    public void setFruitPrice(double fruitPrice){
        this.fruitPrice = fruitPrice;
    }
    public double getFruitPrice(){
        return fruitPrice;
    }
}
