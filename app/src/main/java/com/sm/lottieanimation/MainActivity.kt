package com.sm.lottieanimation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import com.airbnb.lottie.LottieAnimationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val anim= findViewById<LottieAnimationView>(R.id.surprise)
         Handler(Looper.getMainLooper()).postDelayed(Runnable {
            anim.visibility=View.VISIBLE
             anim.playAnimation()
         },2000)

        anim.setOnClickListener {
            anim.playAnimation()
        }
    }
}