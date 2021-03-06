package com.piiamiia.testspring.bills;

public class Bills {

    private String date;
    private String period;
    private String currency;
    private String total;

    public Bills(String date, String period, String currency, String total) {
        this.date = date;
        this.period = period;
        this.currency = currency;
        this.total = total;
    }

    public String getDate() {
        return date;
    }

    public String getPeriod() {
        return period;
    }

    public String getCurrency() {
        return currency;
    }

    public String getTotal() {
        return total;
    }
}
