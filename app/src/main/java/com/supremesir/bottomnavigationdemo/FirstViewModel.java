package com.supremesir.bottomnavigationdemo;

import androidx.lifecycle.ViewModel;

class FirstViewModel extends ViewModel {

    private float rotationPosition = 0;

    float getRotationPosition() {
        return rotationPosition;
    }

    void setRotationPosition(float rotationPosition) {
        this.rotationPosition = rotationPosition;
    }
}
