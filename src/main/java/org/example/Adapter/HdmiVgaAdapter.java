package org.example.Adapter;

public class HdmiVgaAdapter  implements  VGA {

    private Hdmi hdmi;
    @Override
    public void print(String message) {
        System.out.println("++++++++++ Adaptation ++++++++++++++");
        byte[] data = message.getBytes();//ici on adapte hdmi a vga
          hdmi.view(data);
        System.out.println("++++++++++ Adaptation ++++++++++++++");
    }

    public void setHdmi(Hdmi hdmi) {
        this.hdmi = hdmi;
    }
}
