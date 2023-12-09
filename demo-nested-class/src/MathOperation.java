public interface MathOperation {
  
  int operate(int x, int y);//只可以有一個method

  public static void main(String[] args) {
    MathOperation addition = (a,b) -> {
      return a + b ;
    };
    System.out.println(addition.operate(3, 1));//1
    //-> 定義緊一D 野, 但未行
    MathOperation subtract = (a,b) -> {
      return a - b ;
    };  
    System.out.println(subtract.operate(10, 3));//7

    //add 2 class -> addition / subtraction
  }
}
