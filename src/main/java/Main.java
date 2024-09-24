import java.util.*;

public class Main {
  public static void main(String[] args) {
    BobaTea regularBobaTea = new BobaTea(true, "Regular", 50, 25);
    BlackMilkTea blackMilkTea = new BlackMilkTea(true, "Honey", 70, 50, 5);
    RoseTea roseTea = new RoseTea(true, "Crystal", 60, 30, true);
    ButterFlyTea butterFlyTea = new ButterFlyTea(true, "Jelly", 50, 25, 5);
    ThaiMilkTea thaiMilkTea = new ThaiMilkTea(true, "Lychee", 60, 30, 0.5);
    
    regularBobaTea.printReceipt();
    System.out.println();
    blackMilkTea.printReceipt();
    System.out.println();
    roseTea.printReceipt();
    System.out.println();
    butterFlyTea.printReceipt();
    System.out.println();
    thaiMilkTea.printReceipt();

    System.out.println();
    System.out.println("Merchant Daily Receipt");
    System.out.println("Total Teas Made: " + BobaTea.getTotalTeas());
    double number = BobaTea.getTotalRevenue();
    double roundedNumber = Math.round(number * 100.0) / 100.0;
    
    System.out.println("Total Revenue: $" +roundedNumber);
  }
}