package com.bumptech.glide.samples.flickr;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.Glide;
import com.bumptech.glide.samples.flickr.GlideApp;
import com.bumptech.glide.samples.flickr.R;

public
/**
 * Created by liwk on 2021/10/1.
 */
class Fragment1 extends Fragment {
  @Nullable
  @Override
  public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
     ImageView view= (ImageView) LayoutInflater.from(container.getContext()).inflate(R.layout.fragment_item,container,false);
    GlideApp.with(this).load("https://t7.baidu.com/it/u=3195384123,421318755&fm=193&f=GIF").into(view);
    return view;
  }
}
