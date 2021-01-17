package com.n2n.jcshop.fragment.merchant.contactus;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.n2n.jcshop.R;

public class MerchantContactUSFragment extends Fragment {

    private MerchantContactUSViewModel mViewModel;

    public static MerchantContactUSFragment newInstance() {
        return new MerchantContactUSFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_merchant_contact_us, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(MerchantContactUSViewModel.class);
        // TODO: Use the ViewModel
    }

}