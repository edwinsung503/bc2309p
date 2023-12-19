public class VictoriaFactory implements FurnitureFactory{
  
  @Override
  public Chair createChair() {
    System.out.println("creating victoria chair..");
    return new VictoriaChair();
  }

   @Override
  public Sofa createSofa() {
    System.out.println("creating victoria sofa..");
    return new VictoriaSofa();

    //新增style 只需新增factory
    //open close??
    // add new functionality to an entity without changing its existing code.
    //唔想改logic 
  }
}