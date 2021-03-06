package com.personalprofile.fahrihfatahilah.dailyActivity;
/*Nama : Fahrih Fatailah
NIM  : 10116405
KELAS : AKB-IF9
Tanggal Pengerjaan : 28 April 2019*/
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.personalprofile.fahrihfatahilah.R;

public class DailyRecyclerViewItemHolder extends RecyclerView.ViewHolder {

    private TextView DailyTitleText = null;

    private ImageView DailyImageView = null;

    public DailyRecyclerViewItemHolder(View itemView) {
        super(itemView);

        if(itemView != null)
        {
            DailyTitleText = (TextView)itemView.findViewById(R.id.card_view_image_title);

            DailyImageView = (ImageView)itemView.findViewById(R.id.card_view_image);
        }
    }

    public TextView getDailyTitleText() {
        return DailyTitleText;
    }

    public ImageView getDailyImageView() {
        return DailyImageView;
    }
}

