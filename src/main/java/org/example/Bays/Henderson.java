package org.example.Bays;

import org.example.notifications.HospitalInformation;

public class Henderson extends MedicalBay{
        public Henderson(HospitalInformation hospitalInformation){
            super(hospitalInformation);
            HospitalInformation.requestPorter("Henderson", "Dialysis");
        }

    @Override
    public String getName(){
        return "Seacole";
    }
}
