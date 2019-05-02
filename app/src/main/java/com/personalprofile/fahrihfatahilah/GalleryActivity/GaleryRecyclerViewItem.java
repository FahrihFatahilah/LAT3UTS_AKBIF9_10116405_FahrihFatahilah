package com.personalprofile.fahrihfatahilah.GalleryActivity;
/*Nama : Fahrih Fatailah
NIM  : 10116405
KELAS : AKB-IF9
Tanggal Pengerjaan : 03 Mei 2019*/
public class GaleryRecyclerViewItem {

    // Save car image resource id.
    private int GaleryImageId;

    public GaleryRecyclerViewItem(int GaleryImageId) {
            this.GaleryImageId = GaleryImageId;
    }


    public int getGaleryImageId() {
        return GaleryImageId;
    }

    public void setGaleryImageId(int GaleryImageId) {
        this.GaleryImageId = GaleryImageId;
    }
}