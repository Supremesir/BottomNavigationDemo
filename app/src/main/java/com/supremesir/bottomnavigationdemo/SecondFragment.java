package com.supremesir.bottomnavigationdemo;

import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SearchView;

import com.supremesir.bottomnavigationdemo.databinding.SecondFragmentBinding;

public class SecondFragment extends Fragment {

    private SecondViewModel mViewModel;
    private SecondFragmentBinding binding;

    public static SecondFragment newInstance() {
        return new SecondFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = SecondFragmentBinding.inflate(inflater, container, false);
        return binding.getRoot();
//        return inflater.inflate(R.layout.second_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(requireActivity()).get(SecondViewModel.class);
//        mViewModel = ViewModelProviders.of(this).get(SecondViewModel.class);
        binding.imageView.setScaleX(mViewModel.getScaleFactor());
        binding.imageView.setScaleY(mViewModel.getScaleFactor());
        final ObjectAnimator objectAnimatorX = ObjectAnimator.ofFloat(binding.imageView, "scaleX", 0, 0);
        final ObjectAnimator objectAnimatorY = ObjectAnimator.ofFloat(binding.imageView, "scaleY", 0, 0);
        final AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorX, objectAnimatorY);
        animatorSet.setDuration(500);
        binding.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!animatorSet.isRunning()) {
                    objectAnimatorX.setFloatValues(binding.imageView.getScaleX() + 0.1f);
                    objectAnimatorY.setFloatValues(binding.imageView.getScaleY() + 0.1f);
                    mViewModel.setScaleFactor(mViewModel.getScaleFactor() + 0.1f);
                    animatorSet.start();
                }
            }
        });
    }

}
