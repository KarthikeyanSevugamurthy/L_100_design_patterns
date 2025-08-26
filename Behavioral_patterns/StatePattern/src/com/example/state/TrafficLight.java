class TrafficLight {
    private TrafficLightState currentState;

    public void setState(TrafficLightState state) {
        this.currentState = state;
    }

    public void showLight() {
        currentState.showLight();
    }
}