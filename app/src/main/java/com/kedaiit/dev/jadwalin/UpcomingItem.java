package com.kedaiit.dev.jadwalin;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public class UpcomingItem implements Parcelable {
    String idEvent, strEvent, dateEvent;

    public UpcomingItem(String idEvent, String strEvent, String dateEvent ) {
        this.idEvent = idEvent;
        this.strEvent = strEvent;
        this.dateEvent = dateEvent;
    }

    public String getidEvent() {
        return idEvent;
    }

    public String getstrEvent() {
        return strEvent;
    }

    public String getdateEvent() {
        return dateEvent;
    }

    public void setIdEvent(String idEvent) {
        this.idEvent = idEvent;
    }

    public void setStrEvent(String strEvent) {
        this.strEvent = strEvent;
    }

    public void setDateEvent(String dateEvent) {
        this.dateEvent = dateEvent;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.idEvent);
        parcel.writeString(this.strEvent);
        parcel.writeString(this.dateEvent);
    }

    public UpcomingItem(){
    }

    protected UpcomingItem(Parcel in ){
        this.idEvent = in.readString();
        this.strEvent = in.readString();
        this.dateEvent = in.readString();
    }

    public static final Parcelable.Creator<UpcomingItem> CREATOR = new Parcelable.Creator<UpcomingItem>(){

        @Override
        public UpcomingItem createFromParcel(Parcel source) {
            return new UpcomingItem(source);
        }

        @Override
        public UpcomingItem[] newArray(int size) {
            return new UpcomingItem[size];
        }
    };

}
