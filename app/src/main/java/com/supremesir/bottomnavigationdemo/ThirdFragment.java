package com.supremesir.bottomnavigationdemo;

import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.animation.ObjectAnimator;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.supremesir.bottomnavigationdemo.databinding.ThirdFragmentBinding;

import java.util.Random;

public class ThirdFragment extends Fragment {

    private ThirdViewModel mViewModel;
    private ThirdFragmentBinding binding;

    public static ThirdFragment newInstance() {
        return new ThirdFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = ThirdFragmentBinding.inflate(inflater, container, false);
        return binding.getRoot();
//        return inflater.inflate(R.layout.third_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(requireActivity()).get(ThirdViewModel.class);
//        mViewModel = ViewModelProviders.of(this).get(ThirdViewModel.class);
        binding.imageView.setX(mViewModel.getDx());
        final ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(binding.imageView, "x", 0, 0);
        objectAnimator.setDuration(500);
        binding.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!objectAnimator.isRunning()) {
                    float dx = new Random().nextBoolean() ? 100 : -100;
                    objectAnimator.setFloatValues(binding.imageView.getX(), binding.imageView.getX() + dx);
                    mViewModel.setDx(mViewModel.getDx() + dx);
                    objectAnimator.start();
                }
            }
        });
    }

}
