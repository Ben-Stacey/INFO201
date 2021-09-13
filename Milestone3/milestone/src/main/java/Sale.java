/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author benstacey
 */
public class Sale {
    private String Sale_ID;
    private String Store_ID;
    private String ISRC;
    private String Format;
    private String Condition;
    private int Sale_Price;
    private int Quantity;

    public void setSale_ID(String Sale_ID) {
        this.Sale_ID = Sale_ID;
    }

    public void setStore_ID(String Store_ID) {
        this.Store_ID = Store_ID;
    }

    public void setISRC(String ISRC) {
        this.ISRC = ISRC;
    }

    public void setFormat(String Format) {
        this.Format = Format;
    }

    public void setCondition(String Condition) {
        this.Condition = Condition;
    }

    public void setSale_Price(int Sale_Price) {
        this.Sale_Price = Sale_Price;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public String getSale_ID() {
        return Sale_ID;
    }

    public String getStore_ID() {
        return Store_ID;
    }

    public String getISRC() {
        return ISRC;
    }

    public String getFormat() {
        return Format;
    }

    public String getCondition() {
        return Condition;
    }

    public int getSale_Price() {
        return Sale_Price;
    }

    public int getQuantity() {
        return Quantity;
    }
}
