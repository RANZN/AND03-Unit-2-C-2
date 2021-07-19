package com.ranzan.and03unit_2c_2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HomeScreenActivity extends AppCompatActivity implements OnItemClicked {
    private RecyclerView recyclerView;
    private ArrayList<Report> reportList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        recyclerView = findViewById(R.id.recyclerView);
        buildData();
        setRecyclerView();
    }

    private void setRecyclerView() {
        LinearLayoutManager linearLayout = new LinearLayoutManager(this);
        ReportAdapter reportAdapter = new ReportAdapter(reportList, this);
        recyclerView.setLayoutManager(linearLayout);
        recyclerView.setAdapter(reportAdapter);
    }

    private void buildData() {
    }

    @Override
    public void onItemClick(Report report, int position) {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}