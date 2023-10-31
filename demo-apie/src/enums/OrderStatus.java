package enums;

public enum OrderStatus {
  
  ORDERED(1),
  PRODCTION(2),
  DELIVERED(3),
  CLOSE(4),
  ;

  //manage status
  //1.return next status -> find the status??
  //2. check if the status is forwarded
  private int code ;

  //Constructor
  private OrderStatus(int code) {
    this.code = code;
  }

  public int getCode(){
    return this.code;
  }

  public static boolean isForwarded (OrderStatus oldStatus, OrderStatus newStatus){
    return newStatus.getCode() > oldStatus.getCode();
    //return +ve nums -> forwarded
  }
  //Method find enum by a code(values)
  public OrderStatus Status(int code){
    for (OrderStatus s : OrderStatus.values()){
      if (s.getCode() == code){
        return s;//return a value - > represent status no
      }
    }
    return null;
  }
}
