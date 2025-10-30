package taskAutomation;

public class patientInfo {
    private static String hospitalName;
    private static String ward;
    private String patientName;
    private int patientBedNo;

    static {
        hospitalName = "GET WELL SOON CHILDREN'S HOSPITAL";
        ward = "Paediatrics ward.";
    }

    public patientInfo(String Pname, int PBedNo) {
        patientName = Pname;
        patientBedNo = PBedNo;
    }

    public static String getHospitalName() {
        return hospitalName;
    }

    public static String getWard() {
        return ward;
    }

    public String getPatientName() {
        return patientName;
    }

    public int getPatientBedNo() {
        return patientBedNo;
    }
}
