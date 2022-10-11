package com.mpatrick.geektalkapp
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button



class SignUpForm : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_sign_up_form)

            // ESCONDENDO A TOOLBAR SUPERIOR:
            super.getSupportActionBar()?.hide();

            var botaoEntrar = super.findViewById<Button>(R.id.signUpButton);

            botaoEntrar.setOnClickListener{
                    super.startActivity(
                               Intent(this, UserProfile::class.java)
                    );
            }

    }

}