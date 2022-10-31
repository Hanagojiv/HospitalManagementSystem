/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author vivek
 */
public class CommunityDirectory {
    private ArrayList<Community> communityDirectory;
    
    public ArrayList<Community> getommunityDirectory() {
        return communityDirectory;
    }

    public void setommunityDirectory(ArrayList<Community> directory) {
        this.communityDirectory = new ArrayList<Community>();
    }
    
    public CommunityDirectory(){
        this.communityDirectory = new ArrayList();
    }
    
    public Community addNewCommunity() {
    Community prsn = new Community();
        communityDirectory.add(prsn); 
        return prsn;
    }
}
