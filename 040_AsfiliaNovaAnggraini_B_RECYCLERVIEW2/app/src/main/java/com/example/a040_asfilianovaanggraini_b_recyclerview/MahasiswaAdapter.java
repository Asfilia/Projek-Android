package com.example.a040_asfilianovaanggraini_b_recyclerview;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;

public class MahasiswaAdapter extends RecyclerView.Adapter<MahasiswaAdapter.MahasiswaViewHolder>{

    private ArrayList<mahasiswa> dataList;

    public MahasiswaAdapter(ArrayList<mahasiswa> dataList){
        this.dataList = dataList;
    }

    @Override
    public MahasiswaViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.row_mahasiswa, parent, false);
        return new MahasiswaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MahasiswaViewHolder holder, int position){
        holder.txtNama.setText(dataList.get(position).getNama());
        holder.txtNpm.setText(dataList.get(position).getNim());
        holder.txtNoHp.setText(dataList.get(position).getNohp());
    }

    @Override
    public int getItemCount(){
        return (dataList != null) ? dataList.size(): 0;
    }

    public class MahasiswaViewHolder extends RecyclerView.ViewHolder{
        private TextView txtNama, txtNpm, txtNoHp;

        public MahasiswaViewHolder(View itemView){
            super(itemView);
            txtNama = (TextView) itemView.findViewById(R.id.txt_nama_mahasiswa);
            txtNpm = (TextView) itemView.findViewById(R.id.txt_nim_mahasiswa);
            txtNoHp = (TextView) itemView.findViewById(R.id.txt_nohp_mahasiswa);
        }
    }
}
