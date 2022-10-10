package com.mpatrick.geektalkapp
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle



class UserProfile : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_user_profile)

            // ESCONDENDO A TOOLBAR SUPERIOR:
            // super.getSupportActionBar()?.hide();
        }


}