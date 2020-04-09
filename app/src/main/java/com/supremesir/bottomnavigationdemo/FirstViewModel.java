package com.supremesir.bottomnavigationdemo;

import androidx.lifecycle.ViewModel;

public class FirstViewModel extends ViewModel {

    private float rotationPosition = 0;

    public float getRotationPosition() {
        return rotationPosition;
    }

    public void setRotationPosition(float rotationPosition) {
        this.rotationPosition = rotationPosition;
    }
}
