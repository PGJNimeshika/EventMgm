/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package evet.managment.system;

/**
 *
 * @author Dewanganii
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnEventdet = new javax.swing.JButton();
        btnWedding = new javax.swing.JButton();
        btnAnnvesary = new javax.swing.JButton();
        btnBday = new javax.swing.JButton();
        btnBco = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1378, 742));
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Home page");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 10, 150, 50);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setText("Event Managment System");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 50, 450, 48);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sandu\\Documents\\NetBeansProjects\\Event_Management_System\\src\\images\\blu.jpg")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1400, 130);

        btnEventdet.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        btnEventdet.setText("Event Details");
        btnEventdet.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEventdet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEventdetActionPerformed(evt);
            }
        });
        getContentPane().add(btnEventdet);
        btnEventdet.setBounds(560, 160, 190, 80);

        btnWedding.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        btnWedding.setText("Wedding");
        btnWedding.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnWedding.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWeddingActionPerformed(evt);
            }
        });
        getContentPane().add(btnWedding);
        btnWedding.setBounds(560, 270, 190, 80);

        btnAnnvesary.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        btnAnnvesary.setText("Anniversary");
        btnAnnvesary.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAnnvesary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnvesaryActionPerformed(evt);
            }
        });
        getContentPane().add(btnAnnvesary);
        btnAnnvesary.setBounds(560, 500, 190, 90);

        btnBday.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        btnBday.setText("Party");
        btnBday.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBdayActionPerformed(evt);
            }
        });
        getContentPane().add(btnBday);
        btnBday.setBounds(560, 380, 190, 90);

        btnBco.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        btnBco.setText("Business Confronts");
        btnBco.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBcoActionPerformed(evt);
            }
        });
        getContentPane().add(btnBco);
        btnBco.setBounds(560, 620, 190, 90);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-10, 120, 0, 0);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sandu\\Documents\\NetBeansProjects\\Event_Management_System\\src\\images\\pexels-photo-246658.jpeg")); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(-6, 130, 1360, 730);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnWeddingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWeddingActionPerformed
        // TODO add your handling code here:
        Wedding wd = new Wedding();   
        wd.setVisible(true);
        this.dispose();
        
        
    }//GEN-LAST:event_btnWeddingActionPerformed

    private void btnEventdetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEventdetActionPerformed
        // TODO add your handling code here:
        EventDetails Event_det = new EventDetails();
        Event_det.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEventdetActionPerformed

    private void btnBdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBdayActionPerformed
        Parties bparty = new Parties();   
        bparty.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBdayActionPerformed

    private void btnAnnvesaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnvesaryActionPerformed
        Anniversaries Anv = new Anniversaries();   
        Anv.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAnnvesaryActionPerformed

    private void btnBcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBcoActionPerformed
        BusinessCo Bco = new BusinessCo();   
        Bco.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBcoActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnnvesary;
    private javax.swing.JButton btnBco;
    private javax.swing.JButton btnBday;
    private javax.swing.JButton btnEventdet;
    private javax.swing.JButton btnWedding;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
