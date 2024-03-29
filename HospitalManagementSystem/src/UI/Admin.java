/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.Doctor;
import Model.Patient;
import Model.Hospital;
import Model.DoctorDirectory;
import Model.EncounterHistory;
import Model.HospitalDirectory;
import Model.PatientDirectory;
import Model.Person;
import Model.PersonDirectory;
import Model3.CommunityHistory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vivek
 */
public class Admin extends javax.swing.JPanel {

    /**
     * Creates new form Admin
     */
    DoctorDirectory docDir;
    HospitalDirectory hospDir;
    PatientDirectory ptnDir;
    PersonDirectory prnDir;
    EncounterHistory encounter;
    CommunityHistory comm;
    
    public Admin(HospitalDirectory hospDirInfo, PersonDirectory prnDirInfo, EncounterHistory encInfo, PatientDirectory ptnDirInfo, DoctorDirectory docDirInfo, CommunityHistory comm) {
        initComponents();
        this.prnDir = prnDirInfo;
        this.encounter = encInfo;
        this.hospDir = hospDirInfo;
        this.ptnDir = ptnDirInfo;
        this.docDir = docDirInfo;
        this.comm = comm;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane6 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel4 = new javax.swing.JPanel();
        CreateButton = new javax.swing.JButton();
        SearchButton = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jSplitPane2 = new javax.swing.JSplitPane();
        jPanel11 = new javax.swing.JPanel();
        CreateButton4 = new javax.swing.JButton();
        SearchButton1 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jSplitPane3 = new javax.swing.JSplitPane();
        jPanel14 = new javax.swing.JPanel();
        CreateButton5 = new javax.swing.JButton();
        SearchButton4 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jSplitPane4 = new javax.swing.JSplitPane();
        jPanel17 = new javax.swing.JPanel();
        CreateButton6 = new javax.swing.JButton();
        SearchButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        jTabbedPane6.setBackground(new java.awt.Color(204, 204, 204));
        jTabbedPane6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane6MouseClicked(evt);
            }
        });

        jPanel4.setBackground(java.awt.Color.lightGray);
        jPanel4.setPreferredSize(new java.awt.Dimension(138, 800));

        CreateButton.setBackground(new java.awt.Color(204, 204, 204));
        CreateButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        CreateButton.setText("Add");
        CreateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateButtonActionPerformed(evt);
            }
        });

        SearchButton.setBackground(new java.awt.Color(204, 204, 204));
        SearchButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        SearchButton.setText("Manage");
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CreateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SearchButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(CreateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(SearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(455, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel4);

        jPanel9.setBackground(java.awt.Color.gray);
        jPanel9.setForeground(java.awt.Color.lightGray);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(jPanel9);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        jTabbedPane6.addTab("Doctor ", jPanel2);

        jPanel11.setBackground(java.awt.Color.lightGray);

        CreateButton4.setBackground(new java.awt.Color(204, 204, 204));
        CreateButton4.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        CreateButton4.setText("Add");
        CreateButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateButton4ActionPerformed(evt);
            }
        });

        SearchButton1.setBackground(new java.awt.Color(204, 204, 204));
        SearchButton1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        SearchButton1.setText("Manage");
        SearchButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CreateButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SearchButton1))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(CreateButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addComponent(SearchButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(455, Short.MAX_VALUE))
        );

        jSplitPane2.setLeftComponent(jPanel11);

        jPanel12.setBackground(java.awt.Color.gray);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );

        jSplitPane2.setRightComponent(jPanel12);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2)
        );

        jTabbedPane6.addTab("Hospital ", jPanel10);

        jPanel14.setBackground(java.awt.Color.lightGray);

        CreateButton5.setBackground(new java.awt.Color(204, 204, 204));
        CreateButton5.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        CreateButton5.setText("Add");
        CreateButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateButton5ActionPerformed(evt);
            }
        });

        SearchButton4.setBackground(new java.awt.Color(204, 204, 204));
        SearchButton4.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        SearchButton4.setText("Manage");
        SearchButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CreateButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SearchButton4))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(CreateButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addComponent(SearchButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(455, Short.MAX_VALUE))
        );

        jSplitPane3.setLeftComponent(jPanel14);

        jPanel15.setBackground(java.awt.Color.gray);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );

        jSplitPane3.setRightComponent(jPanel15);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane3)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane3)
        );

        jTabbedPane6.addTab("Patient", jPanel13);

        jPanel17.setBackground(java.awt.Color.lightGray);

        CreateButton6.setBackground(new java.awt.Color(204, 204, 204));
        CreateButton6.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        CreateButton6.setText("New Encounter");
        CreateButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateButton6ActionPerformed(evt);
            }
        });

        SearchButton5.setBackground(new java.awt.Color(204, 204, 204));
        SearchButton5.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        SearchButton5.setText("View Encounter");
        SearchButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CreateButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SearchButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(CreateButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93)
                .addComponent(SearchButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(446, Short.MAX_VALUE))
        );

        jSplitPane4.setLeftComponent(jPanel17);

        jPanel1.setBackground(java.awt.Color.gray);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );

        jSplitPane4.setRightComponent(jPanel1);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane4)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane4)
        );

        jTabbedPane6.addTab("Encounter", jPanel16);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane6)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane6, javax.swing.GroupLayout.Alignment.TRAILING)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTabbedPane6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane6MouseClicked

    }//GEN-LAST:event_jTabbedPane6MouseClicked

    private void SearchButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButton4ActionPerformed
        // TODO add your handling code here:
        AdminPatient addptn = new AdminPatient(ptnDir,comm);
        jSplitPane3.setRightComponent(addptn);
    }//GEN-LAST:event_SearchButton4ActionPerformed

    private void CreateButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateButton5ActionPerformed
        // TODO add your handling code here:
        AddPatient addptnt = new AddPatient(ptnDir,comm);
        jSplitPane3.setRightComponent(addptnt);
    }//GEN-LAST:event_CreateButton5ActionPerformed

    private void SearchButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButton1ActionPerformed
        // TODO add your handling code here:
        AdminHospital addHosp = new AdminHospital(hospDir);
        jSplitPane2.setRightComponent(addHosp);
    }//GEN-LAST:event_SearchButton1ActionPerformed

    private void CreateButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateButton4ActionPerformed
        // TODO add your handling code here:
        AddHospital addhosp = new AddHospital(hospDir);
        jSplitPane2.setRightComponent(addhosp);
    }//GEN-LAST:event_CreateButton4ActionPerformed

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
        // TODO add your handling code here:
        AdminDoctor addDoc = new AdminDoctor(docDir);
        jSplitPane1.setRightComponent(addDoc );
    }//GEN-LAST:event_SearchButtonActionPerformed

    private void CreateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateButtonActionPerformed
        // TODO add your handling code here:
        AddDoctor adddoc = new AddDoctor(docDir);
        jSplitPane1.setRightComponent(adddoc);
    }//GEN-LAST:event_CreateButtonActionPerformed

    private void CreateButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateButton6ActionPerformed
        // TODO add your handling code here:
        NewEncounter newenc = new NewEncounter(encounter);
        jSplitPane4.setRightComponent(newenc);
    }//GEN-LAST:event_CreateButton6ActionPerformed

    private void SearchButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButton5ActionPerformed
        SearchEncounterHistory search = new SearchEncounterHistory(encounter);
        jSplitPane4.setRightComponent(search);
    }//GEN-LAST:event_SearchButton5ActionPerformed

//    private void populateTable() {
//        
//        DefaultTableModel model = (DefaultTableModel) Table.getModel();
//        model.setRowCount(0);
//        
//        for(Employee emp : employeedir.getDirectory()){
//            
//            Object[] row = new Object[4];
//            row[0] = emp;
//            row[1] = emp.getName();
//            row[2] = emp.getPositionTitle();
//            row[3] = emp.getTeamInfo();
//            
//            model.addRow(row);
//        }
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateButton;
    private javax.swing.JButton CreateButton4;
    private javax.swing.JButton CreateButton5;
    private javax.swing.JButton CreateButton6;
    private javax.swing.JButton SearchButton;
    private javax.swing.JButton SearchButton1;
    private javax.swing.JButton SearchButton4;
    private javax.swing.JButton SearchButton5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JSplitPane jSplitPane3;
    private javax.swing.JSplitPane jSplitPane4;
    private javax.swing.JTabbedPane jTabbedPane6;
    // End of variables declaration//GEN-END:variables
}
