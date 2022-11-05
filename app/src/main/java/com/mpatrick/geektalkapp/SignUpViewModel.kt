package com.mpatrick.geektalkapp
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

data class User (
            var nickname: String ="",
            var email :String ="",
            var password :String = ""
);





class SignUpViewModel : ViewModel() {

       // private var user :User = User();
        private val _userWillSend = MutableLiveData<User>();


         fun inputNickName(nick :String) {
                   this._userWillSend.value?.nickname = nick;
         }

        fun inputEmail(email :String){
                   this._userWillSend.value?.email = email;
        }

        fun inputPassword( pw :String){
                   this._userWillSend.value?.password = pw;
        }

        fun returnUser() :User{
                  return this._userWillSend.value as User
        }

        fun returnMutableLiveData() :MutableLiveData<User>{
                  return this._userWillSend
        }

        fun updateUser(){
            //      this._userWillSend.value = this.user;
        }
}