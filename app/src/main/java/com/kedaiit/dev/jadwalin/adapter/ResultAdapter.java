package com.kedaiit.dev.jadwalin.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.kedaiit.dev.jadwalin.R;
import com.kedaiit.dev.jadwalin.model.Result;
import com.kedaiit.dev.jadwalin.ui.DetailResult;

import java.util.List;

public class ResultAdapter extends RecyclerView.Adapter<ResultAdapter.ViewHolder> {
    private Context context;
    private List<Result> list;

    public ResultAdapter(Context context, List<Result> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_result, parent, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Result obj = list.get(position);

        holder.strHomeTeam.setText(obj.getStrHomeTeam());
        holder.strAwayTeam.setText(obj.getStrAwayTeam());
        holder.strDate.setText(obj.getStrDate());
        holder.strTime.setText(obj.getStrTime());
        holder.strHomeGoalDetails.setText(obj.getStrHomeGoalDetails());
        holder.strHomeRedCards.setText(obj.getStrHomeRedCards());
        holder.strHomeYellowCards.setText(obj.getStrHomeYellowCards());
        holder.strAwayGoalsDetail.setText(obj.getStrAwayGoalDetails());
        holder.strAwayRedCards.setText(obj.getStrAwayRedCards());
        holder.strAwayYellowCards.setText(obj.getStrAwayYellowCards());
        holder.intHomeScore.setText(obj.getIntHomeScore());
        holder.intAwayScore.setText(obj.getIntAwayScore());


//        ViewHolder.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(context, DetailResult.class);
//                intent.putExtra("strHomeTeam",strHomeTeam);
//                intent.putExtra("strAwayTeam", strAwayTeam);
//                intent.putExtra("strDate", strDate);
//                intent.putExtra("strTime", strTime);
//                intent.putExtra("strHomeGoalDetails", strHomeGoalDetails);
//                intent.putExtra("strHomeRedCards", strHomeRedCards);
//                intent.putExtra("strHomeYellowCards", strHomeYellowCards);
//                intent.putExtra("strAwayGoalsDetail", strAwayGoalsDetail);
//                intent.putExtra("strAwayRedCards", strAwayRedCards);
//                intent.putExtra("strAwayYellowCards", strAwayYellowCards);
//                intent.putExtra("intHomeScore", intHomeScore);
//                intent.putExtra("intAwayScore", intAwayScore);
//                context.startActivity(intent);
//
//            }
//        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView strHomeTeam, strAwayTeam,strDate, strTime, strHomeGoalDetails, strHomeRedCards,
                strHomeYellowCards, strAwayGoalsDetail, strAwayRedCards, strAwayYellowCards, intAwayScore, intHomeScore;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            strHomeTeam = itemView.findViewById(R.id.tv_strHomeTeam);
            strAwayTeam = itemView.findViewById(R.id.tv_strAwayTeam);
            strDate = itemView.findViewById(R.id.tv_strDate);
            strTime = itemView.findViewById(R.id.tv_strTime);
            strHomeGoalDetails = itemView.findViewById(R.id.tv_strHomeGoalDetails);
            strHomeRedCards = itemView.findViewById(R.id.tv_strHomeRedCards);
            strHomeYellowCards = itemView.findViewById(R.id.tv_strHomeYellowCards);
            strAwayGoalsDetail = itemView.findViewById(R.id.tv_strAwayGoalDetails);
            strAwayRedCards = itemView.findViewById(R.id.tv_strAwayRedCards);
            strAwayYellowCards = itemView.findViewById(R.id.tv_strAwayYellowCards);

            intAwayScore = itemView.findViewById(R.id.tv_intAwayScore);
            intHomeScore = itemView.findViewById(R.id.tv_intHomeScore);
        }
    }
}
