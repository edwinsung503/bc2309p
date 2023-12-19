public interface FurnitureFactory {
  Chair createChair();

  Sofa createSofa();

  public static FurnitureFactory create(Style style) {
    return switch (style){
      case MODERN -> new ModernFactory();
      case VICTORIAN -> new VictoriaFactory();
    };
  }

  public static void main(String[] args) {
    FurnitureFactory ff = FurnitureFactory.create(Style.MODERN);
    
    ff.createSofa();// during compile time : do we know it is creating modern sofa?
    //No , we dont know it is modern sofa in compile time
    
  }
}
