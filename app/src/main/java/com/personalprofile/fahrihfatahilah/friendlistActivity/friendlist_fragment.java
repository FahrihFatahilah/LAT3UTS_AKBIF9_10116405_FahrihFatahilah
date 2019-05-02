package com.personalprofile.fahrihfatahilah.friendlistActivity;
/*Nama : Fahrih Fatailah
NIM  : 10116405
KELAS : AKB-IF9
Tanggal Pengerjaan : 26 April 2019*/
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.personalprofile.fahrihfatahilah.R;
import com.personalprofile.fahrihfatahilah.dailyActivity.DailyRecyclerViewDataAdapter;
import com.personalprofile.fahrihfatahilah.dailyActivity.DailyRecyclerViewItem;

import java.util.ArrayList;
import java.util.List;

public class friendlist_fragment extends Fragment {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    private List<FriendRecyclerViewItem> FriendItemList = null;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_dailyactivity, container, false);
        initializeDailyItemList();

        // Create the recyclerview.
        RecyclerView dailyRecyclerView = (RecyclerView)view.findViewById(R.id.card_view_recycler_list);
        // Create the grid layout manager with 2 columns.
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.getActivity(),2);
        // Set layout manager.
        dailyRecyclerView.setLayoutManager(gridLayoutManager);

        // Create car recycler view data adapter with car item list.
        FriendRecyclerViewDataAdapter FriendDataAdapter = new FriendRecyclerViewDataAdapter(FriendItemList);
        // Set data adapter.
        dailyRecyclerView.setAdapter(FriendDataAdapter);
        return view;
    }
    private void initializeDailyItemList()
    {
        if(FriendItemList == null)
        {
            FriendItemList = new ArrayList<FriendRecyclerViewItem>();
            FriendItemList.add(new FriendRecyclerViewItem("Kiki", R.drawable.kiki));
            FriendItemList.add(new FriendRecyclerViewItem("Gilang", R.drawable.gilang));
            FriendItemList.add(new FriendRecyclerViewItem("Riyan", R.drawable.riyan));
            FriendItemList.add(new FriendRecyclerViewItem("Jen", R.drawable.jen));
            FriendItemList.add(new FriendRecyclerViewItem("William", R.drawable.willi));

        }
    }

}
