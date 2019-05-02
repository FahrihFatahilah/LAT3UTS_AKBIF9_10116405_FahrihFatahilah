package com.personalprofile.fahrihfatahilah.GalleryActivity;
/*Nama : Fahrih Fatailah
NIM  : 10116405
KELAS : AKB-IF9
Tanggal Pengerjaan : 03 Mei 2019*/
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.personalprofile.fahrihfatahilah.R;

public class GaleryRecyclerViewItemHolder extends RecyclerView.ViewHolder {

    private ImageView GaleryImageView = null;

    public GaleryRecyclerViewItemHolder(View itemView) {
        super(itemView);

        if(itemView != null)
        {
            GaleryImageView = (ImageView)itemView.findViewById(R.id.card_view_image);
        }
    }



    public ImageView getGaleryImageView() {
        return GaleryImageView;
    }
}

