package Ex01;

import java.util.Calendar;
import java.util.GregorianCalendar;


// Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат, содержащий в себе методы
// initProducts (List <Product>) сохраняющий в себе список исходных продуктов и getProduct(String name)

public abstract class Product {
    
    private int id = 0;
    private String name;
    private int price;
    private int quantity;
    private Calendar bestBefore;
    

    public Product (String name, int price, int quantity, Calendar bestBefore) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.bestBefore = bestBefore;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public Calendar getBestBefore() {
        return bestBefore;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setBestBefore(GregorianCalendar bestBefore) {
        this.bestBefore = bestBefore;
    }

    

    @Override
    public String toString(){
        return "Product [id = " + id + "name= " + name + ", price= " + price + ", quantity= " + quantity + ", bestBefore= " 
        + bestBefore.get(Calendar.YEAR) + "/" + bestBefore.get(Calendar.MONTH) + "/" + bestBefore.get(Calendar.DAY_OF_MONTH)  + "]" + "\n";
    }

}
