package com.newfivefour.databinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.newfivefour.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

  private ActivityMainBinding binding;
  private ViewObject viewObject;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    // Model
    viewObject = new ViewObject("David 5", "Stone Roses", "Not submitted");

    // Databinding
    binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
    binding.setData(viewObject);
    binding.setActivity(this);
  }

  public void onSubmit(View v) {
    // Get view again
    String text = viewObject.getName() + " and " + viewObject.getFavouriteBand() + " submitted!!";
    // Do something with them
    viewObject.setStatus(text);
  }
}
