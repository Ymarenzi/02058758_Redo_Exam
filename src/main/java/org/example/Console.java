package org.example;

import org.example.notifications.HospitalInformation;

public class Console {
    private HospitalInformation hospitalInformation;
    private TestDB testDB;

    public Console(HospitalInformation hospitalInformation, TestDB testDB) {
        this.hospitalInformation = hospitalInformation;
        this.testDB = testDB;

        while (true){
            System.out.println("");
        }
    }
}
