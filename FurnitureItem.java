package visitorPatternHW;


public interface FurnitureItem {
    double getSize();
    double accept(ShippingCostVisitor visitor);
}
