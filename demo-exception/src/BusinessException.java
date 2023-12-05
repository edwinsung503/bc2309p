public class BusinessException extends Exception{
  //checked exception
  //無final 可以俾你extend

  private int code;

  //public BusinessException (String message) {
    //super(message);
  //}

  //public BusinessException () {
   // 
  //}
  //建code唔同team去清楚溝通
  public BusinessException (ErrCode errCode) {
    super(errCode.getErrMsg());//想keep 返個message
    //call parent constructor construct 到一個 Exception
    //same as animal's constructr from dog
    //繼承到public 的野
    this.code= errCode.getCode();
    //人地只可以只enum 的code 同message
    //> 唔俾佢地老作野  

  }
  public int getCode(){
    return this.code;
  }
  //"10002 - Server Connection Time Out"
  //need review
  public String getFullMessage(){
    return String.valueOf(this.code).concat(super.getMessage());
    //within 自己的class 內call 可以用super
  }

}
