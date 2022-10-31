/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package hsmui;

import hsmmodel.Community;
import hsmmodel.CommunityDirectory;
import hsmmodel.Doctor;
import hsmmodel.DoctorDirectory;
import hsmmodel.Patient;
import hsmmodel.PatientDirectory;
import hsmmodel.Person;
import hsmmodel.PersonDirectory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author prathamesh
 */
public class AddPerson extends javax.swing.JPanel {

    PersonDirectory prnDir;
    PatientDirectory ptnDir;
    DoctorDirectory docDir;
    CommunityDirectory cDir;
    
    private boolean isSet = false;
    private ArrayList<Community> cList;
    private HashSet<String> cityList;

    private ArrayList<String> communityNameList;
    private ArrayList<String> houseList;

    private HashMap<String, ArrayList<String>> map;
    private HashMap<String, ArrayList<String>> mapHouse;
    /**
     * Creates new form AddPerson
     */
    public AddPerson(PersonDirectory prnDir, PatientDirectory ptnDir, DoctorDirectory docDir, CommunityDirectory cDir) {
        initComponents();
        this.prnDir = prnDir;
        this.ptnDir = ptnDir;
        this.docDir = docDir;
        this.cDir = cDir;
        
        cityList = new HashSet<>();
        communityNameList = new ArrayList<>();
        houseList = new ArrayList<>();
        map = new HashMap<>();
        mapHouse = new HashMap<>();

        cList = cDir.getommunityDirectory();
        
        for (Community community : cList) {

//            cityList.add(community.getCity());
//            communityNameList.add(community.getCommunityName());
//            houseList.add(community.getHouse().getAddress());
        }

        comboCity.addItem("Select a city");

        for (String city : cityList) {
            comboCity.addItem(city);
           

        }

        setCommunityAllProperties();
    }
    
    
    public void setHouseAllProperties() {

//        for (Community community : cList) {
//
//            ArrayList<String> HouseVal = new ArrayList<>();
//
//            if (communityNameList.contains(community.getCommunityName())) {
//                if (mapHouse.get(community.getCommunityName()) == null) {
//                    HouseVal.add(community.getHouse().getAddress());
//                    mapHouse.put(community.getCommunityName(), HouseVal);
//                } else {
//
//                    mapHouse.get(community.getCommunityName()).add(community.getHouse().getAddress());
//
//                }
//
//            }
//
//        }
    }

    public void setCommunityAllProperties() {
        for (Community community : cList) {

//            ArrayList<String> communityVal = new ArrayList<>();
//
//            if (cityList.contains(community.getCity().getCityName())) {
//                if (map.get(community.getCity().getCityName()) == null) {
//                    communityVal.add(community.getCommunityName());
//                    map.put(community.getCity().getCityName(), communityVal);
//                } else {
//
//                    map.get(community.getCity().getCityName()).add(community.getCommunityName());
//
//                }
//
//            }
//
        }
    }
    
//    private void cityUpdateAction(String selectedCity, String type) {
//
//        if (selectedCity.equals("Boston")) {
//            if (type.equals("new")) {
//                comboCommunity.removeAllItems();
//                comboCommunity.addItem("Huntington Avenue");
//                comboCommunity.addItem("Brookline");
//            } else {
//                communityComboUpdate.removeAllItems();
//                communityComboUpdate.addItem("Huntington Avenue");
//                communityComboUpdate.addItem("Brookline");
//
//            }
//
//        }
//        if (selectedCity.equals("New York")) {
//            if (type.equals("new")) {
//                comboCommunity.removeAllItems();
//                comboCommunity.addItem("Times Square");
//                comboCommunity.addItem("Manhattan");
//
//            } else {
//                communityComboUpdate.removeAllItems();
//                communityComboUpdate.addItem("Times Square");
//                communityComboUpdate.addItem("Manhattan");
//
//            }
//
//        }
//
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddButton = new javax.swing.JButton();
        GenderLabel = new javax.swing.JLabel();
        NameLabel = new javax.swing.JLabel();
        AgeLabel = new javax.swing.JLabel();
        ResetButton = new javax.swing.JButton();
        txtbx_gender = new javax.swing.JComboBox<>();
        txtbx_prname = new javax.swing.JTextField();
        txtbx_prage = new javax.swing.JTextField();
        txtbx_prid = new javax.swing.JTextField();
        txtbx_contact = new javax.swing.JTextField();
        EmailLabel1 = new javax.swing.JLabel();
        ContactLabel = new javax.swing.JLabel();
        EmailLabel = new javax.swing.JLabel();
        NewEmployeeLabel = new javax.swing.JLabel();
        comboCommunity = new javax.swing.JComboBox<>();
        EmailLabel2 = new javax.swing.JLabel();
        comboCity = new javax.swing.JComboBox<>();
        EmailLabel3 = new javax.swing.JLabel();
        txtbx_persontype = new javax.swing.JComboBox<>();

        AddButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        AddButton.setText("ADD");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        GenderLabel.setText("Gender");

        NameLabel.setText("Name");

        AgeLabel.setText("Age");

        ResetButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        ResetButton.setText("Reset");
        ResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButtonActionPerformed(evt);
            }
        });

        txtbx_gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select gender...", "Male", "Female", "Other" }));

        txtbx_prname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbx_prnameKeyReleased(evt);
            }
        });

        txtbx_prid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbx_pridActionPerformed(evt);
            }
        });
        txtbx_prid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbx_pridKeyReleased(evt);
            }
        });

        txtbx_contact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbx_contactKeyReleased(evt);
            }
        });

        EmailLabel1.setText("Person ID");

        ContactLabel.setText("Contact");

        EmailLabel.setText("Community");

        NewEmployeeLabel.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        NewEmployeeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NewEmployeeLabel.setText("Add New Person");

        comboCommunity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Mission Hill", "Roxbury" }));

        EmailLabel2.setText("City");

        comboCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Boston", "New York", "Washington", "Seatle" }));
        comboCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCityActionPerformed(evt);
            }
        });

        EmailLabel3.setText("Person Type");

        txtbx_persontype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select..", "Patient", "Doctor" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addComponent(NewEmployeeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(EmailLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtbx_persontype, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(NameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(9, 9, 9))
                                            .addComponent(GenderLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(AgeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(21, 21, 21)))
                                        .addGap(83, 83, 83))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(EmailLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(39, 39, 39))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ContactLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(EmailLabel)
                                            .addComponent(EmailLabel2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtbx_prid)
                                    .addComponent(txtbx_prname, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtbx_gender, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtbx_prage, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(comboCommunity, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(comboCity, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtbx_contact, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ResetButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(AddButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(306, 306, 306))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(NewEmployeeLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbx_prid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EmailLabel1))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameLabel)
                    .addComponent(txtbx_prname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GenderLabel)
                    .addComponent(txtbx_gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EmailLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EmailLabel2))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AgeLabel)
                    .addComponent(txtbx_prage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ContactLabel)
                    .addComponent(txtbx_contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbx_persontype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EmailLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ResetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(432, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        // TODO add your handling code here:
                Person prsn = prnDir.addNewPerson();
                
                String Name = txtbx_prname.getText();
                String Gender = txtbx_gender.getSelectedItem().toString();
                String city = comboCity.getSelectedItem().toString();
                String community = comboCommunity.getSelectedItem().toString();
                String Age = txtbx_prage.getText();
                String PersonID = txtbx_prid.getText();
                String Contact = txtbx_contact.getText();
                String personType = txtbx_persontype.getSelectedItem().toString();
                boolean valid = validationForFields();
               
                if(valid)
             {
                if(personType == "Patient"){
                        
//                       if(valid)
//                       {
                           Patient ptn = ptnDir.addNewPatient();
                        ptn.setPatiendId(PersonID);
                        ptn.setName(Name);
                        ptn.setGender(Gender);
                        ptn.setAge(Age);
                        ptn.setContact(Contact);
                        JOptionPane.showMessageDialog(this , "Added Person as Patient!");
                     // }
                        
                        
                }else if(personType == "Doctor"){
                       
//                       if(valid)
//                       {
                            Doctor doc = docDir.addNewDoctor();
                        doc.setDocID(PersonID);
                        doc.setDocName(Name);
                        doc.setGender(Gender);
                        doc.setAge(Age);
                        doc.setContact(Contact);
                        JOptionPane.showMessageDialog(this , "Added as Person as Doctor!");
                      //}
                        
                }else{
//                    if(valid)
//                    {
                    prsn.setName(Name);
                    prsn.setPersonID(PersonID);
                    prsn.setGender(Gender);
                    prsn.setAge(Age);
                    prsn.setContact(Contact);
                    prsn.setCommunity(community);
                    prsn.setCity(city);
                     JOptionPane.showMessageDialog(this , "New Person Added!");
                   // }
                
               
                } 
                }
                
//                txtbx_prid.setText("");
//                txtbx_prname.setText("");
//                txtbx_prage.setText("");
//                txtbx_contact.setText("");
//                txtbx_gender.setName("select");
//                comboCommunity.setName("select");
//                comboCity.setName("select");
                
//                prsn.setName(Name);
//                prsn.setPersonID(PersonID);
//                prsn.setGender(Gender);
//                prsn.setAge(Age);
//                prsn.setContact(Contact);
//                prsn.setCommunity(community);
//                prsn.setCity(city);
//                
//                
//                JOptionPane.showMessageDialog(this , "New Person Added!");
//                
//                txtbx_prid.setText("");
//                txtbx_prname.setText("");
//                txtbx_prage.setText("");
//                txtbx_contact.setText("");
//                txtbx_gender.setName("select");
//                txtbx_com.setName("select");
//                txtbx_city.setName("select");
                
                
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
private boolean validationForFields() {
    
                if(txtbx_prname.getText().length()==0)
                {
                     JOptionPane.showMessageDialog(this," Name Can't be blank, please enter Person Name");
                     txtbx_prname.requestFocus();
                     txtbx_prname.setText("");
                     return false;
                }
                
               else{
        if(!txtbx_prname.getText().matches("^[a-zA-Z]+[\\-'\\s]?[a-zA-Z ]+$"))
            {
                 JOptionPane.showMessageDialog(this," Invalid name. ");
                 txtbx_prname.requestFocus();
                 txtbx_prname.setText("");
                 return false;
                
                
            }
          }
                   if(txtbx_prid.getText().isBlank() )
    {
        JOptionPane.showMessageDialog(this," Person ID Can't be blank, please enter Person ID ");
        txtbx_prid.requestFocus();
        txtbx_prid.setText("");
        return false;
    }
        else
        {
            
             if(!txtbx_prid.getText().matches("^[0-9]{0,6}$"))
             {
                JOptionPane.showMessageDialog(this," Invalid Person, Note : Person ID is of 6 digit  ");
                txtbx_prid.requestFocus();
                return false;
                
             }  
        }
                   
           if(txtbx_prage.getText().isBlank() )
    {
        JOptionPane.showMessageDialog(this," Person Age Can't be blank, please enter Age ");
        txtbx_prage.requestFocus();
        txtbx_prage.setText("");
        return false;
    }
        else
        {
            
             if(!txtbx_prage.getText().matches("^[0-9]{0,2}$"))
             {
                JOptionPane.showMessageDialog(this," Employee should be between 0 to 100 years old. ");
                txtbx_prage.requestFocus();
                return false;
                
             }  
        }
           
           if(txtbx_contact.getText().isBlank())
        {
         JOptionPane.showMessageDialog(this," Date cannot be blank, please enter a valid Start Date ");
         txtbx_contact.requestFocus();
         txtbx_contact.setText("");
        return false;
        }
        else
        {
            if(!txtbx_contact.getText().matches("^[2-9]{2}[0-9]{8}$"))
            {
                    JOptionPane.showMessageDialog(this," Invalid Phone Number format, please enter a valid 10 digit US Phone No. ");
                    txtbx_contact.requestFocus();
                    txtbx_contact.setText("");
                   return false;
            }
        }
           
           if(comboCity.getSelectedIndex() == 0)
            {
                    JOptionPane.showMessageDialog(this," Please select a city ");
                    comboCity.requestFocus();
                    //comboCity.setText("");
                   return false;
            }
           
                if(comboCommunity.getSelectedIndex() == 0)
            {
                    JOptionPane.showMessageDialog(this," Please select a Community ");
                    comboCommunity.requestFocus();
                    //comboCity.setText("");
                   return false;
            }
                 if(txtbx_gender.getSelectedIndex() == 0)
            {
                    JOptionPane.showMessageDialog(this," Please select a Gender ");
                    comboCity.requestFocus();
                    //comboCity.setText("");
                   return false;
            }
           
           
                   
                   
                
                return true;
}
 



    private void ResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButtonActionPerformed
        // TODO add your handling code here:
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
        
                txtbx_prid.setText("");
                txtbx_prname.setText("");
                txtbx_prage.setText("");
                txtbx_contact.setText("");
                txtbx_gender.setName("select");
                comboCommunity.setName("select");
                comboCity.setName("select");
    }//GEN-LAST:event_ResetButtonActionPerformed

    private void txtbx_prnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbx_prnameKeyReleased
        // TODO add your handling code here:
        //        String PATTERN = "^[A-Za-z\\\\s]+$";
        //        Pattern pat = Pattern.compile(PATTERN);
        //        Matcher match = pat.matcher(NameTxtBox.getText());
        //        if(!match.matches() || NameTxtBox.getText().equals(""))
        //        {
            //            nLbl.setText("Name is incorrect!");
            //        }
        //        else
        //        {
            //            nLbl.setText("");
            //        }
    }//GEN-LAST:event_txtbx_prnameKeyReleased

    private void txtbx_pridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbx_pridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbx_pridActionPerformed

    private void txtbx_pridKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbx_pridKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbx_pridKeyReleased

    private void txtbx_contactKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbx_contactKeyReleased
        // TODO add your handling code here:
        //        String cellNo = ContactTxtBox.getText();
        //
        //        int length = cellNo.length();
        //        char c = evt.getKeyChar();
        //        if(evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9' ){
            //            if(length < 10)
            //            {
                //                ContactTxtBox.setEditable(true);
                //            }
            //            else
            //            {
                //                ContactLab.setText("Number is incorrect");
                //                ContactTxtBox.setText("");
                //
                //            }
            //        }
    }//GEN-LAST:event_txtbx_contactKeyReleased

    private void comboCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCityActionPerformed
        // TODO add your handling code here:
                for (Map.Entry<String, ArrayList<String>> entry : map.entrySet()) {

            if (comboCity.getSelectedItem() != null) {

                if (comboCity.getSelectedItem().equals(entry.getKey())) {
                    ArrayList<String> list = entry.getValue();
                    comboCommunity.removeAllItems();

                    for (String community : list) {
                        //     comboCommunity.removeAllItems();
                        comboCommunity.addItem(community);
                    }

                }

            }

        }
    }//GEN-LAST:event_comboCityActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JLabel AgeLabel;
    private javax.swing.JLabel ContactLabel;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JLabel EmailLabel1;
    private javax.swing.JLabel EmailLabel2;
    private javax.swing.JLabel EmailLabel3;
    private javax.swing.JLabel GenderLabel;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JLabel NewEmployeeLabel;
    private javax.swing.JButton ResetButton;
    private javax.swing.JComboBox<String> comboCity;
    private javax.swing.JComboBox<String> comboCommunity;
    private javax.swing.JTextField txtbx_contact;
    private javax.swing.JComboBox<String> txtbx_gender;
    private javax.swing.JComboBox<String> txtbx_persontype;
    private javax.swing.JTextField txtbx_prage;
    private javax.swing.JTextField txtbx_prid;
    private javax.swing.JTextField txtbx_prname;
    // End of variables declaration//GEN-END:variables
}