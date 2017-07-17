package com.jetradarmobile.snowfall.sample

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.jetradarmobile.snowfall.SnowfallView

class SnowfallActivity : Activity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_snowfall)
    val btnSetMaxSpeed = findViewById(R.id.btnSetMaxSpeed) as Button
    val sfView = findViewById(R.id.sfView) as SnowfallView

    btnSetMaxSpeed.setOnClickListener { view ->
      Log.i("=click=","btn");

    }
  }
}