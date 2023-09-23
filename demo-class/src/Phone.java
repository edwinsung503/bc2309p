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
    if (this.color =="Natural") 
      return "very popular";
    return "not popular";
  }

  public void setSize() {
    this.size = size;
  }

  public int getSize() {
    return this.size;
  }

  public void setPrice() {
    this.price = price;
  }

  public int getPrice(){
    return this.price;
  }

  public static void main(String[] args) {
    Phone phone1 = new Phone();//Phone(class) phone1(作名) = new Phone
    phone1.setModel("iPhone");
    phone1.setColor("Natural");
    //System.out.println(phone1.isIphone());//true
    //System.out.println(phone1.isPopular());//"It is not popular"
    //System.out.println(phone1.breakingNews());//This is Iphone and its color is Blue
    System.out.println(phone1.breakingNews()+". It is "+phone1.isPopular());//This is Iphone and its color is Blue. It is not popular

  }
  public String breakingNews() {
    return "This is "+this.model//
      +" and its color is "+this.color;
  }
}
