package com.kedaiit.dev.jadwalin.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
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
        holder.intHomeScore.setText(obj.getIntHomeScore());
        holder.intAwayScore.setText(obj.getIntAwayScore());
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailResult.class);
                intent.putExtra("strHomeTeam",obj.getStrHomeTeam());
                intent.putExtra("strHomeGoalDetails",obj.getStrHomeGoalDetails());
                intent.putExtra("strHomeRedCards",obj.getStrHomeRedCards());
                intent.putExtra("strHomeYellowCards",obj.getStrHomeYellowCards());
                intent.putExtra("strAwayTeam", obj.getStrAwayTeam());
                intent.putExtra("strAwayGoalDetails",obj.getStrAwayGoalDetails());
                intent.putExtra("strAwayRedCards",obj.getStrAwayRedCards());
                intent.putExtra("strAwayYellowCards",obj.getStrAwayYellowCards());
                intent.putExtra("strDate",obj.getStrDate());
                intent.putExtra("strTime",obj.getStrTime());
                intent.putExtra("intHomeScore",obj.getIntHomeScore());
                intent.putExtra("intAwayScore",obj.getIntAwayScore());

                context.startActivity(intent);
            }
        });




    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView strHomeTeam, strAwayTeam,strDate, intAwayScore, intHomeScore;
        private LinearLayout linearLayout;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            linearLayout = itemView.findViewById(R.id.linearRl);
            strHomeTeam = itemView.findViewById(R.id.tv_strHomeTeam);
            strAwayTeam = itemView.findViewById(R.id.tv_strAwayTeam);
            strDate = itemView.findViewById(R.id.tv_strDate);
            intAwayScore = itemView.findViewById(R.id.tv_intAwayScore);
            intHomeScore = itemView.findViewById(R.id.tv_intHomeScore);


        }
    }
}
