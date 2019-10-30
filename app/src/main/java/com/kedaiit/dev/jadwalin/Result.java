package com.kedaiit.dev.jadwalin;

public class Result {

    private String strHomeTeam;
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



    public Result() {}


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

//    public Integer getIntHomeScore() {
//        return intHomeScore;
//    }
//
//    public void setIntHomeScore(Integer intHomeScore) {
//        this.intHomeScore = intHomeScore;
//    }
//
//    public Integer getIntAwayScore() {
//        return intAwayScore;
//    }
//
//    public void setIntAwayScore(Integer intAwayScore) {
//        this.intAwayScore = intAwayScore;
//    }

    public Result(String strHomeTeam, String strAwayTeam, String strEvent, String strDate, String strTime, String strHomeGoalDetails,
                  String strHomeRedCards, String strHomeYellowCards, String strAwayGoalDetails, String strAwayRedCards, String strAwayYellowCards, String intHomeScore, String intAwayScore) {
        this.strHomeTeam = strHomeTeam;
        this.strAwayTeam = strAwayTeam;
        this.strEvent = strEvent;
        this.strDate = strDate;
        this.strTime = strTime;
        this.strHomeGoalDetails = strHomeGoalDetails;
        this.strHomeRedCards = strHomeRedCards;
        this.strHomeYellowCards = strHomeYellowCards;
        this.strAwayGoalDetails = strAwayGoalDetails;
        this.strAwayRedCards = strAwayRedCards;
        this.strAwayYellowCards = strAwayYellowCards;
        this.intHomeScore = intHomeScore;
        this.intAwayScore = intAwayScore;
    }

}
