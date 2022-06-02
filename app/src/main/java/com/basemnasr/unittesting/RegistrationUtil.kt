package com.basemnasr.unittesting

object RegistrationUtil {

    private val existingUsers  = listOf("Basem","Ahmed")
    /**
     * the input is not valid if
     * .... username/password/confirmedPassword is Empty
     * .... username is already taken
     * .... the confirmed password is not the same password
     * ... the password contains less than 2 digits
     */
    fun validRegistrationInput(
        username:String,
        password:String,
        confirmedPassword:String
    ):Boolean {
        if(username.isEmpty() || password.isEmpty()) {
            return false
        }
        if(username in existingUsers) {
            return false
        }
        if(password != confirmedPassword) {
            return false
        }
        if(password.count { it.isDigit() } < 2) {
            return false
        }
        return true
    }
}