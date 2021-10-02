package com.bumptech.glide.samples.flickr;

import static com.bumptech.glide.request.RequestOptions.fitCenterTransform;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.OnScrollListener;
import androidx.recyclerview.widget.RecyclerView.Orientation;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.bumptech.glide.Glide;
import com.bumptech.glide.samples.flickr.api.Photo;
import java.util.ArrayList;
import java.util.List;

/** A simple activity for viewing a single photo. */
public class SecondActivity extends FragmentActivity {


  public static void getIntent(Context context, int count) {
    Intent intent = new Intent(context, SecondActivity.class);
    intent.putExtra("count",count);
    context.startActivity(intent);

  }

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.secod_activity);
    RecyclerView recyclerView=findViewById(R.id.recycler);
    int count=getIntent().getIntExtra("count",10);
    recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false));
    List<String> list=new ArrayList<>();
    if(count<10) {
      list.add("https://t7.baidu.com/it/u=91673060,7145840&fm=193&f=GIF");
    }else{
      list.add("https://t7.baidu.com/it/u=91673060,7145840&fm=193&f=GIF");
      list.add("https://t7.baidu.com/it/u=1297102096,3476971300&fm=193&f=GIF");
      list.add("https://t7.baidu.com/it/u=4283365501,347124022&fm=193&f=GIF");
      list.add("https://t7.baidu.com/it/u=3655946603,4193416998&fm=193&f=GIF");
      list.add("https://t7.baidu.com/it/u=3652245443,3894439772&fm=193&f=GIF");
      list.add("https://t7.baidu.com/it/u=12235476,3874255656&fm=193&f=GIF");
      list.add("https://t7.baidu.com/it/u=1700588201,792130339&fm=193&f=GIF");
      list.add("https://t7.baidu.com/it/u=1032479594,2383177859&fm=193&f=GIF");
      list.add("https://t7.baidu.com/it/u=3195384123,421318755&fm=193&f=GIF");
      list.add("https://t7.baidu.com/it/u=2671101745,1413589787&fm=193&f=GIF");
    }

    recyclerView.setAdapter(new SimpleAdapter(list));
//    recyclerView.addOnScrollListener(new OnScrollListener() {
//      @Override
//      public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
//        super.onScrollStateChanged(recyclerView, newState);
//        if(newState==RecyclerView.SCROLL_STATE_IDLE){
//          GlideApp.with(SecondActivity.this).resumeRequests();
//        }else{
//          GlideApp.with(SecondActivity.this).pauseAllRequests();
//        }
//      }
//
//      @Override
//      public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
//        super.onScrolled(recyclerView, dx, dy);
//      }
//    });
  }
}
