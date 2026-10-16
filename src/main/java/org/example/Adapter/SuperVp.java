package org.example.Adapter;

public class SuperVp implements VGA , Hdmi{
    @Override
    public void view(byte[] data) {
        String message = new String(data);
        System.out.println("++++++++++ SuperVp Hdmi ++++++++++++++");
        System.out.println(message);
        System.out.println("++++++++++ SuperVp Hdmi ++++++++++++++");
    }

    @Override
    public void print(String message) {
        System.out.println("++++++++++ SuperVp vga ++++++++++++++");
        System.out.println(message);
        System.out.println("++++++++++ SuperVp vga ++++++++++++++");

    }
}
