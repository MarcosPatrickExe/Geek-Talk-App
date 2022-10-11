package com.mpatrick.geektalkapp
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView



class LoginForm : AppCompatActivity( ) {

        private val  botaoCriarConta: TextView  = findViewById(R.id.cria_conta_txt)
        private val botaoEntrar: Button = findViewById(R.id.btn_entrar)

        override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_login_form);

                // ESCONDENDO A TOOLBAR SUPERIOR:
                super.getSupportActionBar()?.hide();


                this.botaoEntrar.setOnClickListener{
                        super.startActivity(
                                         Intent(this, UserProfile::class.java)
                        );
                }


                this.botaoCriarConta.setOnClickListener{
                        super.startActivity(
                                Intent( this,  SignUpForm::class.java ).apply{  }
                        );
                }
        }

}