package com.mpatrick.geektalkapp
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle



class SignUpForm : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_sign_up_form)

            // ESCONDENDO A TOOLBAR SUPERIOR:
            super.getSupportActionBar()?.hide();
    }

}