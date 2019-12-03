package com.kedaiit.dev.jadwalin.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Detail implements Parcelable {

    private String strHomeTeam;

    public String getStrHomeTeam() {
        return strHomeTeam;
    }

    public void setStrHomeTeam(String strHomeTeam) {
        this.strHomeTeam = strHomeTeam;
    }

    public String getStrAwayTeam() {
        return strAwayTeam;
    }

    public void setStrAwayTeam(String strAwayTeam) {
        this.strAwayTeam = strAwayTeam;
    }

    public String getStrEvent() {
        return strEvent;
    }

    public void setStrEvent(String strEvent) {
        this.strEvent = strEvent;
    }

    public String getStrDate() {
        return strDate;
    }

    public void setStrDate(String strDate) {
        this.strDate = strDate;
    }

    public String getStrTime() {
        return strTime;
    }

    public void setStrTime(String strTime) {
        this.strTime = strTime;
    }

    public String getStrHomeGoalDetails() {
        return strHomeGoalDetails;
    }

    public void setStrHomeGoalDetails(String strHomeGoalDetails) {
        this.strHomeGoalDetails = strHomeGoalDetails;
    }

    public String getStrHomeRedCards() {
        return strHomeRedCards;
    }

    public void setStrHomeRedCards(String strHomeRedCards) {
        this.strHomeRedCards = strHomeRedCards;
    }

    public String getStrHomeYellowCards() {
        return strHomeYellowCards;
    }

    public void setStrHomeYellowCards(String strHomeYellowCards) {
        this.strHomeYellowCards = strHomeYellowCards;
    }

    public String getStrAwayGoalDetails() {
        return strAwayGoalDetails;
    }

    public void setStrAwayGoalDetails(String strAwayGoalDetails) {
        this.strAwayGoalDetails = strAwayGoalDetails;
    }

    public String getStrAwayRedCards() {
        return strAwayRedCards;
    }

    public void setStrAwayRedCards(String strAwayRedCards) {
        this.strAwayRedCards = strAwayRedCards;
    }

    public String getStrAwayYellowCards() {
        return strAwayYellowCards;
    }

    public void setStrAwayYellowCards(String strAwayYellowCards) {
        this.strAwayYellowCards = strAwayYellowCards;
    }

    public String getIntHomeScore() {
        return intHomeScore;
    }

    public void setIntHomeScore(String intHomeScore) {
        this.intHomeScore = intHomeScore;
    }

    public String getIntAwayScore() {
        return intAwayScore;
    }

    public void setIntAwayScore(String intAwayScore) {
        this.intAwayScore = intAwayScore;
    }

    public static Creator<Detail> getCREATOR() {
        return CREATOR;
    }

    private String strAwayTeam;
    private String strEvent;
    private String strDate;
    private String strTime;
    private String strHomeGoalDetails;
    private String strHomeRedCards;
    private String strHomeYellowCards;
    private String strAwayGoalDetails;
    private String strAwayRedCards;
    private String strAwayYellowCards;
    private String intHomeScore;
    private String intAwayScore;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.strHomeTeam);
        dest.writeString(this.strAwayTeam);
        dest.writeString(this.strEvent);
        dest.writeString(this.strDate);
        dest.writeString(this.strTime);
        dest.writeString(this.strHomeGoalDetails);
        dest.writeString(this.strHomeRedCards);
        dest.writeString(this.strHomeYellowCards);
        dest.writeString(this.strAwayGoalDetails);
        dest.writeString(this.strAwayRedCards);
        dest.writeString(this.strAwayYellowCards);
        dest.writeString(this.intHomeScore);
        dest.writeString(this.intAwayScore);
    }

    public Detail() {
    }

    protected Detail(Parcel in) {
        this.strHomeTeam = in.readString();
        this.strAwayTeam = in.readString();
        this.strEvent = in.readString();
        this.strDate = in.readString();
        this.strTime = in.readString();
        this.strHomeGoalDetails = in.readString();
        this.strHomeRedCards = in.readString();
        this.strHomeYellowCards = in.readString();
        this.strAwayGoalDetails = in.readString();
        this.strAwayRedCards = in.readString();
        this.strAwayYellowCards = in.readString();
        this.intHomeScore = in.readString();
        this.intAwayScore = in.readString();
    }

    public static final Creator<Detail> CREATOR = new Creator<Detail>() {
        @Override
        public Detail createFromParcel(Parcel source) {
            return new Detail(source);
        }

        @Override
        public Detail[] newArray(int size) {
            return new Detail[size];
        }
    };
}
