package com.n2n.jcshop.fragment.merchant.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MerchantHomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public MerchantHomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}