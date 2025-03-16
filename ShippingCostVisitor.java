package visitorPatternHW;

public interface ShippingCostVisitor {
    double visit(Chair chair);
    double visit(Table table);
    
    double visit(Sofa sofa, double distance);
    
    default double visit(Sofa sofa) {
        return visit(sofa, 0);
    }
}
