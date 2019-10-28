package com.kedaiit.dev.jadwalin;

public class Upcoming  {
    private String idEvent, strEvent, dateEvent;

    public Upcoming() {}

    public String getIdEvent() {
        return idEvent;
    }

    public void setIdEvent(String idEvent) {
        this.idEvent = idEvent;
    }

    public String getStrEvent() {
        return strEvent;
    }

    public void setStrEvent(String strEvent) {
        this.strEvent = strEvent;
    }

    public String getDateEvent() {
        return dateEvent;
    }

    public void setDateEvent(String dateEvent) {
        this.dateEvent = dateEvent;
    }

    public Upcoming(String idEvent, String strEvent, String dateEvent) {
        this.idEvent = idEvent;
        this.strEvent = strEvent;
        this.dateEvent = dateEvent;
    }


}
