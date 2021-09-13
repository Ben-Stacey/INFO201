/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author benstacey
 */
public class SaleItem {
    private String Sale_ID;
    private String Store_ID;
    private String Sale_Date_Time;
    private String Customer_ID;
    private int Address_Number;
    private boolean Gift_Wrap;
    private boolean Store_Delivery;
    private int GST;
    private String Status;

    public void setSale_ID(String Sale_ID) {
        this.Sale_ID = Sale_ID;
    }

    public void setStore_ID(String Store_ID) {
        this.Store_ID = Store_ID;
    }

    public void setSale_Date_Time(String Sale_Date_Time) {
        this.Sale_Date_Time = Sale_Date_Time;
    }

    public void setCustomer_ID(String Customer_ID) {
        this.Customer_ID = Customer_ID;
    }

    public void setAddress_Number(int Address_Number) {
        this.Address_Number = Address_Number;
    }

    public void setGift_Wrap(boolean Gift_Wrap) {
        this.Gift_Wrap = Gift_Wrap;
    }

    public void setStore_Delivery(boolean Store_Delivery) {
        this.Store_Delivery = Store_Delivery;
    }

    public void setGST(int GST) {
        this.GST = GST;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getSale_ID() {
        return Sale_ID;
    }

    public String getStore_ID() {
        return Store_ID;
    }

    public String getSale_Date_Time() {
        return Sale_Date_Time;
    }

    public String getCustomer_ID() {
        return Customer_ID;
    }

    public int getAddress_Number() {
        return Address_Number;
    }

    public boolean isGift_Wrap() {
        return Gift_Wrap;
    }

    public boolean isStore_Delivery() {
        return Store_Delivery;
    }

    public int getGST() {
        return GST;
    }

    public String getStatus() {
        return Status;
    }
}
