package com.bumptech.glide.samples.flickr;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import java.util.List;

class SimpleAdapter extends RecyclerView.Adapter<PhotoViewHolder> {
  List<String> list ;
  public SimpleAdapter(List<String> list2){
    list=list2;
  }


  @Override
  public PhotoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    View view = LayoutInflater.from(parent.getContext())
        .inflate(R.layout.flickr_photo_grid_item, parent, false);
    return new PhotoViewHolder(view);
  }

  @Override
  public void onBindViewHolder(PhotoViewHolder holder, int position) {
    GlideApp.with(holder.itemView)
        .load(list.get(position))
        .thumbnail(0.3f)
        .diskCacheStrategy(DiskCacheStrategy.RESOURCE)
        .placeholder(R.drawable.ic_launcher)
        .error(R.drawable.ic_launcher)
        .into(holder.imageView);
  }


  @Override
  public int getItemCount() {
    return list.size();
  }


}

class PhotoViewHolder extends RecyclerView.ViewHolder {
  public final ImageView imageView;

  PhotoViewHolder(View itemView) {
    super(itemView);
    imageView = (ImageView) itemView;
  }
}