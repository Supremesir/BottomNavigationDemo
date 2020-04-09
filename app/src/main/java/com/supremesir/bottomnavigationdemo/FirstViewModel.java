package com.supremesir.bottomnavigationdemo;

import androidx.lifecycle.ViewModel;

// 必须为public
public class FirstViewModel extends ViewModel {

    private float rotationPosition = 1;

    float getRotationPosition() {
        return rotationPosition;
    }

    void setRotationPosition(float rotationPosition) {
        this.rotationPosition = rotationPosition;
    }
}
