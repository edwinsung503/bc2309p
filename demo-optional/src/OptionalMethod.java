import java.util.Optional;

public class OptionalMethod {
  
  public static String [] database = new String [] {"xyz", "abc","ijk"};
  public static void main(String[] args) {
    Optional<Integer> result = OptionalMethod.fromDatabase("abc");
    if (result.isPresent()){
      System.out.println(result.get()); //1
    } else {
      System.out.println("Not Found");
    }

    //唔會有出現runtime exception
  }
  public static Optional<Integer> fromDatabase(String x){
    for (int i=0; i<database.length;i++){
      if (x.equals(database[i])){
        return Optional.of(i);
      } 
    }
    return Optional.empty();

    //Optional 內一定有Object , 即使入面無野, 咁寫係比較安全
  }
}
