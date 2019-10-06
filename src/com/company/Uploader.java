package com.company;

public class Uploader extends Thread{

    private int fileSize;
    private int downloadSpeed;

    public int getFileSize() {
        return fileSize;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

    public int getDownloadSpeed() {
        return downloadSpeed;
    }

    public void setDownloadSpeed(int downloadSpeed) {
        this.downloadSpeed = downloadSpeed;
    }

    public Uploader(int fileSize, int downloadSpeed) {
        this.fileSize = fileSize;
        this.downloadSpeed = downloadSpeed;
    }

    @Override
    public void run() {
        System.out.println("Загрузка 1 файла "+getFileSize()+"MB на сервер");
        System.out.println("Скорость загрузки на сервер "+getDownloadSpeed()+"MB/sec");
        while (getFileSize()>0){
            fileSize-=downloadSpeed;
            System.out.println("Осталось: " + getFileSize() + " MB");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Файл загружен");
    }
}
