package org.example.Bays;

import org.example.TestDB;
import org.example.notifications.HospitalInformation;
import org.example.notifications.MedicalNotification;

public abstract class MedicalBay {
    private int patientNumber;
    protected HospitalInformation hospitalInformation;
    private String serviceNeeded;
    private String bayNeeded;
    private String bayName;


    public MedicalBay(HospitalInformation hospitalInformation, TestDB testDB){
        this.patientNumber= 1;
        this.hospitalInformation = hospitalInformation;


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

        if(bayNeeded == this.getName() & testDB.getDurationList().get(testIndex) != 0 ) {
            HospitalInformation.requestPorter("Nightingale", hospitalInformation.getMedicalNotificationFromDoctor().getService());
        }

    }

    public String getName(){
        return bayName;
    }

    public String servicesInBay(){
        return "";
    }

    public String getServiceStatus(){
        return "";
    }

}
