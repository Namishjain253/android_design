package com.n2n.jcshop.model;

import android.content.Context;

import static maes.tech.intentanim.CustomIntent.customType;

public class IntentAnimation {
    public void forwardAnimation(Context context){
        customType(context,"left-to-right");
    }
    public void backwardAnimation(Context context){
        customType(context,"right-to-left");
    }
}
