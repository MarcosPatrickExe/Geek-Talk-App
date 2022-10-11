package com.mpatrick.geektalkapp
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button



class UserProfile : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_user_profile)


                val botaoSair = super.findViewById<Button>(R.id.btnLogout);
                botaoSair.setOnClickListener{
                        super.finish();
                }
        }


}