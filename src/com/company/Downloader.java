package com.company;

public class Downloader extends Thread {

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

    public Downloader(int fileSize, int downloadSpeed) {
        this.fileSize = fileSize;
        this.downloadSpeed = downloadSpeed;
    }

    @Override
    public void run() {
        System.out.println("Скачивание 1 файла " + getFileSize() + "MB с сервера пользователем " + this.getName());
        while (getFileSize() > 0) {
            System.out.println("Скорость скачивания с сервера " + getDownloadSpeed() + "MB/sec");
            fileSize -= downloadSpeed;
            System.out.println("Осталось: " + fileSize + " MB");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Файл скачен");
    }
}
