package com.example.pk.mysummerproject;

/**
 * Created by pk on 8/15/2017.
 */

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;


public class ProjectAdapter extends RecyclerView.Adapter<ProjectAdapter.MyViewHolder> {

    private List<Project> students;
    private Context context;

    public ProjectAdapter(Context context, List<Project> students) {
        this.context = context;
        this.project = project;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.student_list, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Project project = students.get(position);
        holder.nameTextView.setText(project.getName());
        holder.cityTextView.setText(project.getCity());
        holder.emailTextView.setText(project.getEmail());
    }

    @Override
    public int getItemCount() {
        return students.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView nameTextView, cityTextView, emailTextView;

        MyViewHolder(View itemView) {
            super(itemView);
            nameTextView = (TextView) itemView.findViewById(R.id.name_text_view);
            cityTextView = (TextView) itemView.findViewById(R.id.city_text_view);
            emailTextView = (TextView) itemView.findViewById(R.id.email_text_view);
        }
    }
}
