package com.example.cardview;

        import android.content.Context;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.TextView;
        import androidx.annotation.NonNull;
        import androidx.recyclerview.widget.RecyclerView;

public class ArrayAdapter extends RecyclerView.Adapter<ArrayAdapter.ViewHolder> {

    private String[] phoneNumebr;

    ArrayAdapter(String[] phoneNumebr) {
        this.phoneNumebr = phoneNumebr;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from( context );
        View v = inflater.inflate( R.layout.element, parent, false );
        return new ViewHolder( v );
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.cNumbers.setText(phoneNumebr[position] );

    }

    @Override
    public int getItemCount() {
        return phoneNumebr.length;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView cNumbers;

        ViewHolder(@NonNull View itemView) {
            super( itemView );
            this.cNumbers = itemView.findViewById( R.id.cNumbers );
        }
    }
}
