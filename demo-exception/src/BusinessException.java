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

}
