interface TaxVisitor {
    void visit(Food food);
    void visit(Electronics electronics);
    void visit(Medicine medicine);
}