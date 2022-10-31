/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hsmui;

import hsmmodel.CommunityDirectory;
import hsmmodel.DoctorDirectory;
import hsmmodel.EncounterHistory;
import hsmmodel.HospitalDirectory;
import hsmmodel.PatientDirectory;
import hsmmodel.PersonDirectory;
import javax.swing.JOptionPane;

/**
 *
 * @author prathamesh
 */
public class HMO_MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFram
     */

    static String loginas;
    PersonDirectory prnDir;
    EncounterHistory encounter;
    HospitalDirectory hospDir;
    CommunityDirectory comDir;
    DoctorDirectory docDir;
    PatientDirectory ptnDir;
    
    public HMO_MainFrame(String loginas) {
        initComponents();
        this.prnDir = new PersonDirectory();
        this.encounter = new EncounterHistory();
        this.hospDir = new HospitalDirectory();
        this.ptnDir = new PatientDirectory();
        this.docDir = new DoctorDirectory();
        this.comDir = new CommunityDirectory();
        this.loginas = loginas;
//        validateUserRoles();
    }
    
    public void validateUserRoles(){
        if(loginas.equals("System Admin")){
           adminlbl.setVisible(true);
           userlbl.setVisible(false);
           System.setVisible(true);
           Doctor.setVisible(false);
           Community.setVisible(false);
           Hospital.setVisible(false);
           Patient.setVisible(false);
           Doctor.setVisible(false);
        }else if(loginas.equals("Community Admin")){
           adminlbl.setVisible(true);
           userlbl.setVisible(false);
           System.setVisible(false);
           Doctor.setVisible(false);
           Hospital.setVisible(false);
           Patient.setVisible(false);
           Doctor.setVisible(false);
           Community.setVisible(true);
        }else if(loginas.equals("Hospital Admin")){
           adminlbl.setVisible(true);
           userlbl.setVisible(false);
           System.setVisible(false);
           Doctor.setVisible(false);
           Hospital.setVisible(true);
           Patient.setVisible(false);
           Doctor.setVisible(false);
           Community.setVisible(false);
        }else if(loginas.equals("Patient")){
           adminlbl.setVisible(false);
           userlbl.setVisible(true);
           System.setVisible(false);
           Doctor.setVisible(false);
           Hospital.setVisible(false);
           Patient.setVisible(true);
           Doctor.setVisible(false);
           Community.setVisible(false);
        }else if(loginas.equals("Doctor")){
           adminlbl.setVisible(false);
           userlbl.setVisible(true);
           System.setVisible(false);
           Doctor.setVisible(false);
           Hospital.setVisible(false);
           Patient.setVisible(false);
           Doctor.setVisible(true);
           Community.setVisible(false);
        } 
    }  
        
//    Admin admin = new Admin(hospDir, prnDir,encounter,ptnDir);
//    
//    public void admin(){
//        jSplitPane1.setRightComponent(admin);
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel3 = new javax.swing.JPanel();
        Patient = new javax.swing.JButton();
        Hospital = new javax.swing.JButton();
        Community = new javax.swing.JButton();
        System = new javax.swing.JButton();
        Doctor = new javax.swing.JButton();
        adminlbl = new javax.swing.JLabel();
        userlbl = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Patient.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        Patient.setText("PATIENT");
        Patient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientActionPerformed(evt);
            }
        });

        Hospital.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        Hospital.setText("HOSPITAL");
        Hospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HospitalActionPerformed(evt);
            }
        });

        Community.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        Community.setText("COMMUNITY");
        Community.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CommunityActionPerformed(evt);
            }
        });

        System.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        System.setText("SYSTEM");
        System.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SystemActionPerformed(evt);
            }
        });

        Doctor.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        Doctor.setText("DOCTOR");
        Doctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoctorActionPerformed(evt);
            }
        });

        adminlbl.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        adminlbl.setText("Admin Login");

        userlbl.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        userlbl.setText("User Login");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Doctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Patient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Hospital, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(System, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Community, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminlbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(adminlbl)
                .addGap(18, 18, 18)
                .addComponent(System, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Community, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(Hospital, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(userlbl)
                .addGap(18, 18, 18)
                .addComponent(Patient, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Doctor, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(250, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel3);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("HOSPITAL MANAGEMENT SYSTEM");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(161, 161, 161))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addContainerGap(759, Short.MAX_VALUE))
        );

        jSplitPane1.setRightComponent(jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HospitalActionPerformed
        Admin admin = new Admin(hospDir, prnDir,encounter, ptnDir, docDir);
        jSplitPane1.setRightComponent(admin);
    }//GEN-LAST:event_HospitalActionPerformed

    private void PatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientActionPerformed
        // TODO add your handling code here:
        UserPatient user = new UserPatient(ptnDir);
        jSplitPane1.setRightComponent(user);
    }//GEN-LAST:event_PatientActionPerformed

    private void CommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CommunityActionPerformed
        // TODO add your handling code here:
        CommunityPage com = new CommunityPage(comDir);
        jSplitPane1.setRightComponent(com);
    }//GEN-LAST:event_CommunityActionPerformed

    private void SystemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SystemActionPerformed
        // TODO add your handling code here:
       SystemAdmin sys = new SystemAdmin(hospDir, prnDir,encounter, ptnDir, docDir, comDir);
       jSplitPane1.setRightComponent(sys);
        
    }//GEN-LAST:event_SystemActionPerformed

    private void DoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoctorActionPerformed
        // TODO add your handling code here:
        UserDoctor user = new UserDoctor(encounter);
        jSplitPane1.setRightComponent(user);
    }//GEN-LAST:event_DoctorActionPerformed

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
            java.util.logging.Logger.getLogger(HMO_MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HMO_MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HMO_MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HMO_MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                String loginas = null;
                new HMO_MainFrame(loginas).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Community;
    private javax.swing.JButton Doctor;
    private javax.swing.JButton Hospital;
    private javax.swing.JButton Patient;
    private javax.swing.JButton System;
    private javax.swing.JLabel adminlbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel userlbl;
    // End of variables declaration//GEN-END:variables
}