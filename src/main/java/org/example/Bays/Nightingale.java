package org.example.Bays;

import org.example.TestDB;
import org.example.notifications.HospitalInformation;

public class Nightingale extends MedicalBay {

    private String serviceNeeded;
    private String bayNeeded;

    public Nightingale(HospitalInformation hospitalInformation, TestDB testDB){
        super(hospitalInformation, testDB);
        HospitalInformation.requestPorter("Nightingale", "Ultrasound");
        bayNeeded = hospitalInformation.getMedicalNotificationFromDoctor().getBay();

        int testIndex = 0;

        if (hospitalInformation.getMedicalNotificationFromDoctor().getService() == "Ultrasound"){
            testIndex = 0;}

        if (hospitalInformation.getMedicalNotificationFromDoctor().getService() == "ECG"){
            testIndex = 1;}
        if (hospitalInformation.getMedicalNotificationFromDoctor().getService() == "Dialysis"){
            testIndex = 2;}
        if (hospitalInformation.getMedicalNotificationFromDoctor().getService() == "Massage"){
            testIndex = 3;}

        if(bayNeeded == "Nightingale" & testDB.getDurationList().get(testIndex) != 0 ) {
            HospitalInformation.requestPorter("Nightingale", hospitalInformation.getMedicalNotificationFromDoctor().getService());
        }
    }


    @Override
    public String servicesInBay(){
        return "";
    }


}
