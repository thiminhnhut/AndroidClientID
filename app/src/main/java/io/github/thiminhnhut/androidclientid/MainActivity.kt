package io.github.thiminhnhut.androidclientid

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(resources.getString(R.string.app_name), AndroidClientID.instance.createID())
        Log.d(resources.getString(R.string.app_name), AndroidClientID.instance.getID())
        Log.d(
            resources.getString(R.string.app_name),
            "${AndroidClientID.instance.isMatch("0989318e-3ede-4b37-97ab-e0ce43276819")}"
        )
    }
}
