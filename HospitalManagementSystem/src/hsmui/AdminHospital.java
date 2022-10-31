/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package hsmui;

import hsmmodel.Doctor;
import hsmmodel.Hospital;
import hsmmodel.HospitalDirectory;
import hsmmodel.Person;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author prathamesh
 */
public class AdminHospital extends javax.swing.JPanel {

    /**
     * Creates new form AdminHospital
     */
    HospitalDirectory hospDir;
    public AdminHospital(HospitalDirectory hospDir) {
        initComponents();
        this.hospDir = hospDir;
        
        populateTable();
    }

        private void populateTable(){
        
        DefaultTableModel model = (DefaultTableModel) Table.getModel();
        model.setRowCount(0);
        
        for(Hospital hosp : hospDir.getpatientDirectory()){
            
            Object[] row = new Object[4];
            row[0] = hosp;
            row[1] = hosp.getName();
            row[2] = hosp.getCity();
            row[3] = hosp.getCommunity();
            
            model.addRow(row);
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

        txtbx_city = new javax.swing.JTextField();
        txtbx_community = new javax.swing.JTextField();
        GenderLabel = new javax.swing.JLabel();
        NameLabel = new javax.swing.JLabel();
        NameLabel1 = new javax.swing.JLabel();
        txtbx_name = new javax.swing.JTextField();
        txtbx_id = new javax.swing.JTextField();
        btn_view = new javax.swing.JButton();
        NewEmployeeLabel = new javax.swing.JLabel();
        btn_update = new javax.swing.JButton();
        AgeLabel = new javax.swing.JLabel();
        btn_delete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        PersonalInfoLabel = new javax.swing.JLabel();

        GenderLabel.setText("City");

        NameLabel.setText("Hospital ID");

        NameLabel1.setText("Name");

        btn_view.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btn_view.setText("View");
        btn_view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_viewActionPerformed(evt);
            }
        });

        NewEmployeeLabel.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        NewEmployeeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NewEmployeeLabel.setText("Hospital Directory");

        btn_update.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        AgeLabel.setText("Community");

        btn_delete.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btn_delete.setText("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Hospital ID", "Name", "City", "Community"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Table);

        PersonalInfoLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        PersonalInfoLabel.setText("Personal Details");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(PersonalInfoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(116, 116, 116))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AgeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(NameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(GenderLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(41, 41, 41))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(NameLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(30, 30, 30)))
                                        .addGap(2, 2, 2)))
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtbx_id)
                                    .addComponent(txtbx_city)
                                    .addComponent(txtbx_community)
                                    .addComponent(txtbx_name))))
                        .addGap(551, 551, 551))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane1)))
                .addGap(8, 8, 8))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(333, 333, 333)
                        .addComponent(NewEmployeeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(293, 293, 293))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(296, 296, 296)
                        .addComponent(btn_delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_update, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_view, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(NewEmployeeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_view)
                .addGap(52, 52, 52)
                .addComponent(PersonalInfoLabel)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameLabel)
                    .addComponent(txtbx_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameLabel1)
                    .addComponent(txtbx_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GenderLabel)
                    .addComponent(txtbx_city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AgeLabel)
                    .addComponent(txtbx_community, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_update)
                    .addComponent(btn_delete))
                .addContainerGap(327, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_viewActionPerformed
        // TODO add your handling code here:
        int row = Table.getSelectedRow();

        if(row<0){
            JOptionPane.showMessageDialog(this, "Please select a ROW to search ");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) Table.getModel();
        Hospital selectedHospital = (Hospital)model.getValueAt(row, 0);


        txtbx_id.setText(selectedHospital.getHospitalID());
        txtbx_name.setText(selectedHospital.getName());
        txtbx_community.setText(selectedHospital.getCommunity());
        txtbx_city.setText(selectedHospital.getCity());


    }//GEN-LAST:event_btn_viewActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        // TODO add your handling code here:
        int row = Table.getSelectedRow();

        if(row<0){
            JOptionPane.showMessageDialog(this, "Please select a ROW to search ");
            return;
        }
//
        DefaultTableModel model = (DefaultTableModel) Table.getModel();
        Hospital selectedHospital = (Hospital)model.getValueAt(row, 0);
        
        String id = txtbx_id.getText();
        String name = txtbx_name.getText();
        String city = txtbx_city.getText();
        String community = txtbx_community.getText();

        
        selectedHospital.setHospitalID(id);
        selectedHospital.setName(name);
        selectedHospital.setCity(city);
        selectedHospital.setCommunity(community);
        
        
        populateTable();
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        // TODO add your handling code here:
        int row = Table.getSelectedRow();

        if(row<0){
            JOptionPane.showMessageDialog(this, "Please select a ROW to search ");
            return;
        }
//
        DefaultTableModel model = (DefaultTableModel) Table.getModel();
        Hospital selectedHospital = (Hospital)model.getValueAt(row, 0);
        
        hospDir.deleteHospital(selectedHospital);
        
        JOptionPane.showMessageDialog(this, "Hospital Deleted!");
    }//GEN-LAST:event_btn_deleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AgeLabel;
    private javax.swing.JLabel GenderLabel;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JLabel NameLabel1;
    private javax.swing.JLabel NewEmployeeLabel;
    private javax.swing.JLabel PersonalInfoLabel;
    private javax.swing.JTable Table;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_update;
    private javax.swing.JButton btn_view;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtbx_city;
    private javax.swing.JTextField txtbx_community;
    private javax.swing.JTextField txtbx_id;
    private javax.swing.JTextField txtbx_name;
    // End of variables declaration//GEN-END:variables
}