package com.example.test.kaffka.alii.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

import com.example.test.kaffka.alii.R;
import com.example.test.kaffka.alii.databinding.PixabayImageItemBinding;
import com.example.test.kaffka.alii.models.PixabayImage;
import com.example.test.kaffka.alii.viewmodels.Model;

import java.util.List;
public class PixabayImageListAdapter extends RecyclerView.Adapter<PixabayImageListAdapter.PixabayImageViewHolder> {

    private List<PixabayImage> pixabayImageList;

    public PixabayImageListAdapter(List<PixabayImage> pixabayImageList) {
        this.pixabayImageList = pixabayImageList;
    }

    @Override
    public PixabayImageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new PixabayImageViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.pixabay_image_item, parent, false));
    }

    @Override
    public void onBindViewHolder(PixabayImageViewHolder holder, int position) {
        holder.pixabayImageItemBinding.setViewmodel(new Model(pixabayImageList.get(position)));
    }

    @Override
    public int getItemCount() {
        return pixabayImageList.size();
    }

    public static class PixabayImageViewHolder extends RecyclerView.ViewHolder {

        public final PixabayImageItemBinding pixabayImageItemBinding;

        public PixabayImageViewHolder(View v) {
            super(v);
            pixabayImageItemBinding = PixabayImageItemBinding.bind(v);
        }
    }

}
