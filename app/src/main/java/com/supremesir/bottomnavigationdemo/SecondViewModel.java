package com.supremesir.bottomnavigationdemo;

import androidx.lifecycle.ViewModel;

public class SecondViewModel extends ViewModel {

    private float scaleFactor = 1;

    float getScaleFactor() {
        return scaleFactor;
    }

    void setScaleFactor(float scaleFactor) {
        this.scaleFactor = scaleFactor;
    }


}
