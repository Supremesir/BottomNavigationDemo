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
    }

}
