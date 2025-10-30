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
}
