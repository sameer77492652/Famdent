package com.actiknow.famdent.model;

import java.util.ArrayList;

/**
 * Created by l on 27/04/2017.
 */

public class ExhibitorDetail {
    int id;
    boolean favourite;
    ArrayList<String> contactList = new ArrayList<> ();
    String exhibitor_logo, exhibitor_name, hall_number, stall_number, address, email, website, notes;

    public ExhibitorDetail (int id, boolean favourite, ArrayList<String> contactList, String exhibitor_logo, String exhibitor_name, String hall_number, String stall_number, String address, String email, String website, String notes) {
        this.id = id;
        this.favourite = favourite;
        this.contactList = contactList;
        this.exhibitor_logo = exhibitor_logo;
        this.exhibitor_name = exhibitor_name;
        this.hall_number = hall_number;
        this.stall_number = stall_number;
        this.address = address;
        this.email = email;
        this.website = website;
        this.notes = notes;
    }

    public int getId () {
        return id;
    }

    public void setId (int id) {
        this.id = id;
    }

    public boolean isFavourite () {
        return favourite;
    }

    public void setFavourite (boolean favourite) {
        this.favourite = favourite;
    }

    public ArrayList<String> getContactList () {
        return contactList;
    }

    public void setContactList (ArrayList<String> contactList) {
        this.contactList = contactList;
    }

    public String getExhibitor_logo () {
        return exhibitor_logo;
    }

    public void setExhibitor_logo (String exhibitor_logo) {
        this.exhibitor_logo = exhibitor_logo;
    }

    public String getExhibitor_name () {
        return exhibitor_name;
    }

    public void setExhibitor_name (String exhibitor_name) {
        this.exhibitor_name = exhibitor_name;
    }

    public String getHall_number () {
        return hall_number;
    }

    public void setHall_number (String hall_number) {
        this.hall_number = hall_number;
    }

    public String getStall_number () {
        return stall_number;
    }

    public void setStall_number (String stall_number) {
        this.stall_number = stall_number;
    }

    public String getAddress () {
        return address;
    }

    public void setAddress (String address) {
        this.address = address;
    }

    public String getEmail () {
        return email;
    }

    public void setEmail (String email) {
        this.email = email;
    }

    public String getWebsite () {
        return website;
    }

    public void setWebsite (String website) {
        this.website = website;
    }

    public String getNotes () {
        return notes;
    }

    public void setNotes (String notes) {
        this.notes = notes;
    }

    public void setContactInList (String contact) {
        this.contactList.add (contact);
    }
}
