package visitorPatternHW;

public class Chair implements FurnitureItem {
    private double size;

    public Chair(double size) {
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
}
