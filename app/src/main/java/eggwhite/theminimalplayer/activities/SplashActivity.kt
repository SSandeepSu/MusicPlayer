package eggwhite.theminimalplayer.activities

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import eggwhite.theminimalplayer.BuildConfig
import eggwhite.theminimalplayer.R
import jp.wasabeef.glide.transformations.BitmapTransformation
import jp.wasabeef.glide.transformations.BlurTransformation
import kotlinx.android.synthetic.main.content_splash.*

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        app_version.text = BuildConfig.VERSION_NAME

        Glide.with(this).load(R.drawable.ic_play_outer_circle)
                .apply(RequestOptions.bitmapTransform(object : BlurTransformation(2) {}))
                .into(splash_image)

        Handler().postDelayed({
            val intent = Intent(this, PlayerActivity::class.java)
            startActivity(intent)
            finish()
        }, 1000)

    }
}
