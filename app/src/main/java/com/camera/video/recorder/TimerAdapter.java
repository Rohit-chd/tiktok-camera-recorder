package com.camera.video.recorder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TimerAdapter extends RecyclerView.Adapter<TimerAdapter.CustomViewHolder> {
    private List<Integer> timerList;
    private LayoutInflater inflater;
    private View view;


    public TimerAdapter(Context context, List<Integer> timerList) {
        this.timerList = timerList;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        view = inflater.inflate(R.layout.timer_list, parent, false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {
        holder.mTimerText.setText(timerList.get(position)+"s");

    }

    @Override
    public int getItemCount() {
        return timerList.size();
    }


    public class CustomViewHolder extends RecyclerView.ViewHolder {
        public TextView mTimerText;

        public CustomViewHolder(View itemView) {
            super(itemView);
            mTimerText = itemView.findViewById(R.id.timer_text);
        }
    }
}
