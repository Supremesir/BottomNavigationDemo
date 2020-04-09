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

import com.supremesir.bottomnavigationdemo.databinding.FirstFragmentBinding;

public class FirstFragment extends Fragment {

    private FirstViewModel mViewModel;
    private FirstFragmentBinding binding;

    public static FirstFragment newInstance() {
        return new FirstFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = FirstFragmentBinding.inflate(inflater, container, false);
        return binding.getRoot();
//        return inflater.inflate(R.layout.first_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(requireActivity()).get(FirstViewModel.class);
        final ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(binding.imageView, "rotation", 0, 0);
        objectAnimator.setDuration(500);
        binding.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                objectAnimator.setFloatValues(binding.imageView.getRotation(), binding.imageView.getRotation() + 90);
                objectAnimator.start();
            }
        });
//        mViewModel = ViewModelProviders.of(this).get(FirstViewModel.class);
    }

}
