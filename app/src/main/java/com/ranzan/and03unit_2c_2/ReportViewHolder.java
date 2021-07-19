package com.ranzan.and03unit_2c_2;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ReportViewHolder extends RecyclerView.ViewHolder {
    private TextView date;
    private TextView positive;
    private TextView negative;
    private TextView hospitalizedCurrently;
    private TextView onVentilatorCurrently;
    private TextView death;
    private TextView dateCheckIn;
    private OnItemClicked onItemClicked;

    public ReportViewHolder(@NonNull View itemView, OnItemClicked onItemClicked) {
        super(itemView);
        this.onItemClicked = onItemClicked;
        initViews(itemView);
    }

    private void initViews(View itemView) {
        date = itemView.findViewById(R.id.apiDate);
        positive = itemView.findViewById(R.id.apiPositive);
        negative = itemView.findViewById(R.id.apiNegative);
        hospitalizedCurrently = itemView.findViewById(R.id.apionVentilatorCurrently);
        onVentilatorCurrently = itemView.findViewById(R.id.apionVentilatorCurrently);
        death = itemView.findViewById(R.id.apiDeath);
        dateCheckIn = itemView.findViewById(R.id.apiDeath);
    }

    protected void setData(Report report) {
        date.setText(report.getDate());
        positive.setText(report.getPositive());
        negative.setText(report.getNegative());
        hospitalizedCurrently.setText(report.getHospitalizedCurrently());
        onVentilatorCurrently.setText(report.getOnVentilatorCurrently());
        death.setText(report.getDeath());
        dateCheckIn.setText(report.getDateChecked());
    }
}
