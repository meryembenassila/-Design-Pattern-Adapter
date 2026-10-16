package org.example;

import org.example.Adapter.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        UnitéCentrale  unitéCentrale = new UnitéCentrale();
        unitéCentrale.setVga(new Ecran());
        unitéCentrale.print("Hello");
        unitéCentrale.setVga(new VideoProjecteur());
        unitéCentrale.print("Hello");//jusque ici on utilse strategy

        //adapter
        HdmiVgaAdapter adapter = new HdmiVgaAdapter();
        adapter.setHdmi(new TV());
        unitéCentrale.setVga(adapter);
        unitéCentrale.print("Hello");


       // SuperVga est un vga
        unitéCentrale.setVga(new SuperVp());
        unitéCentrale.print("Hello");
        //supervga est un hdmi donc on peut aussi passer par un adapter
        adapter.setHdmi(new SuperVp());
        unitéCentrale.setVga(adapter);
        unitéCentrale.print("Hello");


        unitéCentrale.setVga(new HdmiAdapterHeriatge());
        unitéCentrale.print("Hello");



    }
}