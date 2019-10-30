package com.kedaiit.dev.jadwalin;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

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
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView strHomeTeam, strAwayTeam,strDate, intHomeScore, intAwayScore;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            strHomeTeam = itemView.findViewById(R.id.tv_strHomeTeam);
            strAwayTeam = itemView.findViewById(R.id.tv_strAwayTeam);
            strDate = itemView.findViewById(R.id.tv_strDate);
            intAwayScore = itemView.findViewById(R.id.tv_intAwayScore);
            intHomeScore = itemView.findViewById(R.id.tv_intHomeScore);
        }
    }
}
