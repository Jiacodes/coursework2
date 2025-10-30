import taskAutomation.doctorAssignment;

public class Main {
    public static void main(String[] args) {
        doctorAssignment doc1 = new doctorAssignment("Natalia");
        doctorAssignment doc2 = new doctorAssignment("Jonathan");
        doctorAssignment doc3 = new doctorAssignment("Roberta");
        doctorAssignment doc4 = new doctorAssignment("Jordan");

        System.out.println("\n==WARD ASSIGNMENT FOR THE DOCTORS==");
        System.out.println("Doctor " + doc1.getDoctorName() + " with Id number: " + doc1.getDoctorId() + " has been assigned to the emergency ward.");
        System.out.println("Doctor " + doc2.getDoctorName() + " with Id number: " + doc2.getDoctorId() + " has been assigned to the operation ward.");
        System.out.println("Doctor " + doc3.getDoctorName() + " with Id number: " + doc3.getDoctorId() + " has been assigned to the paediatrics ward.");
        System.out.println("Doctor " + doc4.getDoctorName() + " with Id number: " + doc4.getDoctorId() + " has been assigned to the anaesthesia ward.");
    }
}
