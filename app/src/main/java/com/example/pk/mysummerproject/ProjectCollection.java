package com.example.pk.mysummerproject;

/**
 * Created by pk on 8/15/2017.
 */

import android.content.Context;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;


public class ProjectCollection {

    private static ProjectCollection projectCollection;
    private ArrayList<Project> projectArrayList;

    private ProjectCollection() {
        projectArrayList = new ArrayList<>();
    }

    public static ProjectCollection getInstance() {
        if (projectCollection == null) {
            projectCollection = new ProjectCollection();
            return projectCollection;
        }
        return projectCollection;
    }

    public void fetchProjectList(final Context context, final CallCompleteListener callCompleteListener) {
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest("https://api.myjson.com/bins/xgjh1", new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                for (int i = 0; i < response.length(); i++) {
                    try {
                        JSONObject jsonObject = response.getJSONObject(i);
                        String imageUrl = jsonObject.getString("image");
                        String name = jsonObject.getString("name");
                        String city = jsonObject.getString("city");
                        String email = jsonObject.getString("email");
                        boolean gender = jsonObject.getBoolean("gender");
                        projectArrayList.add(new Project(imageUrl, name, city, email, gender));
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                callCompleteListener.onSuccess(projectArrayList);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                callCompleteListener.onError(error);
            }
        });
        VolleyRequest.getInstance(context).addToRequestQueue(jsonArrayRequest);
    }
}
