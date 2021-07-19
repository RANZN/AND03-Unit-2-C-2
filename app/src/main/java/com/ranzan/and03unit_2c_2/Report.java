package com.ranzan.and03unit_2c_2;

public class Report {
    private String date;
    private int positive;
    private int negative;
    private int hospitalizedCurrently;
    private int onVentilatorCurrently;
    private int death;
    private String dateChecked;

    public Report(String date, int positive, int negative, int hospitalizedCurrently,
                  int onVentilatorCurrently, int death, String dateChecked) {
        this.date = date;
        this.positive = positive;
        this.negative = negative;
        this.hospitalizedCurrently = hospitalizedCurrently;
        this.onVentilatorCurrently = onVentilatorCurrently;
        this.death = death;
        this.dateChecked = dateChecked;
    }

    public String getDate() {
        return date;
    }

    public int getPositive() {
        return positive;
    }

    public int getNegative() {
        return negative;
    }

    public int getHospitalizedCurrently() {
        return hospitalizedCurrently;
    }

    public int getOnVentilatorCurrently() {
        return onVentilatorCurrently;
    }

    public int getDeath() {
        return death;
    }

    public String getDateChecked() {
        return dateChecked;
    }
}