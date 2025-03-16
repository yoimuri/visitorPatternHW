package visitorPatternHW;

public class FurnitureShop {
    public static void main(String[] args) {
        FurnitureItem myChair = new Chair(50.0);
        FurnitureItem myTable = new Table(100.0);
        Sofa mySofa = new Sofa(200.0); 

        ShippingCostVisitor costCalculator = new ShippingCostCalculator();

        System.out.println("Chair shipping cost: ₱" + myChair.accept(costCalculator));
        System.out.println("Table shipping cost: ₱" + myTable.accept(costCalculator));
        System.out.println("Sofa shipping cost (default distance): ₱" + mySofa.accept(costCalculator));

        System.out.println("Sofa shipping cost (with 10 km): ₱" + mySofa.accept(costCalculator, 10));
    }
}
