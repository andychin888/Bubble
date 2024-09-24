public class ButterFlyTea extends BobaTea {
  private int fairyDust;

  public ButterFlyTea(boolean boba, String bobaType, int sugarAmount, int iceAmount, int fairyDust) {
    super(boba, bobaType, sugarAmount, iceAmount);
    this.fairyDust = fairyDust;
    addFairyDust();
    this.price = calculatePrice();
  }

  public double calculatePrice() {
    double customizationPrice = super.calculatePrice();
    customizationPrice += 0.75;
    return customizationPrice;
  }

  public void addFairyDust() {
    setSugarAmount(getSugarAmount() + fairyDust);
  }

  public String toString() {
    return super.toString() + "\n Fairy Dust: " + fairyDust;
  }
}