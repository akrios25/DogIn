package nyc.c4q.dogin.viewholder;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import nyc.c4q.dogin.R;

/**
 * Created by c4q on 2/25/18.
 */

public class DogsViewHolder extends RecyclerView.ViewHolder {
    private TextView breed_textview;
    private Context context;

    public DogsViewHolder(View itemView) {
        super(itemView);
        breed_textview = itemView.findViewById(R.id.breed_name_view);
    }
//    public void onBind(final Dogs dogs){
//
//    }



}
