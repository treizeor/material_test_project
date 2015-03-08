package cn.treize.hideandshowtoolbarwhenscrolling;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by treize on 15-3-8.
 */
public class RecyclerItemViewHolder extends RecyclerView.ViewHolder {

    private final TextView mItemTextView;


    public RecyclerItemViewHolder(View itemView, TextView mItemTextView) {
        super(itemView);
        this.mItemTextView = mItemTextView;
    }

    public static RecyclerItemViewHolder newInstance(View parent){
        TextView itemTextView = (TextView)parent.findViewById(R.id.itemTextView);
        return new RecyclerItemViewHolder(parent, itemTextView);
    }

    public void setItemText(CharSequence text) {
        mItemTextView.setText(text);
    }
}
