import taskAutomation.patientInfo;
public class Main2 {
    public static void main(String[] args) {
        patientInfo p1 = new patientInfo("Nansereko Jjuko", 30);
        patientInfo p2 = new patientInfo("Aine Posus", 42);
        patientInfo p3 = new patientInfo("Okello Ronnie", 25);

        System.out.println("\n>>PATIENT DETAILS at " + patientInfo.getHospitalName());
        System.out.println(p1.getPatientName() + ", on bed number " + p1.getPatientBedNo() + " in the " + patientInfo.getWard());
        System.out.println(p2.getPatientName() + ", on bed number " + p2.getPatientBedNo() + " in the " + patientInfo.getWard());
        System.out.println(p3.getPatientName() + ", on bed number " + p3.getPatientBedNo() + " in the " + patientInfo.getWard());
    }
}
