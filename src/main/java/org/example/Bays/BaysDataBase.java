package org.example.Bays;



import java.util.ArrayList;

public class BaysDataBase {
    private ArrayList<MedicalBay> List = new ArrayList<>();

    public BaysDataBase(){
        this.List=List;
    }

    public void addBay(MedicalBay medicalBay){
        List.add(medicalBay);
    }

    public ArrayList<MedicalBay> getBaysArrayList() {
        return List;
    }
}
