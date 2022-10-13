package com.mpatrick.geektalkapp
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button



class UserProfile : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_user_profile)

                super.getSupportActionBar()?.hide();

                val botaoDesconectar = super.findViewById<Button>(R.id.btnLogout);

                botaoDesconectar.setOnClickListener{
                        super.finish();
                }
        }


}