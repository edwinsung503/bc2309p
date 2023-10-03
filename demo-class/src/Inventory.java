import java.util.Arrays;

public class Inventory {
  //primitives, wrapper class, string
  //Stock stock;//Class 中有 class
  //有好多stock/貨物
  Stock [] stocks;
  
  public Inventory(Stock stock) {
    this.stocks = new Stock[100];
    this.stocks[0] = stock;
  }
  //empty constructor
  public Inventory(){
    this.stocks = new Stock[100];
  }

  public void add(Stock stock){
    for (int i=0; i< this.stocks.length;i++) {
      if (stocks[i] == null) {
        stocks[i] = stock;
        break;
      }
    }
  }

  //getStock
  public Stock [] getStocks(){
    return this.stocks;
  }
  //method : return no of stock in the stock array
  public int size() {
    //for loop
    int count =0;
    for (int i=0; i<this.stocks.length ; i++) {
      if( this.stocks[i] !=null) {
       count ++;
      }
    }
    return count;
  }

  public static void main(String[] args) {
    //new a stock 
    Stock stock1 = new Stock(99.9d);//唔俾都係preset 係double
    //new an inventory
    Inventory inventory = new Inventory();// empty constructor
    //how to set stock into an inventory
    inventory.add(stock1);
    inventory.add(stock1);
    //how to print the price of the stock inside the inventory object
    //chain method
    //System.out.println(inventory.getStock().getPrice());//99.9
    System.out.println(inventory.size());//2
    
    //for (Stock s: inventory.getStocks()) {//foreach
    for (int i =0; i < inventory.getStocks().length;i++) {
      Stock s = inventory.getStocks()[i];
      if (s !=null) {
        System.out.println("Stock: "+i+", price "+s.getPrice());
      }
    }//nullpointerexception -> object reference 揾唔到object, 因為無野
    
  }
}
