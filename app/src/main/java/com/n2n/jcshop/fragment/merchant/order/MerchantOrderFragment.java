package com.n2n.jcshop.fragment.merchant.order;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.n2n.jcshop.R;

public class MerchantOrderFragment extends Fragment {

    private MerchantOrderViewModel mViewModel;

    public static MerchantOrderFragment newInstance() {
        return new MerchantOrderFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_merchant_order, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(MerchantOrderViewModel.class);
        // TODO: Use the ViewModel
    }

}