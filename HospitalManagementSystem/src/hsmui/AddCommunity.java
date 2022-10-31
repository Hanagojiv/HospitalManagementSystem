/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package hsmui;

import hsmmodel.City;
import hsmmodel.Community;
import hsmmodel.CommunityDirectory;
import hsmmodel.House;
import javax.swing.JOptionPane;

/**
 *
 * @author prathamesh
 */
public class AddCommunity extends javax.swing.JPanel {

    /**
     * Creates new form AddCommunity
     */
    
    CommunityDirectory cDir;
    
    public AddCommunity() {
        initComponents();
        this.cDir = cDir;
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
        lblHeader = new javax.swing.JLabel();
        btnSavePerson = new javax.swing.JButton();
        city = new javax.swing.JTextField();
        lblStreetNo = new javax.swing.JLabel();
        com = new javax.swing.JTextField();
        house = new javax.swing.JTextField();
        lblHouseNo = new javax.swing.JLabel();

        jLabel1.setText("Community");

        lblHeader.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblHeader.setText("ADD COMMUNITY");

        btnSavePerson.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnSavePerson.setText("Save");
        btnSavePerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSavePersonActionPerformed(evt);
            }
        });

        lblStreetNo.setText("City");

        lblHouseNo.setText("House");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(285, 285, 285)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblHouseNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(42, 42, 42)
                        .addComponent(house))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblStreetNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(56, 56, 56)
                        .addComponent(city))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(com)
                        .addGap(1, 1, 1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSavePerson, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblHeader)
                                .addGap(12, 12, 12)))))
                .addGap(318, 318, 318))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(com, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStreetNo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(house, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHouseNo))
                .addGap(33, 33, 33)
                .addComponent(btnSavePerson, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(469, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSavePersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSavePersonActionPerformed
        // TODO add your handling code here:
        Community c = new Community();
        
        String Community = com.getText();
        String City = city.getText();
        String House = house.getText();
        
        c.setCity(City);
        c.setCommunity(Community);
        c.setHouse(House);
        
        //Show Message
        JOptionPane.showMessageDialog(this, "Community added successfully!");

        //Show id
        com.setText("");
        city.setText("");
        house.setText("");
    }//GEN-LAST:event_btnSavePersonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSavePerson;
    private javax.swing.JTextField city;
    private javax.swing.JTextField com;
    private javax.swing.JTextField house;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblHouseNo;
    private javax.swing.JLabel lblStreetNo;
    // End of variables declaration//GEN-END:variables
}
