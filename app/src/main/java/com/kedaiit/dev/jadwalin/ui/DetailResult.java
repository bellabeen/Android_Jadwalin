package com.kedaiit.dev.jadwalin.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.kedaiit.dev.jadwalin.R;
import com.kedaiit.dev.jadwalin.model.Result;

import java.util.List;

public class DetailResult extends AppCompatActivity {
    TextView strHomeTeam, strAwayTeam,strDate, strTime, strHomeGoalDetails, strHomeRedCards,
            strHomeYellowCards, strAwayGoalsDetail, strAwayRedCards, strAwayYellowCards, intAwayScore, intHomeScore;

    private Context context;
    private List<Result> list;

    public DetailResult(Context context, List<Result> list) {
        this.context = context;
        this.list = list;
    }

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_result);

//        Result result = getIntent().getParcelableExtra(Result);


//        //get inten dari kajian activity
//
////        final Result obj = list.get(position)
////
////        holder.strHomeTeam.setText(obj.getStrHomeTeam());
//        final String strHomeTeam = getIntent().getExtras().getString("strHomeTeam");
//        final String strAwayTeam = getIntent().getExtras().getString("strAwayTeam");
//        final String strDate = getIntent().getExtras().getString("strDate");
//        final String strTime = getIntent().getExtras().getString("strTime");
//        final String strHomeGoalDetails = getIntent().getExtras().getString("strHomeGoalDetails");
//        final String strHomeRedCards = getIntent().getExtras().getString("strHomeRedCards");
//        final String strHomeYellowCards = getIntent().getExtras().getString("strHomeYellowCards");
//        final String strAwayGoalsDetail = getIntent().getExtras().getString("strAwayGoalsDetail");
//        final String strAwayRedCards = getIntent().getExtras().getString("StrAwayRedCards");
//        final String strAwayYellowCards = getIntent().getExtras().getString("strAwayYellowCards");
//        final String intHomeScore = getIntent().getExtras().getString("intHomeScore");
//        final String intAwayScore = getIntent().getExtras().getString("intAwayScore");
//
//
//        //id
////        img_photo = findViewById(R.id.img_item_photo);
//        strHomeTeam = findViewById(R.id.tv_strHomeTeam);
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
//
//        //setText
//        tv_strHomeTeam.setText(strHomeTeam);
//
//
//        //ini load gambar
//
////        Glide.with(this)
////                .load(dtFoto)
//////                .apply(new RequestOptions().override(100, 100))
////                .into(img_photo);

    }
}
