import java.util.*;

public class BobaTea{
  private boolean boba;
  private String bobaType;
  private int sugarAmount;
  private int iceAmount;
  public double price;
  private static int totalTeas = 0;
  private static double totalRevenue = 0.0;
  private static List<String> teaOrders = new ArrayList<>();

  public BobaTea(boolean boba, String bobaType, int sugarAmount, int iceAmount){
    this.boba = boba;
    this.bobaType = bobaType;
    this.sugarAmount = sugarAmount;
    this.iceAmount = iceAmount;
    this.price = calculatePrice();
    totalTeas++;
    totalRevenue += this.price;
    recordOrder();
  }
  
  public double calculatePrice(){
    double basePrice = 4.99; // Standard price
    double customizationPrice = 0.0;

    // Additional charges for customization
    if (bobaType == "Regular"){
      customizationPrice += 0.25; // Add Regular Boba
    }
    if (bobaType == "Popping"){
      customizationPrice += 0.25; // Add Popping Boba
    }
    if (bobaType == "Honey"){
      customizationPrice += 0.5; // Add Honey Boba
    }
    if (bobaType == "Crystal"){
      customizationPrice += 0.5; // Add Crystal Boba
    }
    if (bobaType == "Jelly"){
      customizationPrice += 0.75; // Add Jelly Boba
    }
    if (bobaType == "Lychee"){
      customizationPrice += 0.75; // Add Lychee Boba
    }
    return basePrice + customizationPrice;
  }

  public void printReceipt(){
    System.out.print("Receipt: ");
    System.out.println(this.toString());
  }

  private void recordOrder(){
    teaOrders.add(this.toString());
  }

  public static int getTotalTeas(){
    return totalTeas;
  }

  public static double getTotalRevenue(){
    return totalRevenue;
  }

  public int getSugarAmount(){
    return sugarAmount;
  }

  public void setSugarAmount(int sugarAmount){
    this.sugarAmount = sugarAmount;
  }

  public String toString(){
    return this.getClass().getName() + "\n Price: $" + price + 
      "\n Sugar: " + sugarAmount + "% \n Ice: " + iceAmount + "%\n Boba: " + boba + "\n Boba Type: " + bobaType;
  }
}