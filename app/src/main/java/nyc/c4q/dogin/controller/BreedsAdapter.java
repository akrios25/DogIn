package nyc.c4q.dogin.controller;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import nyc.c4q.dogin.model.BreedsCV;
import nyc.c4q.dogin.viewholder.BreedsVH;

/**
 * Created by c4q on 2/25/18.
 */

public class BreedsAdapter extends RecyclerView.Adapter<BreedsVH>{
    private List<BreedsCV> BreedsList;

    public BreedsAdapter(List<BreedsCV> BreedsList){
        this.BreedsList = BreedsList;
    }

    @Override
    public BreedsVH onCreateViewHolder(ViewGroup parent, int viewType) {
      //  View v = LayoutInflater.from(parent.getContext())
        return null;
    }

    @Override
    public void onBindViewHolder(BreedsVH holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
