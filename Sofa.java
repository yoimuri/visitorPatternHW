package visitorPatternHW;

public class Sofa implements FurnitureItem {
    private double size;

    public Sofa(double size) {
        this.size = size;
    }

    @Override
    public double getSize() {
        return size;
    }

    @Override
    public double accept(ShippingCostVisitor visitor) {
        return visitor.visit(this);
    }
    
    public double accept(ShippingCostVisitor visitor, double distance) {
        return visitor.visit(this, distance);
    }
}
