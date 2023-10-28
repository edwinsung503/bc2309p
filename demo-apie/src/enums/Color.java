package enums;

import java.lang.runtime.SwitchBootstraps;

//during the compile time , 
//JVM create 3 Color objects (White, Black, Blue) in memory
//**we cannot new color object by ourselves**

public enum Color {
  //enum 唔係class-> 寫唔到private string
  //用來define color
  //define 一個format 同固定樣式, 唔俾人改,
  //因為如果開俾其他人write 會好用時間去做checking
  //will check on complie time
  WHITE('W',"white"),
  BLACK('B',"Black"),
  BLUE('U',"Blue"), 
  ;
  
  private char code;
  private String description;

  private Color (char code, String description ) {
    this.code =code;
    this.description = description;
  }

  //enum 係complie time 時有人new 左3次color -> class;

  public char getCode(){
    return this.code;
  }

  public String getDescription(){
    return this.description;
  }
  //Method find enum by a code(values)
  //input pramater define 到個output - > static method
  //static method
  public Color getColorByCode(char code){//'a'
    for (Color color : Color.values()) {
      if (color.getCode() == code){
        return color;
      }
    }
    return null;
  }

  public static String getMesage(Color color) {
    //Switch -> 因為color 有限數同只可以入三個item 所以唔會入defautlt
    switch (color) {
      case WHITE:
        return "This is Code.WHITE";
      case BLUE:
        return "This is Code.BLUE";
      case BLACK:
        return "This is Code.BLACK";
      default:
        return null;
    }
  }


}
