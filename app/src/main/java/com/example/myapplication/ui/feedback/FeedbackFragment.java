package com.example.myapplication.ui.feedback;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


import com.example.myapplication.databinding.FragmentFeedbackkBinding;
import com.example.myapplication.R;

public class FeedbackFragment extends Fragment {

    private FeedbackViewModel mViewModel;
    private FragmentFeedbackkBinding binding;

    public static FeedbackFragment newInstance() {
        return new FeedbackFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentFeedbackkBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(FeedbackViewModel.class);
        // TODO: Use the ViewModel
    }

}