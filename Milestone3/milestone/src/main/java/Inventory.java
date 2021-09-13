/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author benstacey
 */
public class Inventory {
    private String Store_ID;
    private String ISRC;
    private String Format;
    private String Condition;
    private int Unit_Price;
    private int Stock_Quantity;

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

    public void setUnit_Price(int Unit_Price) {
        this.Unit_Price = Unit_Price;
    }

    public void setStock_Quantity(int Stock_Quantity) {
        this.Stock_Quantity = Stock_Quantity;
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

    public int getUnit_Price() {
        return Unit_Price;
    }

    public int getStock_Quantity() {
        return Stock_Quantity;
    }
}
