public class BlackMilkTea extends BobaTea{
  private int steepTime;

  public BlackMilkTea(boolean boba, String bobaType, int sugarAmount, int iceAmount, int steepTime){
    super(boba, bobaType, sugarAmount, iceAmount);
    this.steepTime = steepTime;
    this.price = calculatePrice();
  }

  public double calculatePrice(){
    double customizationPrice = super.calculatePrice();

    customizationPrice += 1.0;
    return customizationPrice;
  }

  public String toString(){
    return super.toString() + "\n Steep Time: " + steepTime;
  }
}