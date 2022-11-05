package com.mpatrick.geektalkapp
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel



data class User (
            var nickname: String ="",
            var email :String ="",
            var password :String = ""
);




class SignUpViewModel : ViewModel() {

         private var user  = User();
         private val _userWillSend = MutableLiveData<User>();

         fun inputNickName( nick :String) {
                   this.user.nickname = nick;
         }

         fun inputEmail( email :String){
                   this.user.email = email;
         }

         fun inputPassword( pw :String){
                   this.user.password = pw;
         }

         fun returnMutableLiveData() :MutableLiveData<User>{
                  return this._userWillSend
         }

         fun updateUser(){
                  this._userWillSend.value = this.user;
         }
}