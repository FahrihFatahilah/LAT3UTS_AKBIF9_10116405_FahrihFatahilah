package com.personalprofile.fahrihfatahilah.dailyActivity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


import com.personalprofile.fahrihfatahilah.R;
/*Nama : Fahrih Fatailah
NIM  : 10116405
KELAS : AKB-IF9
Tanggal Pengerjaan : 26 April 2019*/


public class DailyActivity_fragment extends Fragment {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    private List<DailyRecyclerViewItem> DailyItemList = null;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dailyactivity, container, false);
        initializeDailyItemList();

        // Create the recyclerview.
        RecyclerView dailyRecyclerView = (RecyclerView)view.findViewById(R.id.card_view_recycler_list);
        // Create the grid layout manager with 2 columns.
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.getActivity(),1);
        // Set layout manager.
        dailyRecyclerView.setLayoutManager(gridLayoutManager);

        // Create car recycler view data adapter with car item list.
        DailyRecyclerViewDataAdapter DailyDataAdapter = new DailyRecyclerViewDataAdapter(DailyItemList);
        // Set data adapter.
        dailyRecyclerView.setAdapter(DailyDataAdapter);
        return view;
    }

    /* Initialise car items in list. */
    private void initializeDailyItemList()
    {
        if(DailyItemList == null)
        {
            DailyItemList = new ArrayList<DailyRecyclerViewItem>();
            DailyItemList.add(new DailyRecyclerViewItem("Sleep", R.drawable.ic_sleep));
            DailyItemList.add(new DailyRecyclerViewItem("Learning\nAndroid Studio", R.drawable.ic_coding));
            DailyItemList.add(new DailyRecyclerViewItem("Making\nTrap Music", R.drawable.ic_makingmusic));
            DailyItemList.add(new DailyRecyclerViewItem("Eat", R.drawable.ic_eat));

        }
    }

    }


