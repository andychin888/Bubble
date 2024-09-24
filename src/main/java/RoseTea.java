public class RoseTea extends BobaTea{
  private boolean crushedRosePetals;

  public RoseTea(boolean boba, String bobaType, int sugarAmount, int iceAmount, boolean crushedRosePetals){
    super(boba, bobaType, sugarAmount, iceAmount);
    this.crushedRosePetals = crushedRosePetals;
    this.price = calculatePrice();
  }

  public double calculatePrice(){
    double customizationPrice = super.calculatePrice();
    customizationPrice += 0.75;
    return customizationPrice;
  }

  public void crushRosePetals(){
    crushedRosePetals = true;
  }

  public String toString(){
    return super.toString() + "\n Crushed Rose Petals: " + crushedRosePetals;
  }
}