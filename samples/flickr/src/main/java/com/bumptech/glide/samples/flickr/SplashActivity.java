package com.bumptech.glide.samples.flickr;

import static com.bumptech.glide.request.RequestOptions.fitCenterTransform;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

/**
 * A simple activity for viewing a single photo.
 */
public class SplashActivity extends FragmentActivity {
  private static final String ARG_PHOTO = "photo";

  int count = 0;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.splash_activity);
    ImageView fullscreenView1 = (ImageView) findViewById(R.id.iv1);
    fullscreenView1.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View v) {
        count++;
        SecondActivity.getIntent(SplashActivity.this, (count & 1) == 1 ? 10 : 0);
      }
    });
    Glide.with(this).load("https://t7.baidu.com/it/u=3046406811,4037813264&fm=193&f=GIF")
        .apply(fitCenterTransform())
        .diskCacheStrategy(DiskCacheStrategy.RESOURCE)
        .into(
        fullscreenView1);// Glide.with(this).load("https://t7.baidu.com/it/u=91673060,7145840&fm=193&f=GIF").apply(fitCenterTransform()).into(fullscreenView2);
//    Fragment1 fragment1 = new Fragment1();
//    Fragment2 fragment2 = new Fragment2();
//    getSupportFragmentManager().beginTransaction().add(R.id.fr1, fragment1)
//        .addToBackStack(null)
//        .commitAllowingStateLoss();
//    getSupportFragmentManager().beginTransaction().add(R.id.fr2, fragment2)
//        .addToBackStack(null)
//        .commitAllowingStateLoss();

  }
}
