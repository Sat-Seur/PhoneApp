package com.satseur.phoneshop.ui.gallery;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ProductsViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public ProductsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("All Phone");
    }

    public LiveData<String> getText() {
        return mText;
    }
}