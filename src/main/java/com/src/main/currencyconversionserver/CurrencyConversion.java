package com.src.main.currencyconversionserver;

public class CurrencyConversion {
    String from;
    String to;
    int qty;
    double conversionRate;
    double total;
    String ipAddress;

    public CurrencyConversion() {
    }

    public CurrencyConversion(String from, String to, int qty, double conversionRate, double total, String ipAddress) {
        this.from = from;
        this.to = to;
        this.qty = qty;
        this.conversionRate = conversionRate;
        this.total = total;
        this.ipAddress = ipAddress;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getConversionRate() {
        return conversionRate;
    }

    public void setConversionRate(double conversionRate) {
        this.conversionRate = conversionRate;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }
}
