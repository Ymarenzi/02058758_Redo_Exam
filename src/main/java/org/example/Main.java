package org.example;

import org.example.Bays.*;
import org.example.notifications.HospitalInformation;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        HospitalInformation hospitalInformation = new HospitalInformation();
        BaysDataBase baysDataBase = new BaysDataBase();

        Nightingale nightingale = new Nightingale(hospitalInformation);
        Seacole seacole = new Seacole(hospitalInformation);
        Henderson henderson = new Henderson(hospitalInformation);


        baysDataBase.addBay(nightingale);
        baysDataBase.addBay(seacole);
        baysDataBase.addBay(henderson);

        UI ui = new UI(baysDataBase);

    }
}