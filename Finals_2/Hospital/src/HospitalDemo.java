import managment.Patient;

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HospitalDemo {

    // Method to register a patient
    static Patient registerPatient(String firstName, String lastName) {
        Random random = new Random();
        Patient patient = new Patient();
        patient.setFirstName(firstName);
        patient.setLastName(lastName);

        String patientNumber = "P-" + random.ints(4, 0, 10) // 4 digits, values from 0 to 9
                .mapToObj(String::valueOf) // Convert each int to a String
                .collect(Collectors.joining());
        patient.setNumber(patientNumber);

        // Generate a random room number between 100 and 399
        int roomNumber = random.nextInt(300) + 100;
        patient.setRoomNumber(roomNumber);
        

        return patient;
    }

    // Method to display patient details
    public static void displayPatient(Patient patient) {
        System.out.println("Patient first name: " + patient.getFirstName());
        System.out.println("Patient last name: " + patient.getLastName());
        System.out.println("Patient number: " + patient.getNumber());
        System.out.println("Patient room number: " + patient.getRoomNumber());
    }

    public static void main(String[] args) {

        Random random = new Random();
       

        // Create a list of patient names
        ArrayList<String> patients = new ArrayList<>();
        patients.add("Dusko Sofronievski");
        patients.add("John Doe");
        patients.add("Jane Smith");


        ArrayList<Patient> patientsList = (ArrayList<Patient>) patients.stream()
                .map(name -> {
                    String[] parts = name.split(" ");
                    return registerPatient(parts[0], parts[1]);
                })
                .collect(Collectors.toList());





       patientsList.forEach(HospitalDemo::displayPatient);

       int up = 299;
       int down = 200;

       ArrayList<Patient>patients1 = (ArrayList<Patient>) patientsList.stream().filter(patient -> patient.getRoomNumber()>=200 && patient.getRoomNumber()<=299 && patient.getRoomNumber() % 2 != 0 ).collect(Collectors.toList());


       patients1.forEach(HospitalDemo::displayPatient);

    }
}
