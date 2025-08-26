class User implements Subscriber {
    private String name;
    User(String name) { this.name = name; }

    @Override
    public void update(String videoTitle) {
        System.out.println(name + " got notified: New video uploaded - " + videoTitle);
    }
}