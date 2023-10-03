public class Stock {
  double price;

  //setter
  public void setPrice(double price) {
    this.price = price;
  }
  //constructor- > 當有人call 時放返入去
  public Stock(double price) {
    this.price = price;
  }

  //getPrice
  public double getPrice () {
    return this.price;
  }
}
