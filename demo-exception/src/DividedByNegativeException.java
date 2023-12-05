

public class DividedByNegativeException extends RuntimeException{

  private int code;


  public DividedByNegativeException () {
    super(ErrCode.DIVIDED_BY_NEGATIVE_EXCEPTION.getErrMsg());
    this.code= ErrCode.DIVIDED_BY_NEGATIVE_EXCEPTION.getCode();


  }
  public int getCode(){
    return this.code;
  }

  public String getFullMessage(){
    return String.valueOf(this.code).concat(super.getMessage());
  }
  public static void main(String[] args) {
    int balance = -4;
    int result = -1;
    if (balance < 0) {
      result =0;
    } else {
      result = 10 / balance ;
    }

    //唔應該做下面  
    //try {
    //  result = 10 / balance ;
    //} catch (DividedByNegativeException e){
    //  result = 0;
    //}
  }

  public static int caluclateBalance (int balance) throws DividedByNegativeException {
    if (balance < 0 ) {
      throw new DividedByNegativeException();
    } 
    return  10 / balance; 
  }
}
