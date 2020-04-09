package com.supremesir.bottomnavigationdemo;

import androidx.lifecycle.ViewModel;

public class SecondViewModel extends ViewModel {

    private float scaleFactor = 1;

    public float getScaleFactor() {
        return scaleFactor;
    }

    public void setScaleFactor(float scaleFactor) {
        this.scaleFactor = scaleFactor;
    }


}
