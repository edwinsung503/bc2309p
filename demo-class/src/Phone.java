public class Phone {
  String model;

  String color;

  int size ;

  int price;

  public void setModel (String model){
    this.model = model ;
  }

  public String isIphone () {
    if (this.model =="iPhone") 
      return "IPhone";
    return this.model;
  }

  public void setColor (String color) {
    this.color = color;
  }

  public String isPopular() {
    if (this.color.equals("Natural")) 
      return "very popular";
    return "not popular";
  }

  public void setSize(int size) {
    this.size = size;
  }

  public String isSize() {
    if (this.size == 1)
      return "1TB";
    else if (this.size == 512)
      return "512GB";
    return "256GB";
  }

  public void setPrice() {
    this.price = price;
  }

  public int isPrice() {
    if (this.size == 1)
      return 13599;
    else if (this.size == 512)
      return 11899;
    else 
      return 10199;
  }

  public static void main(String[] args) {
    Phone phone1 = new Phone();//Phone(class) phone1(作名) = new Phone
    phone1.setModel("iPhone");
    phone1.setColor("Blue");
    phone1.setSize(256);
    //System.out.println(phone1.isIphone());//true
    //System.out.println(phone1.isPopular());//"It is not popular"
    //System.out.println(phone1.breakingNews());//This is Iphone and its color is Blue
    //System.out.println(phone1.isSize()); //256GB
    System.out.println(phone1.breakingNews()+". It is "+phone1.isPopular());//This is Iphone and its color is Blue. It is not popular
    System.out.println("The phone memory is "+phone1.isSize()+" and the price is "+phone1.isPrice());
    //"The phone memory is 256GB  and the price is 10199
  }
  public String breakingNews() {
    return "This is "+this.model//this.model = model
      +" and its color is "+this.color;
  }
}
