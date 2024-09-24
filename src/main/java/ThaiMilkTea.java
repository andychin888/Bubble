public class ThaiMilkTea extends BobaTea{
    private double spice;
    public ThaiMilkTea(boolean boba, String bobaType, int sugarAmount, int iceAmount, double spice){
        super(boba, bobaType, sugarAmount, iceAmount);
        this.spice = spice;
        this.price = calculatePrice();
    }
    public double calculatePrice(){
        double customizationPrice = super.calculatePrice();
        customizationPrice += 0.95;
        return customizationPrice;
    }
  
    public String toString(){
        return super.toString() + "\n Spice: " + spice;
    }
    
}