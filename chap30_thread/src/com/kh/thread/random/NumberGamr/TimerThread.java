package com.kh.thread.random.NumberGamr;
public class TimerThread extends Thread {
	
    private int seconds;

    public TimerThread(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(seconds * 1000);
            System.out.println("½Ã°£ ÃÊ°ú! °Ô?Ó Á¾·á.");
            System.exit(0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}