import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class DemoFileNotFound {
  
  public static void main(String[] args)  {
    File file = new File("D:\\");
    //Approach 1
    read(file);
    //Approach 2
    try {
      read2(file);
    } catch (FileNotFoundException e){

    }
  }

  //Approach 1 to fix check exception :Add try catch
  public static void read (File file){
    try {
      FileReader fileReader = new FileReader(file);  //checked exception
    } catch (FileNotFoundException e) {
      System.out.println("File does not exist.");
    }
  }
  //Approach 2 to fix check exception : add throws in method signature
  public static void read2 (File file) throws FileNotFoundException{//交返俾交俾我的人-> read2(file)
    FileReader fileReader = new FileReader(file);//checked exception
  }
}
