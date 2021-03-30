package com.ayeshaazeema.aplikasicuaca

import android.os.CountDownTimer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import com.ayeshaazeema.aplikasicuaca.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        val animCloud = AnimationUtils.loadAnimation(this, R.anim.splash_cloud)
        val animSun = AnimationUtils.loadAnimation(this, R.anim.splash_sun)

        binding.ivCloudSplash.animation = animCloud
        binding.ivSunSplash.animation = animSun

        object : CountDownTimer(3600, 200){

            override fun onTick(millisUntilFinished: Long) {

            }

            override fun onFinish() {
                startActivity(MainActivity.getLaunchService(this@SplashActivity))
            }
        }.start()

        super.onResume()
    }
}