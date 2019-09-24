package com.example.cardview;

        import android.content.Context;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.TextView;
        import android.widget.Toast;
        import androidx.annotation.NonNull;
        import androidx.recyclerview.widget.RecyclerView;
        import java.util.ArrayList;


public class ArrayAdapter extends RecyclerView.Adapter<ArrayAdapter.ViewHolder> {

    private Context c;
    private ArrayList<String>divisionName;

    ArrayAdapter(Context c, ArrayList<String> divisionName) {
        this.c = c;
        this.divisionName = divisionName;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from( c );
        View v = inflater.inflate( R.layout.element, parent, false );
        return new ViewHolder( v );
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        holder.cNumbers.setText(divisionName.get( position ) );
        holder.itemView.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(c ,divisionName.get( position ), Toast.LENGTH_SHORT ).show();
            }
        } );

    }

    @Override
    public int getItemCount() {
        return divisionName.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView cNumbers;

        ViewHolder(@NonNull View itemView) {
            super( itemView );
            this.cNumbers = itemView.findViewById( R.id.cNumbers );
        }

    }
}
