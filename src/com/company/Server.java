package com.company;

public class Server extends Thread{


    public Server() {}

    public Server(String name) {
        super(name);
    }

    @Override
    public void run() {
        if (getName()=="upload"){
            Uploader uploader = new Uploader(500, 20);
            uploader.start();
        }
        for (int i = 1;i<11;i++){
            //synchronized (){
                if (getName() == "User " + 1 + " "){
                    Downloader downloader = new Downloader(500,100);
                    downloader.start();
                }
                notify();
            //}
        }
    }
}
