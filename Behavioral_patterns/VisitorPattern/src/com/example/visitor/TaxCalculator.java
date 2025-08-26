class TaxCalculator implements TaxVisitor {
    @Override
    public void visit(Food food) {
        double tax = food.getPrice() * 0.05; // 5% tax
        System.out.println("Food Tax: " + tax);
    }

    @Override
    public void visit(Electronics electronics) {
        double tax = electronics.getPrice() * 0.18; // 18% tax
        System.out.println("Electronics Tax: " + tax);
    }

    @Override
    public void visit(Medicine medicine) {
        double tax = medicine.getPrice() * 0.02; // 2% tax
        System.out.println("Medicine Tax: " + tax);
    }
}