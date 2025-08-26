import java.util.ArrayList;
import java.util.List;

public class PlacementRepresentative implements PlacementMediator {
    private List<Student> students = new ArrayList<>();
    private PlacementOfficer officer;

    public void setOfficer(PlacementOfficer officer) {
        this.officer = officer;
    }

    @Override
    public void sendToStudent(String message, PlacementOfficer officer) {
        for (Student s : students) {
            s.receive(message);
        }
    }

    @Override
    public void sendToOfficer(String message, Student student) {
        if (officer != null) {
            officer.receive(message);
        }
    }

    @Override
    public void addStudent(Student student) {
        students.add(student);
    }
}
