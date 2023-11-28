public class Runner <T extends Animal> {
  
  private T object;

  public Runner (T object){
    this.object = object;
  }

  public T getT(){
    return this.object;
  }

  public static <U extends Animal> Runner<U> getRunner(){
    return null;
  }

  public static void main(String[] args) {
    Runner<Dog> dogRunner = new Runner<>(new Dog());
    //Runner<Person> personRunner = null;
  }
}
