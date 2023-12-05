public enum ErrCode {
  //令到同事extend BusinessException 時, 知道係什麼原因
  //10001-20000
  NAME_TOO_LONG_EXCEPTION (10001,"Name is too long"),//
  SERVER_TIME_OUT (10002,"Server Connection Time Out."),

  ARITHMETIC_EXCEPTION(20001,"ArithmeticException."),
  DIVIDED_BY_NEGATIVE_EXCEPTION(20002,"Divided by Negative Exception.")
  ;

  private int code;
  private String errMsg;

  private ErrCode(int code,String errMsg){
    this.code = code;
    this.errMsg = errMsg;
  }
  public int getCode(){
    return this.code;
  }

  public String getErrMsg(){
    return this.errMsg;
  }
  //令用家唔可以用其他野寫

}
