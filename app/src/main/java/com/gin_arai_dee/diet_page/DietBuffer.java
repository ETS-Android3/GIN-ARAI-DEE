package com.gin_arai_dee.diet_page;

public class DietBuffer {
    private String time;
    private int iD;

    public DietBuffer(String time, int iD) {
        this.time = time;
        this.iD = iD;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }
}