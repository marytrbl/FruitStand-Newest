package cordero.mcm.edu.ph.fruitstand;

public class Fruit {

    private String fruitType;
    private int fruitPrice;

    public Fruit(String fruitType, int fruitPrice){
        this.fruitType = fruitType;
        this.fruitPrice = fruitPrice;
    }

    public void setFruitType(String fruitType){
        this.fruitType = fruitType;
    }
    public String getFruitType(){
        return fruitType;
    }
    public void setFruitPrice(int fruitPrice){
        this.fruitPrice = fruitPrice;
    }
    public int getFruitPrice(){
        return fruitPrice;
    }
}
