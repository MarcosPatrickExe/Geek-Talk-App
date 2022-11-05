package com.mpatrick.geektalkapp
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button



class UserProfile : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                super.setContentView(R.layout.activity_user_profile)
                super.getSupportActionBar()?.hide();


                var nick :String = super.getIntent().getStringExtra("userNickname").toString();
                var email :String = super.getIntent().getStringExtra("userEmail").toString();
                var password :String = super.getIntent().getStringExtra("userPassword").toString();


                super.findViewById<Button>(R.id.inputNickname).text = nick;
                super.findViewById<Button>(R.id.inputEmail).text = email;
                super.findViewById<Button>(R.id.inputPassword).text = password;


                val botaoDesconectar = super.findViewById<Button>(R.id.btnLogout);

                botaoDesconectar.setOnClickListener{
                        super.finish();
                }
        }



        companion object {
                        private val  key1 :String = "userNickname"
                        private val  key2 :String = "userEmail"
                        private val  key3 :String = "userPassword"


                        fun createIntentForUserProfile( context :Context,  nickname :String, email :String, password :String) :Intent{

                                return Intent(context, UserProfile::class.java).apply {
                                        this.putExtra(key1, nickname);
                                        this.putExtra(key2, nickname);
                                        this.putExtra(key3, nickname);
                                }
                        }
        }


}