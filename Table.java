package visitorPatternHW;

public class Table implements FurnitureItem {
    private double size;

    public Table(double size) {
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
