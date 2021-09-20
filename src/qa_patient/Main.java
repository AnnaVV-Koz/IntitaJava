package qa_patient;

public abstract class Main<persons> {
    public static void main(String[] args) {
        Patient[] patients = new Patient[7];
        patients[0] = new Patient(1, "Boiko", "Vlad", "Pyshkina_21", 4788676, 546, "Holera");
        patients[1] = new Patient(2, "Vylich", "Oleg", "Gogoliy_54", 85448676, 526, "Kor");
        patients[2] = new Patient(3, "Homenko", "Petro", "Keletska_45", 84788676, 236, "Holera");
        patients[3] = new Patient(4, "Oliunik", "Oleg", "Gogoliy_34", 84788676, 226, "Vitrianka");
        patients[4] = new Patient(5, "Panchenko", "Sveta", "Porika_24", 84788676, 826, "Kor");
        patients[5] = new Patient(6, "Petrova", "Ira", "Gogoliy_74", 84788676, 766, "Vitrianka");
        patients[6] = new Patient(7, "Ivanova", "Olia", "Gogoliy_50", 84788676, 726, "Kor");
        //a//
        Vibor vibor = new Vibor(patients);
        vibor.diagnosisOfPatient("Holera");
        //b//
        int startcard = 222;
        int endcard = 777;
        System.out.println("Number of medCard from "+startcard+" to "+endcard+":");
        Vibor.intervalCard(startcard, endcard);



    }
}