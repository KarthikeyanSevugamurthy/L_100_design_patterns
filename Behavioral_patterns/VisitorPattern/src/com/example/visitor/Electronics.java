class Electronics implements Item {
    private double price;
    public Electronics(double price) { this.price = price; }
    public double getPrice() { return price; }

    @Override
    public void accept(TaxVisitor visitor) {
        visitor.visit(this);
    }
}