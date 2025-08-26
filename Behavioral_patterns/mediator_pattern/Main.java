public class Main {
    public static void main(String[] args) {
        PlacementRepresentative mediator = new PlacementRepresentative();

        PlacementOfficer officer = new PlacementOfficer(mediator);
        mediator.setOfficer(officer);

        Student s1 = new Student("Alice", mediator);
        Student s2 = new Student("Bob", mediator);

        mediator.addStudent(s1);
        mediator.addStudent(s2);

        officer.send("Infosys is visiting campus on Monday.");
        s1.send("Thank you, Sir!");
    }
}
