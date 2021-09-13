
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author benstacey
 */
public class Customer {
    private String Customer_ID;
    private String Family_Name;
    private String Given_Name;
    private String Birth_Date;
    private int Phone;

    public void setCustomer_ID(String Customer_ID) {
        this.Customer_ID = Customer_ID;
    }

    public void setFamily_Name(String Family_Name) {
        this.Family_Name = Family_Name;
    }

    public void setGiven_Name(String Given_Name) {
        this.Given_Name = Given_Name;
    }

    public void setBirth_Date(String Birth_Date) {
        this.Birth_Date = Birth_Date;
    }

    public void setPhone(int Phone) {
        this.Phone = Phone;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setStreet_Address(String Street_Address) {
        this.Street_Address = Street_Address;
    }

    public void setSuburb(String Suburb) {
        this.Suburb = Suburb;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public void setPostcode(int Postcode) {
        this.Postcode = Postcode;
    }

    public void setPassword_Hash(String Password_Hash) {
        this.Password_Hash = Password_Hash;
    }

    public void setNotes(String Notes) {
        this.Notes = Notes;
    }

    public void setFavourite_Artist(String Favourite_Artist) {
        this.Favourite_Artist = Favourite_Artist;
    }

    public void setFavourite_Genres(String Favourite_Genres) {
        this.Favourite_Genres = Favourite_Genres;
    }

    public void setFavourite_Eras(String Favourite_Eras) {
        this.Favourite_Eras = Favourite_Eras;
    }
    private String Email;
    private String Street_Address;
    private String Suburb;
    private String City;
    private String Country;
    private int Postcode;
    private String Password_Hash;
    private String Notes;
    private String Favourite_Artist;
    private String Favourite_Genres;
    private String Favourite_Eras;

    public String getCustomer_ID() {
        return Customer_ID;
    }

    public String getFamily_Name() {
        return Family_Name;
    }

    public String getGiven_Name() {
        return Given_Name;
    }

    public String getBirth_Date() {
        return Birth_Date;
    }

    public int getPhone() {
        return Phone;
    }

    public String getEmail() {
        return Email;
    }

    public String getStreet_Address() {
        return Street_Address;
    }

    public String getSuburb() {
        return Suburb;
    }

    public String getCity() {
        return City;
    }

    public String getCountry() {
        return Country;
    }

    public int getPostcode() {
        return Postcode;
    }

    public String getPassword_Hash() {
        return Password_Hash;
    }

    public String getNotes() {
        return Notes;
    }

    public String getFavourite_Artist() {
        return Favourite_Artist;
    }

    public String getFavourite_Genres() {
        return Favourite_Genres;
    }

    public String getFavourite_Eras() {
        return Favourite_Eras;
    }
}
