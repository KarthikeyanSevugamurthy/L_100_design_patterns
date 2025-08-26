class YellowState implements TrafficLightState {
    @Override
    public void showLight() {
        System.out.println("YELLOW: Slow down!");
    }
}