package com.company;

public class Main {
    public static void main(String[] args) {
        Server server = new Server();
        server.setName("upload");
        server.start();
        for (int i = 1; i < 11; i++) {
            Server serveri = new Server();
            //synchronized (){
                serveri.setName("User " + i + " ");
                serveri.start();
                try {
                    serveri.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            //}
        }
    }
}
