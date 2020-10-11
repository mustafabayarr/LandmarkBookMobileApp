package com.mustafabayar.landmarkbook;

import android.graphics.Bitmap;

public class Singleton {

    private Bitmap chosenImage;
    private static Singleton singleton; //singleton nesnem şu an bu nesne null.

    private Singleton(){

    }
    public Bitmap getChosenImage() {
        return chosenImage;
    }

    public void setChosenImage(Bitmap chosenImage) {
        this.chosenImage = chosenImage;
    }

    public static Singleton getInstance(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
