/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day25;

/**
 *
 * @author dennesshen
 */
public class WorkThread extends Thread {

    @Override
    public void run() {
        String tname = Thread.currentThread().getName();
        for(int i = 1000; i>0 ; i--){
            System.out.printf("%d : %s\n",i , tname);
        }
    }
    
    public static void main(String[] args) {
        WorkThread wt1 = new WorkThread();
        WorkThread wt2 = new WorkThread();
        wt1.setName("T1");
        wt2.setName("T2");
        wt1.setPriority(Thread.MAX_PRIORITY);
        wt1.setPriority(Thread.MIN_PRIORITY);
        wt2.setDaemon(true);
        wt1.start();
        wt2.start();
        System.out.println(Thread.activeCount());
        
    }
    
}
