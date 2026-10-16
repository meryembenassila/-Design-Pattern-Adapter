package org.example.Adapter;

public class VideoProjecteur implements VGA {
    @Override
    public void print(String message) {
        System.out.println("...............VideoProjecteur....................");
        System.out.println(message);
        System.out.println("...............VideoProjecteur.....................");
    }
}
