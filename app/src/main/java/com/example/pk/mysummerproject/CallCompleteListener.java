package com.example.pk.mysummerproject;

/**
 * Created by pk on 8/15/2017.
 */

import com.android.volley.VolleyError;

import java.util.List;

public interface CallCompleteListener {

    void onSuccess(List<Projects> projects);
    void onError(VolleyError volleyError);
}
