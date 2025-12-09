package org.example;

import org.example.Bays.BaysDataBase;
import org.example.Bays.MedicalBay;

import javax.swing.*;
import java.awt.*;

public class UI extends JPanel {
    private BaysDataBase baysDataBase;

    public UI(BaysDataBase baysDataBase){
        this.baysDataBase = baysDataBase;
        this.setLayout(new GridLayout(baysDataBase.getBaysArrayList().size(), 1));

        for (MedicalBay mb: baysDataBase.getBaysArrayList()){
            JPanel bayPanel = new JPanel();
            JLabel bayLabel = new JLabel(mb.getName());
            bayPanel.add(bayLabel);

        }
    }
}
