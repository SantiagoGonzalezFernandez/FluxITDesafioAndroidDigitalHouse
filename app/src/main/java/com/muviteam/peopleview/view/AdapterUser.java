package com.muviteam.peopleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class AdapterUser extends RecyclerView.Adapter<AdapterUser.MyViewHolder> {

    private List<User> userList;
    private ListenerDelAdapter listenerDelAdapter;

    public AdapterUser(List<User> userList) {
        this.userList = userList;
    }

    public AdapterUser(ListenerDelAdapter listenerDelAdapter) {
        userList = new ArrayList<>();
        this.listenerDelAdapter = listenerDelAdapter;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        view = inflater.inflate(R.layout.card_item_user,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        User userMostrado = userList.get(position);
        holder.cargarUser(userMostrado);

    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView textViewUsername;
        private CircleImageView circleImageViewAvatarUser;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            textViewUsername = itemView.findViewById(R.id.CardItemUser_TextView_NombreUser);
            circleImageViewAvatarUser = itemView.findViewById(R.id.CardItemUser_CircleImageView_AvatarUser);

        }

        public void cargarUser(User user){
            Glide.with(circleImageViewAvatarUser.getContext()).load(user.getStringAvatarUrl()).placeholder(R.drawable.load).error(R.drawable.load).into(circleImageViewAvatarUser);
            textViewUsername.setText(user.getStringUsername());
        }
    }

    public interface ListenerDelAdapter{
        public void informarUser(User user);
    }
}