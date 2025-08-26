public class StatePatternDemo {
    public static void main(String[] args) throws InterruptedException {
        TrafficLight trafficLight = new TrafficLight();

        // Simulate traffic light changing states
        TrafficLightState red = new RedState();
        TrafficLightState green = new GreenState();
        TrafficLightState yellow = new YellowState();

        trafficLight.setState(red);
        trafficLight.showLight();
        Thread.sleep(1000);

        trafficLight.setState(green);
        trafficLight.showLight();
        Thread.sleep(1000);

        trafficLight.setState(yellow);
        trafficLight.showLight();
    }
}