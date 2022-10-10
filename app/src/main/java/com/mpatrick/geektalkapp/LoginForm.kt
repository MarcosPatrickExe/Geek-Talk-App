package com.mpatrick.geektalkapp
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView


class LoginForm : AppCompatActivity( ) {

        var  telaCadastroTxt: TextView  = findViewById(R.id.cria_conta_txt)

        override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_login_form);

                // ESCONDENDO A TOOLBAR SUPERIOR:
                super.getSupportActionBar()?.hide();


               this.telaCadastroTxt.setOnClickListener{

                       //   @Override fun onClick(view: View )  { }
                        val intent : Intent = Intent( this,  SignUpForm::class.java ).apply{  }
                        super.startActivity( intent );
               }
        }

}