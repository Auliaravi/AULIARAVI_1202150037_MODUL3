package com.tugas6.auliaravi.auliaravi_1202150037_m3;

/**
 * Created by Aulia Ravi on 25/02/2018.
 */

public class water {String title, description, detail;
    int image;

    public water(String title, String description, String detail, int image){
        this.title= title;
        this.description=description;
        this.detail= detail;
        this.image= image;

        //pembuatan method d=water dengan title,description, detail dan image

    }

    public String getTitle() {
        return title;
    }
    //pengambilan title yang telah dibuat

    public String getDescpription() {
        return description;
    }
    //pengambilan description yang telah dibuat

    public String getDetail() {
        return detail;
    }
    //pengambilan detail yang telah dibuat

    public int getImage() {
        return image;
    }
    //pengambilan image yang telah dibuat
}