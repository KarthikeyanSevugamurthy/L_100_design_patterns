public interface PlacementMediator {
    void sendToStudent(String message, PlacementOfficer officer);
    void sendToOfficer(String message, Student student);
    void addStudent(Student student);
}
