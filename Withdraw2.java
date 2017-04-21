package bankingsystemongui;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

public class Withdraw2 extends javax.swing.JFrame {
//    String accountNumber;
    Account account;
    static boolean firstTime =false;
    public Withdraw2() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        withdrawAmountField = new javax.swing.JTextField();
        withdrawMoneyButton = new javax.swing.JButton();
        exitButton1 = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        cencelButton = new javax.swing.JButton();
        goToMainMenuButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setText("Withdraw");

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Documents\\NetBeansProjects\\BankingSystemOnGUI\\nbproject\\withdraw.png")); // NOI18N

        jLabel6.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel6.setText("Enter withdraw Amount ");

        withdrawMoneyButton.setBackground(new java.awt.Color(102, 153, 0));
        withdrawMoneyButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        withdrawMoneyButton.setText("Withdraw Money");
        withdrawMoneyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawMoneyButtonActionPerformed(evt);
            }
        });

        exitButton1.setBackground(new java.awt.Color(255, 0, 0));
        exitButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        exitButton1.setText("EXIT");
        exitButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButton1ActionPerformed(evt);
            }
        });

        backButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        cencelButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cencelButton.setText("Cancel");
        cencelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cencelButtonActionPerformed(evt);
            }
        });

        goToMainMenuButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        goToMainMenuButton.setText("GoTo Main Menu");
        goToMainMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goToMainMenuButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(withdrawMoneyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(withdrawAmountField, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(goToMainMenuButton)
                                        .addGap(31, 31, 31)
                                        .addComponent(cencelButton)
                                        .addGap(18, 18, 18)
                                        .addComponent(backButton)
                                        .addGap(18, 18, 18)
                                        .addComponent(exitButton1))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(343, 343, 343)
                        .addComponent(jLabel2)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(withdrawAmountField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(withdrawMoneyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(exitButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cencelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(goToMainMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel5))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void withdrawMoneyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawMoneyButtonActionPerformed
        
        double withdrawAmount;
        try{
            withdrawAmount = Double.parseDouble(withdrawAmountField.getText());
            if(withdrawAmount<0){
                JOptionPane.showMessageDialog(null, "You Can't Withdraw a negative Amount Of Money !!","Alert",JOptionPane.WARNING_MESSAGE);
            }
            else{
                if(firstTime==false){
                    double remainingBalance=account.getBalance()-withdrawAmount;
                    if(remainingBalance<100){
                        JOptionPane.showMessageDialog(null, "You Do not Have Sufficient Balance for This Withdraw","Alert",JOptionPane.WARNING_MESSAGE);
                    }
                    else{
                        account.withdraw(withdrawAmount);
                        JOptionPane.showMessageDialog(null, "Successfully withdraw "+withdrawAmount+" take from your Account Balance","Confirmation",JOptionPane.INFORMATION_MESSAGE);
                        firstTime=true;
                    }
                }
                else{
                    Bank bank = new Bank();
                    double remainingBalance=account.getBalance()-(withdrawAmount+bank.getTRANSACTION_FEES());
                        if(remainingBalance<100){
                            JOptionPane.showMessageDialog(null, "You Do not Have Sufficient Balance for This Withdraw","Alert",JOptionPane.WARNING_MESSAGE);
                        }
                        else{
                            account.withdraw(withdrawAmount);
                            JOptionPane.showMessageDialog(null, "Successfully withdraw "+withdrawAmount+" take from your Account Balance","Confirmation",JOptionPane.INFORMATION_MESSAGE);
                        }
                }
                
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Deposit Amount must be a Numeric Value","Information",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_withdrawMoneyButtonActionPerformed

    private void exitButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButton1ActionPerformed
        JOptionPane.showMessageDialog(null,"Entire Programe Will be Closed !!","Close Alert",JOptionPane.WARNING_MESSAGE);
        System.exit(0);
    }//GEN-LAST:event_exitButton1ActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        Withdraw1 withdraw1 = new Withdraw1();
        close();
        withdraw1.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void cencelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cencelButtonActionPerformed
        withdrawAmountField.setText("");
    }//GEN-LAST:event_cencelButtonActionPerformed

    private void goToMainMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goToMainMenuButtonActionPerformed
        MainMenu mainMenu = new MainMenu();
        close();
        mainMenu.setVisible(true);
    }//GEN-LAST:event_goToMainMenuButtonActionPerformed


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
            java.util.logging.Logger.getLogger(Withdraw2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Withdraw2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Withdraw2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Withdraw2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Withdraw2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton cencelButton;
    private javax.swing.JButton exitButton1;
    private javax.swing.JButton goToMainMenuButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField withdrawAmountField;
    private javax.swing.JButton withdrawMoneyButton;
    // End of variables declaration//GEN-END:variables
    private void close(){
        WindowEvent windowClose = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(windowClose);
    }
    public void giveAccount(Account tempAccount) {
       account=tempAccount;
    }
    
}
