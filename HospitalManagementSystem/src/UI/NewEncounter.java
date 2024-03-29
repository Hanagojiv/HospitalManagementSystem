/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.Encounter;
import Model.EncounterHistory;
import javax.swing.JOptionPane;

/**
 *
 * @author vivek
 */
public class NewEncounter extends javax.swing.JPanel {

    /**
     * Creates new form NewEncounter
     */
    EncounterHistory encounter;
    public NewEncounter(EncounterHistory encounter) {
        initComponents();
        this.encounter = encounter;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AgeLabel8 = new javax.swing.JLabel();
        txtPatientID = new javax.swing.JTextField();
        PersonalInfoLabel10 = new javax.swing.JLabel();
        NameLabel8 = new javax.swing.JLabel();
        PersonalInfoLabel8 = new javax.swing.JLabel();
        txtBodyTemp = new javax.swing.JTextField();
        txtDoctorID = new javax.swing.JTextField();
        txtBloodPressure = new javax.swing.JTextField();
        EmailLabel6 = new javax.swing.JLabel();
        txtPulseRate = new javax.swing.JTextField();
        EmailLabel5 = new javax.swing.JLabel();
        ContactLabel5 = new javax.swing.JLabel();
        txtDoctorName = new javax.swing.JTextField();
        NameLabel9 = new javax.swing.JLabel();
        btn_add4 = new javax.swing.JButton();
        NewEmployeeLabel4 = new javax.swing.JLabel();
        NameLabel10 = new javax.swing.JLabel();
        txtPatientName = new javax.swing.JTextField();
        PersonalInfoLabel11 = new javax.swing.JLabel();
        PersonalInfoLabel12 = new javax.swing.JLabel();
        ContactLabel7 = new javax.swing.JLabel();
        txtHospitalName = new javax.swing.JLabel();
        txtbx_hospName = new javax.swing.JTextField();
        txtHospitalID = new javax.swing.JTextField();

        setBackground(java.awt.Color.gray);

        AgeLabel8.setText("Patient ID");

        PersonalInfoLabel10.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        PersonalInfoLabel10.setText("Vital Signs");

        NameLabel8.setText("Doctor ID");

        PersonalInfoLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        PersonalInfoLabel8.setText("Details");

        txtBodyTemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBodyTempActionPerformed(evt);
            }
        });

        txtBloodPressure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBloodPressureActionPerformed(evt);
            }
        });

        EmailLabel6.setText("Temprature");

        txtPulseRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPulseRateActionPerformed(evt);
            }
        });

        EmailLabel5.setText("Blood Pressure");

        ContactLabel5.setText("Pulse Rate");

        NameLabel9.setText("Name");

        btn_add4.setBackground(new java.awt.Color(204, 204, 204));
        btn_add4.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btn_add4.setText("Add");
        btn_add4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add4ActionPerformed(evt);
            }
        });

        NewEmployeeLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        NewEmployeeLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NewEmployeeLabel4.setText("Encounter");

        NameLabel10.setText("Name");

        PersonalInfoLabel11.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        PersonalInfoLabel11.setText("Doctor Details");

        PersonalInfoLabel12.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        PersonalInfoLabel12.setText("Hospital Information");

        ContactLabel7.setText("Hospital ID");

        txtHospitalName.setText("Hospital Name");

        txtbx_hospName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbx_hospNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(NewEmployeeLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(PersonalInfoLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(97, 97, 97))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(EmailLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                .addGap(182, 182, 182))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ContactLabel7)
                                            .addComponent(txtHospitalName))
                                        .addGap(26, 26, 26)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtHospitalID, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtbx_hospName, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(EmailLabel5)
                                            .addComponent(ContactLabel5))
                                        .addGap(24, 24, 24)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtPulseRate)
                                            .addComponent(txtBloodPressure)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(113, 113, 113)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtBodyTemp, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))))
                                .addGap(44, 44, 44)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(NameLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                                        .addGap(50, 50, 50))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(NameLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(70, 70, 70))
                                    .addComponent(PersonalInfoLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDoctorID, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btn_add4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(169, 169, 169))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PersonalInfoLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(499, 499, 499))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(NameLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(531, 531, 531))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(AgeLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PersonalInfoLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(537, 537, 537))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(NewEmployeeLabel4)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PersonalInfoLabel8)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AgeLabel8)
                            .addComponent(txtPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NameLabel10)
                            .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PersonalInfoLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ContactLabel5)
                            .addComponent(txtPulseRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EmailLabel5)
                            .addComponent(txtBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PersonalInfoLabel11)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NameLabel8)
                            .addComponent(txtDoctorID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NameLabel9)
                            .addComponent(txtDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(84, 84, 84)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmailLabel6)
                    .addComponent(txtBodyTemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PersonalInfoLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ContactLabel7)
                    .addComponent(txtHospitalID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbx_hospName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHospitalName))
                .addGap(17, 17, 17)
                .addComponent(btn_add4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(373, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtBodyTempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBodyTempActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBodyTempActionPerformed

    private void txtBloodPressureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBloodPressureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBloodPressureActionPerformed

    private void txtPulseRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPulseRateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPulseRateActionPerformed

    private void btn_add4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add4ActionPerformed
        // TODO add your handling code here:
        boolean valid = validationForFields();
        
        String PatientID = txtPatientID.getText();
        int HosID = Integer.parseInt(txtHospitalID.getText());
        int DocID = Integer.parseInt(txtDoctorID.getText());
        int PulseRate = Integer.parseInt(txtPulseRate.getText());
        int BodyTemp = Integer.parseInt(txtBodyTemp.getText());
        String ptName = txtPatientName.getText();
        String docName = txtDoctorName.getText();
        String hospName = txtbx_hospName.getText();
        String bloodpress = txtBloodPressure.getText();
        
       
               
        if(valid)
        {
        Encounter enc = encounter.addNewEncounter();    
        
        enc.setPatientName(txtPatientName.getText());
        enc.setPatientID(PatientID);
        enc.setHospName(txtHospitalName.getText());
        enc.setHospID(HosID);
        enc.setDocID(DocID);
        enc.setDocName(txtDoctorName.getText());
        enc.setPulseRate(PulseRate);
        enc.setTemprature(BodyTemp);
        enc.setBloodPressure(txtBloodPressure.getText());
        
        JOptionPane.showMessageDialog(this, "New Encounter Created");
        
        txtPatientName.setText("");
        txtPatientID.setText("");
        txtHospitalID.setText("");
        txtDoctorID.setText("");
        txtPulseRate.setText("");
        txtBodyTemp.setText("");
        txtHospitalName.setText("");
        txtDoctorName.setText("");
        txtBloodPressure.setText("");
        
        }
    }//GEN-LAST:event_btn_add4ActionPerformed

    private void txtbx_hospNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbx_hospNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbx_hospNameActionPerformed

    private boolean validationForFields() {
    if(txtPatientName.getText().length()==0)
                {
                     JOptionPane.showMessageDialog(this," Name Can't be blank, please enter Patient Name");
                     txtPatientName.requestFocus();
                     txtPatientName.setText("");
                     return false;
                }
     else{
        if(!txtPatientName.getText().matches("^[a-zA-Z]+[\\-'\\s]?[a-zA-Z ]+$"))
            {
                 JOptionPane.showMessageDialog(this," Invalid name. ");
                 txtPatientName.requestFocus();
                 txtPatientName.setText("");
                 return false;


            }
          }
     if(txtHospitalName.getText().length()==0)
                {
                     JOptionPane.showMessageDialog(this," Name Can't be blank, please enter Hospital Name");
                     txtHospitalName.requestFocus();
                     txtHospitalName.setText("");
                     return false;
                }
     else{
        if(!txtHospitalName.getText().matches("^[a-zA-Z]+[\\-'\\s]?[a-zA-Z ]+$"))
            {
                 JOptionPane.showMessageDialog(this," Invalid name. ");
                 txtHospitalName.requestFocus();
                 txtHospitalName.setText("");
                 return false;


            }
          }
          if(txtDoctorName.getText().length()==0)
                {
                     JOptionPane.showMessageDialog(this," Name Can't be blank, please enter Doctor Name");
                     txtDoctorName.requestFocus();
                     txtDoctorName.setText("");
                     return false;
                }
     else{
        if(!txtDoctorName.getText().matches("^[a-zA-Z]+[\\-'\\s]?[a-zA-Z ]+$"))
            {
                 JOptionPane.showMessageDialog(this," Invalid name. ");
                 txtDoctorName.requestFocus();
                 txtDoctorName.setText("");
                 return false;


            }
          }
      if(txtPulseRate.getText().length()==0)
                {
                     JOptionPane.showMessageDialog(this," PulseRate Can't be blank, please enter PulseRate");
                     txtPulseRate.requestFocus();
                     txtPulseRate.setText("");
                     return false;
                }
        if(txtBodyTemp.getText().length()==0)
                {
                     JOptionPane.showMessageDialog(this," BodyTemp Can't be blank, please enter Body Temperature");
                     txtBodyTemp.requestFocus();
                     txtBodyTemp.setText("");
                     return false;
                }
          if(txtBloodPressure.getText().length()==0)
                {
                     JOptionPane.showMessageDialog(this," Blood Pressure Can't be blank, please enter Blood Pressure");
                     txtBloodPressure.requestFocus();
                     txtBloodPressure.setText("");
                     return false;
                }
//    if(txtDoctorName.getText().isBlank() )
//    {
//        JOptionPane.showMessageDialog(this," Patient ID Can't be blank, please enter Patient ID ");
//        txtDoctorName.requestFocus();
//        txtDoctorName.setText("");
//        return false;
//    }
//        else
//        {
//
//             if(!txtDoctorName.getText().matches("^[0-9]{0,3}$"))
//             {
//                JOptionPane.showMessageDialog(this," Invalid Patient, Note : Patient ID is of 3 digit  ");
//                txtDoctorName.requestFocus();
//                return false;
//
//             } 
//        }
    if(txtHospitalID.getText().isBlank() )
    {
        JOptionPane.showMessageDialog(this," Hospital ID Can't be blank, please enter Hospital ID ");
        txtHospitalID.requestFocus();
        txtHospitalID.setText("");
        return false;
    }
        else
        {

             if(!txtHospitalID.getText().matches("^[0-9]{0,3}$"))
             {
                JOptionPane.showMessageDialog(this," Invalid Hospital, Note : Hospital ID is of 3 digit  ");
                txtHospitalID.requestFocus();
                return false;

             } 
        }

     if(txtDoctorID.getText().isBlank() )
    {
        JOptionPane.showMessageDialog(this," Doctor ID Can't be blank, please enter Doctor ID ");
        txtDoctorID.requestFocus();
        txtDoctorID.setText("");
        return false;
    }
        else
        {

             if(!txtDoctorID.getText().matches("^[0-9]{0,3}$"))
             {
                JOptionPane.showMessageDialog(this," Invalid Doctor, Note : Doctor ID is of 3 digit  ");
                txtDoctorID.requestFocus();
                return false;

             } 
        }
          if(txtPatientID.getText().isBlank() )
    {
        JOptionPane.showMessageDialog(this," Doctor ID Can't be blank, please enter Doctor ID ");
        txtPatientID.requestFocus();
        txtPatientID.setText("");
        return false;
    }
        else
        {

             if(!txtPatientID.getText().matches("^[0-9]{0,3}$"))
             {
                JOptionPane.showMessageDialog(this," Invalid Doctor, Note : Doctor ID is of 3 digit  ");
                txtPatientID.requestFocus();
                return false;

             } 
        }
    return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AgeLabel8;
    private javax.swing.JLabel ContactLabel5;
    private javax.swing.JLabel ContactLabel7;
    private javax.swing.JLabel EmailLabel5;
    private javax.swing.JLabel EmailLabel6;
    private javax.swing.JLabel NameLabel10;
    private javax.swing.JLabel NameLabel8;
    private javax.swing.JLabel NameLabel9;
    private javax.swing.JLabel NewEmployeeLabel4;
    private javax.swing.JLabel PersonalInfoLabel10;
    private javax.swing.JLabel PersonalInfoLabel11;
    private javax.swing.JLabel PersonalInfoLabel12;
    private javax.swing.JLabel PersonalInfoLabel8;
    private javax.swing.JButton btn_add4;
    private javax.swing.JTextField txtBloodPressure;
    private javax.swing.JTextField txtBodyTemp;
    private javax.swing.JTextField txtDoctorID;
    private javax.swing.JTextField txtDoctorName;
    private javax.swing.JTextField txtHospitalID;
    private javax.swing.JLabel txtHospitalName;
    private javax.swing.JTextField txtPatientID;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JTextField txtPulseRate;
    private javax.swing.JTextField txtbx_hospName;
    // End of variables declaration//GEN-END:variables
}
