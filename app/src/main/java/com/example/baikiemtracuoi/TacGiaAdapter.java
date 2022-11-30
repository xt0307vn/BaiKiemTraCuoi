package com.example.baikiemtracuoi;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TacGiaAdapter extends RecyclerView.Adapter<TacGiaAdapter.TacGiaViewHolder> {

    Context context;
    List<TacGia> tacGiaList;
    SharedPreferences sharedPreferences;

    public TacGiaAdapter(Context context, List<TacGia> tacGiaList) {
        this.context = context;
        this.tacGiaList = tacGiaList;
        sharedPreferences = context.getSharedPreferences("data", Context.MODE_PRIVATE);
    }

    @NonNull
    @Override
    public TacGiaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.tacgia, parent, false);

        return new TacGiaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TacGiaViewHolder holder, int position) {
        TacGia tacGia = tacGiaList.get(position);
        if(tacGia == null) {
            return;
        }
        holder.tenTacGia.setText(tacGia.getTenTacGia());
        holder.idTacGia.setText(tacGia.getIdTacGia());
        holder.theTacGia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, TacGiaActivity.class);
                intent.putExtra("idTacGia", tacGia.getIdTacGia());
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("idTacGia", tacGia.getIdTacGia());
                editor.commit();
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        if(tacGiaList != null) {
            return tacGiaList.size();
        }
        return 0;
    }


    public class TacGiaViewHolder extends RecyclerView.ViewHolder {
        TextView tenTacGia, idTacGia;
        RelativeLayout theTacGia;

        public TacGiaViewHolder(@NonNull View itemView) {
            super(itemView);
            tenTacGia = itemView.findViewById(R.id.tenTacGia);
            idTacGia = itemView.findViewById(R.id.idTacGia);
            theTacGia = itemView.findViewById(R.id.theTacGia);
        }
    }
}
