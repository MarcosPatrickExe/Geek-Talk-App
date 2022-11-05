package com.mpatrick.geektalkapp
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView



class LoginForm : AppCompatActivity() {

/*
        private var  botaoCriarConta :TextView
        get() = field
        set(value){ field = value },

        private var botaoEntrar : Button
        get() = field
        set(value){ field = value },
*/

        override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState);
                super.setContentView(R.layout.activity_login_form);

                // ESCONDENDO A TOOLBAR SUPERIOR:
                super.getSupportActionBar()?.hide();

                var botaoCriarConta:TextView = findViewById<TextView>(R.id.cria_conta_txt);
                var botaoEntrar:Button  =  findViewById<Button>(R.id.btn_entrar);

                botaoEntrar.setOnClickListener{
                        super.startActivity(
                                        Intent(this, UserProfile::class.java)
                        )
                }


                botaoCriarConta.setOnClickListener{
                        super.startActivity(
                                       Intent( this,  SignUpForm::class.java ) /* .apply{  } */
                        )
                }
        }

}