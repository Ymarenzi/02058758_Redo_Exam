package org.example;

import org.example.Bays.MedicalBay;
import org.example.notifications.HospitalInformation;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class TestDB {
    private ArrayList<String> testList = new ArrayList<>();
    private List<Integer> durationList = new ArrayList<>();
    private  HospitalInformation hospitalInformation;
    private int duration;
    private String test;

    public TestDB(HospitalInformation hospitalInformation) {
        this.testList=testList;
        this.hospitalInformation = hospitalInformation;
        this.durationList = durationList;

        test = hospitalInformation.getMedicalNotificationFromDoctor().getService();
        testList.add("UltraSound");
        testList.add("ECG");
        testList.add("Dialysis");
        testList.add("Massage");

        durationList.add(0);
        durationList.add(0);
        durationList.add(0);
        durationList.add(0);


        while(true){
            test = hospitalInformation.getMedicalNotificationFromDoctor().getService();

            if (test == "UltraSound") {
                durationList.set(0, 3);}

            if(test == "ECG") {
                durationList.set(1, 1);}

            if(test == "Dialysis") {
                durationList.set(2, 4);}

            if(test == "Massage"){
                durationList.set(3, 2);}


            hospitalInformation.waitAnHour();

            for (int i: durationList){
                if (i>0){
                i = i-1;}

                else {i=i;}
            }

        }
    }

    public ArrayList<String> getTestList(){
        return testList;
    }

    public List<Integer> getDurationList(){
        return durationList;
    }
}



