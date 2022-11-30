package com.example.baikiemtracuoi;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TacPhamAdapter extends RecyclerView.Adapter<TacPhamAdapter.TacPhamViewHolder> {

    Context context;
    List<TacPham> tacPhamList;
    SharedPreferences sharedPreferences;

    public TacPhamAdapter(Context context, List<TacPham> tacPhamList) {
        this.context = context;
        this.tacPhamList = tacPhamList;

        sharedPreferences = context.getSharedPreferences("data", Context.MODE_PRIVATE);
    }

    @NonNull
    @Override
    public TacPhamViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.tacpham, parent, false);

        return new TacPhamViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TacPhamViewHolder holder, int position) {
        TacPham tacPham = tacPhamList.get(position);
        if(tacPham == null) {
            return;
        }

        holder.tenTacPham.setText(tacPham.getTenTacPaham());
        holder.idTacPham.setText(tacPham.getIdTacPham());
        holder.theTacPham.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, TacPhamActivity.class);
                intent.putExtra("idTacGia", sharedPreferences.getString("idTacGia", ""));
                intent.putExtra("idTacPham", tacPham.getIdTacPham());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        if(tacPhamList != null) {
            return tacPhamList.size();
        }
        return 0;
    }

    public class TacPhamViewHolder extends RecyclerView.ViewHolder {
        TextView tenTacPham, idTacPham;
        RelativeLayout theTacPham;
        public TacPhamViewHolder(@NonNull View itemView) {
            super(itemView);
            tenTacPham = itemView.findViewById(R.id.tenTacPham);
            idTacPham = itemView.findViewById(R.id.idTacPham);
            theTacPham = itemView.findViewById(R.id.theTacPham);
        }
    }
}
