/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ttt;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author strange
 */
public class TicTacToeFrame extends javax.swing.JFrame {
    
    private String whoseTurn = "X";
    private String playerOne = "Player One";
    private String playerTwo = "Player Two";
    private int PlayerOneCount = 0;
    private int PlayerTwoCount = 0;
    private String playersTurn ="";
    
    /**
     * Creates new form TicTacToeFrame
     */
    public TicTacToeFrame() {
        initComponents();
        setSize(600,600);
        setLocationRelativeTo(null);
        getPlayerNames();
        setPlayerName();
        setScore();
    }
    
    private void tieGame(){
        String one = jButton1.getText();
        String two = jButton2.getText();
        String three = jButton3.getText();
        String four = jButton4.getText();
        String five = jButton5.getText();
        String six = jButton6.getText();
        String seven = jButton7.getText();
        String eight = jButton8.getText();
        String nine = jButton9.getText();
        
        if(one!="" && two!="" && three!="" && four!="" && five!="" && six!="" && seven!="" && eight!="" && nine!=""){
            JOptionPane.showMessageDialog(this,
                    "Game is a tie!",
                    "Tie Game",
                    JOptionPane.INFORMATION_MESSAGE);
            resetGame();
        }
    }
    
    private void setScore(){
                        
        jLabel_source.setText(playerOne+"'s score is:"+String.valueOf(PlayerOneCount)+"     "+playersTurn+"'s turn"+"     "+playerTwo+"'s score is:"+String.valueOf(PlayerTwoCount));
    }
    
    private void setPlayerName(){
        
        if(whoseTurn.equalsIgnoreCase("X")){
            playersTurn = playerOne;
        }else{
            playersTurn = playerTwo;
        }
        jLabel_source.setText(playerOne+"'s score is:"+String.valueOf(PlayerOneCount)+"     "+playersTurn+"'s turn"+"     "+playerTwo+"'s score is:"+String.valueOf(PlayerTwoCount));

    }
    
    private void getPlayerNames(){
        playerOne = JOptionPane.showInputDialog(this,
                "Player One Name",
                "Player Name",
                JOptionPane.INFORMATION_MESSAGE);
        playerTwo = JOptionPane.showInputDialog(this,
                "Player Two Name",
                "Player Name",
                JOptionPane.INFORMATION_MESSAGE);
        if (playerOne.equals("")){
            playerOne = "Player One";
        }
        if (playerTwo.equals("")){
            playerTwo = "Player Two";
        }
    }
    
    private void determineWhoseTurn(){
        if (whoseTurn.equalsIgnoreCase("X")){
            whoseTurn = "O";
        }
        else{
            whoseTurn = "X";
        }
    }
    
    private void xWins(){
        JOptionPane.showMessageDialog(this, 
                playerOne+" wins",
                "Winner!",
                JOptionPane.INFORMATION_MESSAGE);
        PlayerOneCount++;
        resetGame();
    }
    
    private void oWins(){
        JOptionPane.showMessageDialog(this, 
                playerTwo+" wins",
                "Winner!",
                JOptionPane.INFORMATION_MESSAGE);
        PlayerTwoCount++;
        resetGame();
    }
    
    private void resetGame(){
        jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        jButton4.setText("");
        jButton5.setText("");
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");
        setScore();
    }

    private void determineIfWin(){
        String one = jButton1.getText();
        String two = jButton2.getText();
        String three = jButton3.getText();
        String four = jButton4.getText();
        String five = jButton5.getText();
        String six = jButton6.getText();
        String seven = jButton7.getText();
        String eight = jButton8.getText();
        String nine = jButton9.getText();
        
        //when X wins:
        if ( one == "X" && two == "X" && three == "X" ){
            xWins();
        }
        if ( four == "X" && five == "X" && six == "X" ){
            xWins();
        }
        if ( seven == "X" && eight == "X" && nine == "X" ){
            xWins();
        }
        if ( one == "X" && four == "X" && seven == "X" ){
            xWins();
        }
        if ( two == "X" && five == "X" && eight == "X" ){
            xWins();
        }
        if ( three == "X" && six == "X" && nine == "X" ){
            xWins();
        }
        if ( one == "X" && five == "X" && nine == "X" ){
            xWins();
        }
        if ( three == "X" && five == "X" && seven == "X" ){
            xWins();
        }
        
        //when O wins:
        if ( one == "O" && two == "O" && three == "O" ){
            oWins();
        }
        if ( four == "O" && five == "O" && six == "O" ){
            oWins();
        }
        if ( seven == "O" && eight == "O" && nine == "O" ){
            oWins();
        }
        if ( one == "O" && four == "O" && seven == "O" ){
            oWins();
        }
        if ( two == "O" && five == "O" && eight == "O" ){
            oWins();
        }
        if ( three == "O" && six == "O" && nine == "O" ){
            oWins();
        }
        if ( one == "O" && five == "O" && nine == "O" ){
            oWins();
        }
        if ( three == "O" && five == "O" && seven == "O" ){
            oWins();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_source = new javax.swing.JLabel();
        jPanel_GridHolder = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");
        setBackground(new java.awt.Color(47, 57, 67));
        setPreferredSize(new java.awt.Dimension(600, 600));

        jLabel_source.setBackground(new java.awt.Color(254, 254, 254));
        jLabel_source.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel_source.setForeground(new java.awt.Color(1, 1, 1));
        jLabel_source.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_source.setText("Place holder for score");
        getContentPane().add(jLabel_source, java.awt.BorderLayout.PAGE_END);

        jPanel_GridHolder.setBackground(new java.awt.Color(228, 228, 228));
        jPanel_GridHolder.setForeground(new java.awt.Color(1, 1, 1));
        jPanel_GridHolder.setLayout(new java.awt.GridLayout(3, 3, 1, 1));

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jButton1.setFont(new java.awt.Font("Ubuntu", 0, 100)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, java.awt.BorderLayout.CENTER);

        jPanel_GridHolder.add(jPanel1);

        jPanel2.setBackground(java.awt.Color.white);
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jButton2.setFont(new java.awt.Font("Ubuntu", 0, 100)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, java.awt.BorderLayout.CENTER);

        jPanel_GridHolder.add(jPanel2);

        jPanel3.setBackground(java.awt.Color.white);
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jButton3.setFont(new java.awt.Font("Ubuntu", 0, 100)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, java.awt.BorderLayout.CENTER);

        jPanel_GridHolder.add(jPanel3);

        jPanel4.setBackground(java.awt.Color.white);
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jButton4.setFont(new java.awt.Font("Ubuntu", 0, 100)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4, java.awt.BorderLayout.CENTER);

        jPanel_GridHolder.add(jPanel4);

        jPanel6.setBackground(java.awt.Color.white);
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jButton5.setFont(new java.awt.Font("Ubuntu", 0, 100)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton5, java.awt.BorderLayout.CENTER);

        jPanel_GridHolder.add(jPanel6);

        jPanel5.setBackground(java.awt.Color.white);
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jButton6.setFont(new java.awt.Font("Ubuntu", 0, 100)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton6, java.awt.BorderLayout.CENTER);

        jPanel_GridHolder.add(jPanel5);

        jPanel7.setBackground(java.awt.Color.white);
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jButton7.setFont(new java.awt.Font("Ubuntu", 0, 100)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton7, java.awt.BorderLayout.CENTER);

        jPanel_GridHolder.add(jPanel7);

        jPanel8.setBackground(java.awt.Color.white);
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jButton8.setFont(new java.awt.Font("Ubuntu", 0, 100)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton8, java.awt.BorderLayout.CENTER);

        jPanel_GridHolder.add(jPanel8);

        jPanel9.setBackground(java.awt.Color.white);
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel9.setLayout(new java.awt.BorderLayout());

        jButton9.setFont(new java.awt.Font("Ubuntu", 0, 100)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton9, java.awt.BorderLayout.CENTER);

        jPanel_GridHolder.add(jPanel9);

        getContentPane().add(jPanel_GridHolder, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jButton1.setText(whoseTurn);
        if (whoseTurn.equalsIgnoreCase("X")){
            jButton1.setForeground(Color.red);
        }else{
            jButton1.setForeground(Color.blue);
        }
        determineWhoseTurn();
        determineIfWin();
        tieGame();
        setPlayerName();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jButton2.setText(whoseTurn);
        if (whoseTurn.equalsIgnoreCase("X")){
            jButton2.setForeground(Color.red);
        }else{
            jButton2.setForeground(Color.blue);
        }
        determineWhoseTurn();
        determineIfWin();
        tieGame();
        setPlayerName();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jButton3.setText(whoseTurn);
        if (whoseTurn.equalsIgnoreCase("X")){
            jButton3.setForeground(Color.red);
        }else{
            jButton3.setForeground(Color.blue);
        }
        determineWhoseTurn();
        determineIfWin();
        tieGame();
        setPlayerName();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jButton4.setText(whoseTurn);
        if (whoseTurn.equalsIgnoreCase("X")){
            jButton4.setForeground(Color.red);
        }else{
            jButton4.setForeground(Color.blue);
        }
        determineWhoseTurn();
        determineIfWin();
        tieGame();
        setPlayerName();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jButton5.setText(whoseTurn);
        if (whoseTurn.equalsIgnoreCase("X")){
            jButton5.setForeground(Color.red);
        }else{
            jButton5.setForeground(Color.blue);
        }
        determineWhoseTurn();
        determineIfWin();
        tieGame();
        setPlayerName();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jButton6.setText(whoseTurn);
        if (whoseTurn.equalsIgnoreCase("X")){
            jButton6.setForeground(Color.red);
        }else{
            jButton6.setForeground(Color.blue);
        }
        determineWhoseTurn();
        determineIfWin();
        tieGame();
        setPlayerName();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jButton7.setText(whoseTurn);
        if (whoseTurn.equalsIgnoreCase("X")){
            jButton7.setForeground(Color.red);
        }else{
            jButton7.setForeground(Color.blue);
        }
        determineWhoseTurn();
        determineIfWin();
        tieGame();
        setPlayerName();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jButton8.setText(whoseTurn);
        if (whoseTurn.equalsIgnoreCase("X")){
            jButton8.setForeground(Color.red);
        }else{
            jButton8.setForeground(Color.blue);
        }
        determineWhoseTurn();
        determineIfWin();
        tieGame();
        setPlayerName();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        jButton9.setText(whoseTurn);
        if (whoseTurn.equalsIgnoreCase("X")){
            jButton9.setForeground(Color.red);
        }else{
            jButton9.setForeground(Color.blue);
        }
        determineWhoseTurn();
        determineIfWin();
        tieGame();
        setPlayerName();
    }//GEN-LAST:event_jButton9ActionPerformed

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
            java.util.logging.Logger.getLogger(TicTacToeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel_source;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanel_GridHolder;
    // End of variables declaration//GEN-END:variables
}
