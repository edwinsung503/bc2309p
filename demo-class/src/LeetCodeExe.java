import java.util.Arrays; 

public class LeetCodeExe {
	public static void main(String[] args) {
		String[] array = {"cat", "dog", "cat", "bird", "cat"};
    int count=0;
    //int count = 0; // the variable to store the count
    String target = array[0];
    for (int i = 0; i < array.length; i++) { // loop through the array
      for (int j =0 ; j< array.length -1; j++){
        if (!target.equals(array[j])){
          count++;
          target = array[j];
        }
      }
    }
    System.out.println(count);//
  }
}
