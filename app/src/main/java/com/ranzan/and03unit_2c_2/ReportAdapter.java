package com.ranzan.and03unit_2c_2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ReportAdapter extends RecyclerView.Adapter<ReportViewHolder> {
    private ArrayList<Report> reportList;
    private OnItemClicked onItemClicked;

    public ReportAdapter(ArrayList<Report> reportList, OnItemClicked onItemClicked) {
        this.onItemClicked = onItemClicked;
        this.reportList = reportList;
    }

    @NonNull
    @Override
    public ReportViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new ReportViewHolder(view, onItemClicked);
    }

    @Override
    public void onBindViewHolder(@NonNull ReportViewHolder holder, int position) {
        Report report = reportList.get(position);
        holder.setData(report);
    }

    @Override
    public int getItemCount() {
        return reportList.size();
    }
}
