package org.example;

import org.example.notifications.HospitalInformation;

public class Console {
    private HospitalInformation hospitalInformation;
    private TestDB testDB;

    public Console(HospitalInformation hospitalInformation, TestDB testDB) {
        this.hospitalInformation = hospitalInformation;
        this.testDB = testDB;

        while (true){
            for (int t: testDB.getDurationList()){
                System.out.println( testDB.getTestList().get(int t) + "location" + "status");
            }

            while i<24{
                hospitalInformation.waitAnHour();
            }
        }
    }
}
