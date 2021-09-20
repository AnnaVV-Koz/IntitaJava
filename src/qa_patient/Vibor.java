package qa_patient;

public class Vibor {
    private Patient[] patients;

    public Vibor(Patient[]patients){
        this.patients=patients;
    }
    public void diagnosisOfPatient(String diagnosis) {
        for (Patient  patient: patients ) {
            if (diagnosis.equals(patient.getDiagnosis())) {
                System.out.println(patient.getName() + " " + patient.getSurname() + " " + patient.getDiagnosis());
            }
        }
    }
    public static void intervalCard(int startcard, int numberMedCardEnd){
        for (Patient patient : Patient){
            if((patient.getNumMedCard() >= startcard)&(patient.getNumMedCard() <= numberMedCardEnd)){
                System.out.println(patient.getName()+' '+patient.getSurname()+' '+' '+patient.getNumMedCard());
            }
        }
    }
}
