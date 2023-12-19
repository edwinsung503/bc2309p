public class ModernFactory implements FurnitureFactory{
  
  @Override
  public Chair createChair() {
    System.out.println("creating modern chair..");
    return new ModernChair();
  }

   @Override
  public Sofa createSofa() {
    System.out.println("creating modern sofa..");
    return new ModernSofa();
  }
}
