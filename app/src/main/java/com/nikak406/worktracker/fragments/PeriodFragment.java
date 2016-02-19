package com.nikak406.worktracker.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nikak406.worktracker.R;

public class PeriodFragment extends Fragment{
    private static final int LAYOUT = R.layout.period_fragment;
    private View view;

    private String period;

    public static PeriodFragment getInstance(String period) {
        Bundle args = new Bundle();
        PeriodFragment fragment = new PeriodFragment();
        fragment.setArguments(args);
        fragment.period = period;
        return fragment;
    }

    public PeriodFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT, container, false);
        return view;
    }
}
