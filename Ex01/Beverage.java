package Ex01;

import java.util.Calendar;

public class Beverage extends Product implements Comparable<Beverage> {
    private double volume;

    public Beverage(String name, int price, int quantity, Calendar bestBefore, double volume){
        super(name, price, quantity, bestBefore);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString(){
        return "Product [name= " + getName() + ", price= " + getPrice() + ", quantity= " + getQuantity() + ", bestBefore= " 
        + getBestBefore().get(Calendar.YEAR) + "/" + getBestBefore().get(Calendar.MONTH) + "/" + getBestBefore().get(Calendar.DAY_OF_MONTH) + ", volume= " + volume + "]" + "\n";
    }

    @Override
    public int compareTo(Beverage o) {
        int result;
        result = Double.compare(this.getVolume(), o.getVolume());
        return result;
    }

    
}
