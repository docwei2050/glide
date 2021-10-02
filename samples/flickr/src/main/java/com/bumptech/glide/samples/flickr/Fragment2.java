package com.bumptech.glide.samples.flickr;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.samples.flickr.GlideApp;
import com.bumptech.glide.samples.flickr.R;

public
/**
 * Created by liwk on 2021/10/1.
 */
class Fragment2 extends Fragment {
  @Nullable
  @Override
  public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
     ImageView view= (ImageView) LayoutInflater.from(container.getContext()).inflate(R.layout.fragment_item,container,false);
    GlideApp.with(view).load("https://t7.baidu.com/it/u=3652245443,3894439772&fm=193&f=GIF").into(view);
    return view;
  }

  @Override
  public void onDestroy() {
    super.onDestroy();
    Log.e("fragment1","fragment2-->OnDestroy");
  }

  @Override
  public void onDetach() {
    super.onDetach();
    Log.e("fragment1","fragment2-->OnDetach");
  }

  @Override
  public void onDestroyView() {
    super.onDestroyView();
    Log.e("fragment1","fragment2-->onDestroyView");
  }
}
