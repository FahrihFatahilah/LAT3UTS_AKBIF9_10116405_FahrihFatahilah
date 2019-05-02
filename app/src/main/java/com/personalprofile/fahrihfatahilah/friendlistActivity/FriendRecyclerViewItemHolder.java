package com.personalprofile.fahrihfatahilah.friendlistActivity;
/*Nama : Fahrih Fatailah
NIM  : 10116405
KELAS : AKB-IF9
Tanggal Pengerjaan : 29 April 2019*/
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.personalprofile.fahrihfatahilah.R;

public class FriendRecyclerViewItemHolder extends RecyclerView.ViewHolder {

    private TextView FriendTitleText = null;

    private ImageView FriendImageView = null;

    public FriendRecyclerViewItemHolder(View itemView) {
        super(itemView);

        if(itemView != null)
        {
            FriendTitleText = (TextView)itemView.findViewById(R.id.card_view_image_title);

            FriendImageView = (ImageView)itemView.findViewById(R.id.card_view_image);
        }
    }

    public TextView getFriendTitleText() {
        return FriendTitleText;
    }

    public ImageView getFriendImageView() {
        return FriendImageView;
    }
}

