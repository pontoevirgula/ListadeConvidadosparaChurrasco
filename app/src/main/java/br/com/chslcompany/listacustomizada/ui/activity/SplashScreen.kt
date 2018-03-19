package br.com.chslcompany.listacustomizada.ui.activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.com.chslcompany.listacustomizada.R

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val background = object : Thread() {
            override fun run() {
                try {
                    // Thread will sleep for 2 seconds
                    Thread.sleep((2 * 1000).toLong())

                    // After 2 seconds redirect to another intent
                    startActivity(Intent(this@SplashScreen, MainActivity::class.java))
                    //Remove activity
                    finish()
                } catch (e: Exception) {
                    e.printStackTrace()
                }

            }
        }
        // start thread
        background.start()
    }
}