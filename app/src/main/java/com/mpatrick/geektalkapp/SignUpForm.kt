package com.mpatrick.geektalkapp
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.widget.addTextChangedListener
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider


class SignUpForm : AppCompatActivity() {

            lateinit var viewModel :SignUpViewModel;



            override fun onCreate(savedInstanceState: Bundle?) {
                        // ESCONDENDO A TOOLBAR SUPERIOR:
                        super.getSupportActionBar()?.hide();
                        super.onCreate( savedInstanceState )
                        super.setContentView( R.layout.activity_sign_up_form )



                        this.viewModel = ViewModelProvider(this)
                                                                      .get( SignUpViewModel ::class.java )



                        super.findViewById<Button>(R.id.signUpButton).setOnClickListener{
                                        this.viewModel.updateUser();
                        }


                        this.setInputNicknameChangeListener();
                        this.setInputEmailChangeListener();
                        this.setInputPasswordChangeListener();
                        this.setupObserver();
            }


    // OBSERVANDO A MUDANÇA DE ESTADO DA PROPRIEDADE "_userWillSend" da classe "SignUpViewModel"
// INICIANDO ATIVIDADE/TELA DE PEFIL DO USUÁRIO
    // "createIntentForUserProfile" É EQUIVALENTE À UMA FUNÇÃO ESTÁTICA



            private fun setupObserver(){

                       this.viewModel.returnMutableLiveData().observe( this, Observer {

                                       super.startActivity(
                                                   UserProfile.createIntentForUserProfile(
                                                           this,
                                                                            it.nickname,
                                                                            it.email,
                                                                            it.password
                                                   )
                                       );
                        })
            }



            private fun setInputNicknameChangeListener(){

                    super.findViewById<Button>(R.id.inputNickname).addTextChangedListener {
                            this.viewModel.inputNickName(
                                       super.findViewById<EditText>(R.id.inputNickname).text.toString()
                            )
                    }
            }

            private fun setInputEmailChangeListener(){

                    super.findViewById<Button>(R.id.inputEmail).addTextChangedListener {
                            this.viewModel.inputEmail(
                                        super.findViewById<EditText>(R.id.inputEmail).text.toString()
                            )
                    }
            }


            private fun setInputPasswordChangeListener(){

                    super.findViewById<Button>(R.id.inputPassword).addTextChangedListener {
                            this.viewModel.inputPassword(
                                       super.findViewById<EditText>(R.id.inputPassword).text.toString()
                            )
                    }
            }
}