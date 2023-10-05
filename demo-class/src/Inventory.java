import java.util.Arrays;

public class Inventory {
  //attribute , instance variable -> person have age, gender, height, weight 
  //primitives, wrapper class, string
  //Stock stock;//Class 中有 class
  //有好多stock/貨物
  Stock [] stocks;

  //
  static String location = "TST";//static variable - > 
  //無static 就係跟住個object - > 可以set location
  //有static , location唔跟object去左公家地方(公家share) - > 跟住個class->死物(Inventory )

  //有2種方式去construct , 以下有2種
  //Concstructor signature 1(with stock parameter)
  public Inventory(Stock stock) {//因為唔俾用location 所以delete
    //係出世前起定個object 俾佢
    //唔可以個array 係null <- big problem
    this.stocks = new Stock[100];
    this.stocks[0] = stock;
    //this.location = location;
  }

  //public void setLocation (String location) {
  //  this.location = location;
  //}

  //empty constructor
  //Concstructor signature 2(with no parameter)
  public Inventory(){
    this.stocks = new Stock[100];//唔想個array 係全null 所以set array
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

  public static void main(String[] args) {//<-runtime
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
    System.out.println(Inventory.location);//TST 因為公家所以可以用返個class.location
  }
}
//如果你唔寫constructor -> java 會送一個constructor 俾你 -> empty constructor
//如果你有寫一個constructor ,java 會覺得你識寫，所以會要你寫
//try this case for exeercise on 05Oct