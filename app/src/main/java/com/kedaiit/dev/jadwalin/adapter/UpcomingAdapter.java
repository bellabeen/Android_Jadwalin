package com.kedaiit.dev.jadwalin.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.kedaiit.dev.jadwalin.R;
import com.kedaiit.dev.jadwalin.model.Upcoming;

import java.util.List;

public class UpcomingAdapter extends RecyclerView.Adapter<UpcomingAdapter.ViewHolder> {
    private Context context;
    private List<Upcoming> list;

    public UpcomingAdapter(Context context, List<Upcoming> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_upcoming, parent, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Upcoming obj = list.get(position);

        holder.idEvent.setText(obj.getIdEvent());
        holder.strEvent.setText(obj.getStrEvent());
        holder.dateEvent.setText(obj.getDateEvent());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView idEvent, strEvent, dateEvent;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            idEvent = itemView.findViewById(R.id.idEvent);
            strEvent = itemView.findViewById(R.id.strEvent);
            dateEvent = itemView.findViewById(R.id.dateEvent);
        }
    }
}
