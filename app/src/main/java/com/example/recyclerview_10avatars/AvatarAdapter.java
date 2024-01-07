package com.example.recyclerview_10avatars;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AvatarAdapter extends RecyclerView.Adapter<AvatarAdapter.AvatarViewHolder> {

    List<AvatarModel> avatarModelList;

    Context context;



    public AvatarAdapter(List<AvatarModel> avatarModelList) {
        this.avatarModelList = avatarModelList;

    }

    @NonNull
    @Override
    public AvatarAdapter.AvatarViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.avatars_list,parent,false);
        return new AvatarViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AvatarAdapter.AvatarViewHolder holder, int position) {

        AvatarModel avatarModel = avatarModelList.get(position);
        holder.name.setText(avatarModel.getName());
        holder.descript.setText(avatarModel.getDescription());
        holder.image.setImageResource(avatarModel.getAvatarimage());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context, MainActivity2.class);
                intent.putExtra("name",avatarModelList.get(position).getName());
                intent.putExtra("dec",avatarModelList.get(position).getDescription());
                intent.putExtra("image",avatarModelList.get(position).getAvatarimage());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return avatarModelList.size();
    }

    public class AvatarViewHolder extends RecyclerView.ViewHolder {

        TextView name, descript;
        ImageView image;

        CardView cardView;
        public AvatarViewHolder(@NonNull View itemView) {
            super(itemView);

            name=itemView.findViewById(R.id.avatarname);
            descript=itemView.findViewById(R.id.avatardescription);
            image=itemView.findViewById(R.id.avatarimage);
            cardView=itemView.findViewById(R.id.cardview);

        }
    }
}
