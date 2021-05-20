/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day26;

public class WithdrawThread extends Thread{
    private Account account;
    private int amount ;

    public WithdrawThread(Account account, int amount) {
        this.account = account;
        this.amount = amount;
       
    }
    
    @Override
    public void run() {
        account.withdraw(amount);
    }
    
    
}
