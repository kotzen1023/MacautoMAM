package com.macauto.macautomam.data;



public class HistoryItem {
    private String customer;
    private String edi_type;
    private String interchange_ctrl_id;
    private String date;
    private boolean read_sp;

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getEdi_type() {
        return edi_type;
    }

    public void setEdi_type(String edi_type) {
        this.edi_type = edi_type;
    }

    public String getInterchange_ctrl_id() {
        return interchange_ctrl_id;
    }

    public void setInterchange_ctrl_id(String interchange_ctrl_id) {
        this.interchange_ctrl_id = interchange_ctrl_id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isRead_sp() {
        return read_sp;
    }

    public void setRead_sp(boolean read_sp) {
        this.read_sp = read_sp;
    }
}
