package com.timkontrakan.githubuserapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.timkontrakan.githubuserapp.databinding.ItemUserBinding;
import com.timkontrakan.githubuserapp.model.User;

import java.util.ArrayList;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.MyViewHolder> {

    private final ArrayList<User> userArrayList;
    private OnItemClickListener onItemClickListener;
    private final Context context;

    public interface OnItemClickListener {
        void OnItemClick(int position);
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    public UserAdapter(ArrayList<User> userArrayList, Context context) {
        this.userArrayList = userArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        return new MyViewHolder(ItemUserBinding.inflate(layoutInflater), onItemClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.binding.name.setText(userArrayList.get(position).getName());
        holder.binding.address.setText(userArrayList.get(position).getAddress());
        holder.binding.username.setText(userArrayList.get(position).getUsername());
        holder.binding.userProfile.setImageResource(userArrayList.get(position).getAvatar());
    }

    @Override
    public int getItemCount() {
        return userArrayList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        ItemUserBinding binding;

        public MyViewHolder(@NonNull ItemUserBinding itemView, final OnItemClickListener listener) {
            super(itemView.getRoot());
            binding = itemView;

            binding.getRoot().setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (listener != null){
                        int position =getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION){
                            listener.OnItemClick(position);
                        }
                    }

                }
            });
        }
    }
}
