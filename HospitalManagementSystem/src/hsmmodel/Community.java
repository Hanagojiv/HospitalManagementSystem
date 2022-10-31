/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hsmmodel;

/**
 *
 * @author prathamesh
 */
public class Community {

    public Community() {
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getCommunity() {
        return Community;
    }

    public void setCommunity(String Community) {
        this.Community = Community;
    }

    public String getHouse() {
        return House;
    }

    public void setHouse(String House) {
        this.House = House;
    }

    private String City;

    @Override
    public String toString() {
        return City;
    }
    private String Community;
    private String House;
}
