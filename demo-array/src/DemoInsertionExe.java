public class DemoInsertionExe {
 public static void main(String[] args) {
  int [] array = new int [] {12,45,2,64,3};
  
  int key = 0;
  int idx = 0;

  for (int i =0; i < array.length;i++) {
    key = array[i];
    idx = i -1;
    while(idx>=0 && array[idx] > key) {
      array[idx+1] = array[i];
      idx --;
    }
    array[idx++] = key;
    

  }
 } 
}
