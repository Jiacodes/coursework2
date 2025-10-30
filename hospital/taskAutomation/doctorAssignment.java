package taskAutomation;

public class doctorAssignment {
    private int DoctorId;
    private String DoctorName;

    private static int autoId = 101;

    {
        DoctorId = autoId;
        autoId += 1;
    }

    public doctorAssignment(String DocName) {
        DoctorName = DocName;
    }

    public int getDoctorId() {
        return DoctorId;
    }

    public String getDoctorName() {
        return DoctorName;
    }
}
