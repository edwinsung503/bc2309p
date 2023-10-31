package enums;

public enum BookingStatus {

  ORDERED(1),
  INPROGRESS(2),
  PROGRESSING(3),
  INDELIVERY(4)
  DELIVERED(5),
  ;

  private int code ;

  private BookingStatus (int code){
    this.code =code;
  }
  
  public int getCode(){
    return this.code;
  }
  
  public static boolean get(BookingStatus oldStatus, BookingStatus newStatus){
    return newStatus.getCode() > oldStatus.getCode();
  }
  //find the value of the bookingStatus
  public BookingStatus Status(int code) {
    for (BookingStatus s : BookingStatus.values()){
      if (s.getCode() == code){
        return s;
      }
    }
    return null;
  }
}
