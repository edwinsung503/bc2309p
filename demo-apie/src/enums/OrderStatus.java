package enums;

public enum OrderStatus {
  
  ORDERED(1),
  PRODCTION(2),
  SHIPPED(3),
  DELIVERED(4),
  CLOSE(5),
  ;

  //manage status
  //1.return next status -> find the status??
  //2. check if the status is forwarded
  private int statusCode ;
  //特別需要private -> 
  private OrderStatus(int statusCode) {
    this.statusCode = statusCode;
  }

  public int getStatusCode(){
    return this.statusCode;
  }
  //equals 係我的世界是否要一樣 in java world
  //orders status 唔需要check equals
  //toString-> 方便睇但唔需要住

  
  //Method find enum by a code(values)
  //1.return next status  
  //for an example
  //4 (this.statusCode)-> 5 (next)
  //OrderStatus.DELIVERED -> object -> 4
  

  //return a value - > represent status no
  public OrderStatus getOrderStatus(int statusCode){
    //for-each
    //use values()
    for (OrderStatus s : OrderStatus.values()){
      if (s.getStatusCode() == statusCode){// 比對入來的statusCode
        return s;
      }
    }
    return null;//throw
  }

  public OrderStatus nextStatus(int statusCode){
    int code = this.statusCode < 5 ? this.statusCode+1 : this.statusCode;
    return getOrderStatus(code+1);//4 (this.statusCode)-> 5 (next)
  }

  //2. check if the status is forwarded -> return a boolean
  public static boolean isForwarded (OrderStatus orderStatus){
    //return newStatus.getStatusCode() > oldStatus.getStatusCode();
    return this.statusCode < orderStatus.getStatusCode();
    //return +ve nums -> forwarded
  }

  public static void main(String[] args) {
    System.out.println(OrderStatus.CLOSE.nextStatus());//return OrderStatus.close
    System.out.println(OrderStatus.DELIVERED.isForwarded(OrderStatus.SHIPPED));
  }
}
