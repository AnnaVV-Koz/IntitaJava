package qa_patient;


public class Patient {
    private int id;
    private String Surname;
    private String Name;
    private String adress;
    private long telephone;
    private long NumMedCard;
    private String diagnosis;


    public Patient(int id, String Surname, String Name, String adress, long telephone, long NumMedCard, String diagnosis) {
        this.id = id;
        this.Surname = Surname;
        this.Name = Name;
        this.adress = adress;
        this.telephone = telephone;
        this.NumMedCard = NumMedCard;
        this.diagnosis = diagnosis;

    }
    public Patient(String Surname, String diagnosis){
        this.Surname = Surname;
        this.diagnosis = diagnosis;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public long getTelephone() {
        return telephone;
    }

    public void setTelephone(long telephone) {
        this.telephone = telephone;
    }

    public long getNumMedCard() {
        return NumMedCard;
    }

    public void setNumMedCard(long numMedCard) {
        NumMedCard = numMedCard;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }


}
