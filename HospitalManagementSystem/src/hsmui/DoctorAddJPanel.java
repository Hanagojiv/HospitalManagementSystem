/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package hsmui;

import hsmmodel.Doctor;
import hsmmodel.DoctorCatalogue;
import javax.swing.JOptionPane;

/**
 *
 * @author vivekhanagoji
 */
public class DoctorAddJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorAddJPanel
     */
    DoctorCatalogue doctor;
    public DoctorAddJPanel(DoctorCatalogue doctor) {
        initComponents();
        this.doctor= doctor;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        AddButton = new javax.swing.JButton();
        txtDesignation = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtDocID = new javax.swing.JTextField();
        GenderLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtHospitalID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        NameLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDocName = new javax.swing.JTextField();
        txtContact = new javax.swing.JTextField();
        EmailLabel = new javax.swing.JLabel();
        ContactLabel = new javax.swing.JLabel();
        txtEmailID = new javax.swing.JTextField();
        PersonalInfoLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtSpecialization = new javax.swing.JTextField();
        HospitalNamelbl = new javax.swing.JLabel();
        txtHospitalName = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Create New Doctor");

        AddButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        AddButton.setText("ADD");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        GenderLabel.setText("Gender");

        jLabel5.setText("Specialization");

        jLabel2.setText("Age");

        NameLabel.setText("Doctor ID");

        jLabel3.setText("Designation");

        jLabel4.setText("Name");

        EmailLabel.setText("Email Id");

        ContactLabel.setText("Contact");

        txtEmailID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailIDActionPerformed(evt);
            }
        });

        PersonalInfoLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        PersonalInfoLabel1.setText("Contact Information");

        jLabel6.setText("Hospital ID");

        HospitalNamelbl.setText("Hospital Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NameLabel)
                            .addComponent(jLabel4)
                            .addComponent(GenderLabel)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(HospitalNamelbl))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDocID)
                            .addComponent(txtGender)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDocName)
                            .addComponent(txtDesignation, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHospitalID, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSpecialization, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHospitalName, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(278, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ContactLabel)
                            .addComponent(EmailLabel))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PersonalInfoLabel1)
                .addGap(326, 326, 326))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameLabel)
                    .addComponent(txtDocID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDocName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GenderLabel)
                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(txtDesignation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtSpecialization, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtHospitalID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HospitalNamelbl)
                    .addComponent(txtHospitalName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addComponent(PersonalInfoLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ContactLabel)
                    .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EmailLabel))
                .addGap(41, 41, 41)
                .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(251, 251, 251))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        // TODO add your handling code here:
        Doctor doc = doctor.addNewDoctor();
//
//        String docName = txtDocName.getText();
//        String docID = txtDocID.getText();
//        String gender = txtGender.getText();
//        String age = txtAge.getText();
//        String Designation = txtDesignation.getText();
//        String Specialization = txtSpecialization.getText();
//        String PhoneNo = txtContact.getText();
//        String Emailid =txtEmailID.getText();
        
doc.setDoctorName(txtDocName.getText());
doc.setDocID(Integer.parseInt(txtDocID.getText()));
doc.setGender(txtGender.getText());
doc.setHospitalID(Integer.parseInt(txtHospitalID.getText()));
doc.setHospitalName(txtHospitalName.getText());
doc.setAge(Integer.parseInt(txtAge.getText()));
doc.setDesignation(txtDesignation.getText());
doc.setSpecialization(txtSpecialization.getText());
doc.setContactNum(txtContact.getText());
doc.setEmailID(txtEmailID.getText());

JOptionPane.showMessageDialog(this, "New Doctor Created");


txtDocName.setText("");
txtDocID.setText("");
txtHospitalID.setText("");
txtDocName.setText("");
txtAge.setText("");
txtDesignation.setText("");
txtSpecialization.setText("");
txtContact.setText("");

        
//
//        doc.setDocID(docId);
//        doc.setDocName(name);
//        doc.setGender(gender);
//
//        JOptionPane.showMessageDialog(this , "New Doctor Information Added!");
//
//        txt_id.setText("");
//        txtname.setText("");
//        txtage.setText("");
//        txtcontact.setText("");
//        txtemail.setText("");
//        txtgender.setName("select gender");

        //        Employee emp = employeedir.addNewEmployee();
        //        String Name = NameTxtBox.getText();
        //        String Gender = GenderTxtBox.getSelectedItem().toString();
        //        int Age = Integer.parseInt(AgeTxtBox.getText());
        //        String EmpID = EmpIdTxtBox.getText();
        //        String Team = TeamTxtBox.getText();
        //        String Position = PositionTxtBox.getText();
        //        String Level = LevelTxtBox.getText();
        //        String Contact = ContactTxtBox.getText();
        //        String Email = EmailTxtBox.getText();
        //        String Date = DateTxtBox.getText();
        //        String Path = filepath;
        //
        //        emp.setEmployeeID(EmpID);
        //        emp.setName(Name);
        //        emp.setGender(Gender);
        //        emp.setAge(Age);
        //        emp.setTeamInfo(Team);
        //        emp.setPositionTitle(Position);
        //        emp.setLevel(Level);
        //        emp.setContact(Contact);
        //        emp.setEmail(Email);
        //        emp.setStartDate(Date);
        //        emp.setImage(Path);
        //
        //        JOptionPane.showMessageDialog(this , "New Employee Information Added!");
        //
        //        NameTxtBox.setText("");
        //        GenderTxtBox.setName("select");
        //        AgeTxtBox.setText("");
        //        EmpIdTxtBox.setText("");
        //        TeamTxtBox.setText("");
        //        PositionTxtBox.setText("");
        //        LevelTxtBox.setText("");
        //        ContactTxtBox.setText("");
        //        EmailTxtBox.setText("");
        //        DateTxtBox.setText("");
        //        ImageLabel.setText("");
        //        nLbl.setText("");
    }//GEN-LAST:event_AddButtonActionPerformed

    private void txtEmailIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailIDActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JLabel ContactLabel;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JLabel GenderLabel;
    private javax.swing.JLabel HospitalNamelbl;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JLabel PersonalInfoLabel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtDesignation;
    private javax.swing.JTextField txtDocID;
    private javax.swing.JTextField txtDocName;
    private javax.swing.JTextField txtEmailID;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtHospitalID;
    private javax.swing.JTextField txtHospitalName;
    private javax.swing.JTextField txtSpecialization;
    // End of variables declaration//GEN-END:variables
}