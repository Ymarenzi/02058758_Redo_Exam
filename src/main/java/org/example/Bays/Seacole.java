package org.example.Bays;

import org.example.notifications.HospitalInformation;

public class Seacole extends MedicalBay {

    public Seacole(HospitalInformation hospitalInformation){
        super(hospitalInformation);
        HospitalInformation.requestPorter("Seacole", "ECG");
        HospitalInformation.requestPorter("Seacole", "Massage");
    }

    @Override
    public String getName(){
        return "Seacole";
    }
}
