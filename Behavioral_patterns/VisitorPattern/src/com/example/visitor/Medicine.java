class Medicine implements Item {
    private double price;
    public Medicine(double price) { this.price = price; }
    public double getPrice() { return price; }

    @Override
    public void accept(TaxVisitor visitor) {
        visitor.visit(this);
    }
}