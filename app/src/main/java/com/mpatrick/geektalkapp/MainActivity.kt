package com.mpatrick.geektalkapp
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main)

                super.getSupportActionBar()?.hide();
                var botaoEntrar = super.findViewById<Button>(R.id.enterButton);

                botaoEntrar.setOnClickListener{
                        this.goToLogin();
                }
        }

        private fun goToLogin(){
                val login = Intent(this, LoginForm::class.java);
                super.startActivity( login);
        }

}