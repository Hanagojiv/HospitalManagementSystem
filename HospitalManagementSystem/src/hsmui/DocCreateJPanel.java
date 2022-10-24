/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package hsmui;

/**
 *
 * @author vivekhanagoji
 */
public class DocCreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DocCreateJPanel
     */
    public DocCreateJPanel() {
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

        jLabel1 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtDocName = new javax.swing.JTextField();
        lblId = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblDesignation = new javax.swing.JLabel();
        lblSpecialization = new javax.swing.JLabel();
        lblHospitalId = new javax.swing.JLabel();
        lblHospitalName = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblPhoneNumber = new javax.swing.JLabel();
        lblEmailId = new javax.swing.JLabel();
        txtDocID = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtSpecialization = new javax.swing.JTextField();
        txtGender1 = new javax.swing.JTextField();
        txtDesignation1 = new javax.swing.JTextField();
        txtHospitalID = new javax.swing.JTextField();
        txtHospitalName = new javax.swing.JTextField();
        txtHospitalAddress = new javax.swing.JTextField();
        txtEmailID = new javax.swing.JTextField();
        txtPhoneNumber1 = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Create Doctor Profile");

        lblName.setText("Doctor Name:");

        txtDocName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocNameActionPerformed(evt);
            }
        });

        lblId.setText("Doctor ID:");

        lblAge.setText("Age:");

        lblGender.setText("Gender:");

        lblDesignation.setText("Designation:");

        lblSpecialization.setText("Specialization:");

        lblHospitalId.setText("Hospital ID:");

        lblHospitalName.setText("Hospital Name:");

        lblAddress.setText("Address:");

        lblPhoneNumber.setText("Contact Number:");

        lblEmailId.setText("Email Address:");

        txtDocID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocIDActionPerformed(evt);
            }
        });

        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });

        txtSpecialization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSpecializationActionPerformed(evt);
            }
        });

        txtGender1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGender1ActionPerformed(evt);
            }
        });

        txtDesignation1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDesignation1ActionPerformed(evt);
            }
        });

        txtHospitalID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHospitalIDActionPerformed(evt);
            }
        });

        txtHospitalName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHospitalNameActionPerformed(evt);
            }
        });

        txtHospitalAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHospitalAddressActionPerformed(evt);
            }
        });

        txtEmailID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailIDActionPerformed(evt);
            }
        });

        txtPhoneNumber1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneNumber1ActionPerformed(evt);
            }
        });

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 288, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblEmailId)
                                    .addComponent(lblPhoneNumber)
                                    .addComponent(lblAddress)
                                    .addComponent(lblHospitalName)
                                    .addComponent(lblHospitalId)
                                    .addComponent(lblSpecialization)
                                    .addComponent(lblDesignation)
                                    .addComponent(lblGender)
                                    .addComponent(lblAge)
                                    .addComponent(lblId)
                                    .addComponent(lblName))
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDocName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDocID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSpecialization, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtGender1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDesignation1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtHospitalID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtHospitalName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtHospitalAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPhoneNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(288, 288, 288))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnSubmit)
                                .addGap(351, 351, 351))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtDocName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblId)
                    .addComponent(txtDocID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAge)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGender)
                    .addComponent(txtGender1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDesignation)
                    .addComponent(txtDesignation1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSpecialization)
                    .addComponent(txtSpecialization, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHospitalId)
                    .addComponent(txtHospitalID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHospitalName)
                    .addComponent(txtHospitalName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAddress)
                    .addComponent(txtHospitalAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPhoneNumber)
                    .addComponent(txtPhoneNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEmailId)
                    .addComponent(txtEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addComponent(btnSubmit)
                .addContainerGap(233, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtDocNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocNameActionPerformed

    private void txtDocIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocIDActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void txtSpecializationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSpecializationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSpecializationActionPerformed

    private void txtGender1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGender1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGender1ActionPerformed

    private void txtDesignation1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDesignation1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDesignation1ActionPerformed

    private void txtHospitalIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHospitalIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHospitalIDActionPerformed

    private void txtHospitalNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHospitalNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHospitalNameActionPerformed

    private void txtHospitalAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHospitalAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHospitalAddressActionPerformed

    private void txtEmailIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailIDActionPerformed

    private void txtPhoneNumber1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneNumber1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneNumber1ActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblDesignation;
    private javax.swing.JLabel lblEmailId;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblHospitalId;
    private javax.swing.JLabel lblHospitalName;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblSpecialization;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtDesignation1;
    private javax.swing.JTextField txtDocID;
    private javax.swing.JTextField txtDocName;
    private javax.swing.JTextField txtEmailID;
    private javax.swing.JTextField txtGender1;
    private javax.swing.JTextField txtHospitalAddress;
    private javax.swing.JTextField txtHospitalID;
    private javax.swing.JTextField txtHospitalName;
    private javax.swing.JTextField txtPhoneNumber1;
    private javax.swing.JTextField txtSpecialization;
    // End of variables declaration//GEN-END:variables
}
