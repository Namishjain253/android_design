package com.n2n.jcshop.fragment.merchant.aboutus;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.n2n.jcshop.R;

public class MerchantAboutUSFragment extends Fragment {

    private MerchantAboutUSViewModel mViewModel;

    public static MerchantAboutUSFragment newInstance() {
        return new MerchantAboutUSFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_merchant_about_us, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(MerchantAboutUSViewModel.class);
        // TODO: Use the ViewModel
    }

}