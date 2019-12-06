package com.kedaiit.dev.jadwalin.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.kedaiit.dev.jadwalin.R;
import com.kedaiit.dev.jadwalin.model.Result;

import org.w3c.dom.Text;

import java.util.List;

public class DetailResult extends AppCompatActivity {
    TextView strHomeTeam, strAwayTeam,strDate, strTime, strHomeGoalDetails, strHomeRedCards,
            strHomeYellowCards, strAwayGoalsDetail, strAwayRedCards, strAwayYellowCards, intAwayScore, intHomeScore;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_result);
//
//        holder.strHomeTeam.setText(obj.getStrHomeTeam());
        final String strHomeTeam = getIntent().getExtras().getString("strHomeTeam");
        final String strAwayTeam = getIntent().getExtras().getString("strAwayTeam");
        final String strDate = getIntent().getExtras().getString("strDate");
        final String strTime = getIntent().getExtras().getString("strTime");
        final String strHomeGoalDetails = getIntent().getExtras().getString("strHomeGoalDetails");
        final String strHomeRedCards = getIntent().getExtras().getString("strHomeRedCards");
        final String strHomeYellowCards = getIntent().getExtras().getString("strHomeYellowCards");
        final String strAwayGoalDetail = getIntent().getExtras().getString("strAwayGoalDetail");
        final String strAwayRedCards = getIntent().getExtras().getString("strAwayRedCards");
        final String strAwayYellowCards = getIntent().getExtras().getString("strAwayYellowCards");
        final String intAwayScore = getIntent().getExtras().getString("intAwayScore");
        final String intHomeScore = getIntent().getExtras().getString("intHomeScore");


        //id
//        img_photo = findViewById(R.id.img_item_photo);
        TextView HomeTeam = findViewById(R.id.tv_strHomeTeam);
        TextView AwayTeam = findViewById(R.id.tv_strAwayTeam);
        TextView Date = findViewById(R.id.tv_strDate);
        TextView Time = findViewById(R.id.tv_strTime);
        TextView HomeGoalDetails = findViewById(R.id.tv_strHomeGoalDetails);
        TextView HomeRedCards = findViewById(R.id.tv_strHomeRedCards);
        TextView HomeYellowCards = findViewById(R.id.tv_strHomeYellowCards);
        TextView AwayGoalDetails = findViewById(R.id.tv_strAwayGoalDetails);
        TextView AwayRedCards = findViewById(R.id.tv_strAwayRedCards);
        TextView AwayYellowCars = findViewById(R.id.tv_strAwayYellowCards);
        TextView AwayScore = findViewById(R.id.tv_intAwayScore);
        TextView HomeScore = findViewById(R.id.tv_intHomeScore);


//        strAwayTeam = itemView.findViewById(R.id.tv_strAwayTeam);
//        strDate = itemView.findViewById(R.id.tv_strDate);
//        strTime = itemView.findViewById(R.id.tv_strTime);
//        strHomeGoalDetails = itemView.findViewById(R.id.tv_strHomeGoalDetails);
//        strHomeRedCards = itemView.findViewById(R.id.tv_strHomeRedCards);
//        strHomeYellowCards = itemView.findViewById(R.id.tv_strHomeYellowCards);
//        strAwayGoalsDetail = itemView.findViewById(R.id.tv_strAwayGoalDetails);
//        strAwayRedCards = itemView.findViewById(R.id.tv_strAwayRedCards);
//        strAwayYellowCards = itemView.findViewById(R.id.tv_strAwayYellowCards);
//
//        intAwayScore = itemView.findViewById(R.id.tv_intAwayScore);
//        intHomeScore = itemView.findViewById(R.id.tv_intHomeScore);

        //setText
        HomeTeam.setText(strHomeTeam);
        AwayTeam.setText(strAwayTeam);
        Date.setText(strDate);
        Time.setText(strTime);
        HomeGoalDetails.setText(strHomeGoalDetails);
        HomeRedCards.setText(strHomeRedCards);
        HomeYellowCards.setText(strHomeYellowCards);
        AwayGoalDetails.setText(strAwayGoalDetail);
        AwayRedCards.setText(strAwayRedCards);
        AwayYellowCars.setText(strAwayYellowCards);
        AwayScore.setText(intAwayScore);
        HomeScore.setText(intHomeScore);

        //ini load gambar

//        Glide.with(this)
//                .load(dtFoto)
////                .apply(new RequestOptions().override(100, 100))
//                .into(img_photo);

    }
}
