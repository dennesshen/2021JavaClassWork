/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.countDown;


import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Rayan
 */
public class TimerJFrame extends javax.swing.JFrame {

    /**
     * Creates new form TimerJFrame
     */
    
    static Timer timer; // 計時器
    static int interval; // 總時間
    int minutes; // 分
    int seconds; // 秒
    boolean isTimerActive;  // 確定計時器是否有被執行
                
    public void addTimes(int minutesDely){
        interval += minutesDely * 60;
        System.out.printf("已設定 %d 分鐘\n", minutesDely);
        initTimes();
    }
    
    public TimerJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt_Add1Minutes = new javax.swing.JButton();
        bt_Add3Minutes = new javax.swing.JButton();
        bt_Add2Minutes = new javax.swing.JButton();
        bt_End = new javax.swing.JButton();
        bt_Start = new javax.swing.JButton();
        lable_Timer = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bt_Add1Minutes.setFont(new java.awt.Font("微軟正黑體", 0, 36)); // NOI18N
        bt_Add1Minutes.setText("1分鐘");
        bt_Add1Minutes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Add1MinutesActionPerformed(evt);
            }
        });

        bt_Add3Minutes.setFont(new java.awt.Font("微軟正黑體", 0, 36)); // NOI18N
        bt_Add3Minutes.setText("3分鐘");
        bt_Add3Minutes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Add3MinutesActionPerformed(evt);
            }
        });

        bt_Add2Minutes.setFont(new java.awt.Font("微軟正黑體", 0, 36)); // NOI18N
        bt_Add2Minutes.setText("2分鐘");
        bt_Add2Minutes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Add2MinutesActionPerformed(evt);
            }
        });

        bt_End.setFont(new java.awt.Font("微軟正黑體", 0, 36)); // NOI18N
        bt_End.setText("結束");
        bt_End.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_EndActionPerformed(evt);
            }
        });

        bt_Start.setFont(new java.awt.Font("微軟正黑體", 0, 36)); // NOI18N
        bt_Start.setText("開始");
        bt_Start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_StartActionPerformed(evt);
            }
        });

        lable_Timer.setFont(new java.awt.Font("微軟正黑體", 0, 36)); // NOI18N
        lable_Timer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lable_Timer.setText("請按按鈕新增時間");
        lable_Timer.setToolTipText("");
        lable_Timer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lable_Timer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt_Start, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_End, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt_Add3Minutes, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_Add2Minutes, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_Add1Minutes, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)))
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(bt_Add2Minutes, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_Add3Minutes, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_Add1Minutes, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_End, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_Start, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lable_Timer, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_StartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_StartActionPerformed
        if (isTimerActive) return;
        if(interval <= 0) {
            lable_Timer.setText("請按時間，別亂玩");
            lable_Timer.setForeground(new java.awt.Color(255, 0, 0));
            return;
        }
        // 設定值
        isTimerActive = true;
        int delay = 1000;
        int period = 1000;
        timer = new Timer();
        System.out.printf("開始倒數計時 %ds\n", interval);
        //開始執行
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                setInterval();
                initTimes();
                if(interval < 1){
                    lable_Timer.setText("時間到囉！");
                    lable_Timer.setForeground(new java.awt.Color(255, 0, 0));
                    isTimerActive = false;
                }
            }
        }, delay, period);

    }//GEN-LAST:event_bt_StartActionPerformed
    
    // 設定時間顯示
    private void initTimes(){
        minutes = interval / 60;
        seconds = interval % 60;
        lable_Timer.setForeground(new java.awt.Color(0, 0, 0));
        lable_Timer.setText(String.format("%02d：%02d", minutes, seconds));
    }
    
    private static final int setInterval(){
        if(interval == 1)
            timer.cancel();
        return --interval;
    }
    
    private void bt_Add3MinutesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Add3MinutesActionPerformed
        addTimes(3);
    }//GEN-LAST:event_bt_Add3MinutesActionPerformed

    private void bt_Add2MinutesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Add2MinutesActionPerformed
        addTimes(2);
    }//GEN-LAST:event_bt_Add2MinutesActionPerformed

    private void bt_Add1MinutesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Add1MinutesActionPerformed
        addTimes(1);
    }//GEN-LAST:event_bt_Add1MinutesActionPerformed

    private void bt_EndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_EndActionPerformed
        timer.cancel();
        lable_Timer.setText("請按按鈕新增時間");
        lable_Timer.setForeground(new java.awt.Color(0, 0, 0));
        interval = 0;
        isTimerActive = false;
    }//GEN-LAST:event_bt_EndActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TimerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TimerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TimerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TimerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TimerJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Add1Minutes;
    private javax.swing.JButton bt_Add2Minutes;
    private javax.swing.JButton bt_Add3Minutes;
    private javax.swing.JButton bt_End;
    private javax.swing.JButton bt_Start;
    private javax.swing.JLabel lable_Timer;
    // End of variables declaration//GEN-END:variables
}