package com.basemnasr.unittesting

import org.junit.Test
import com.google.common.truth.Truth.assertThat
class RegistrationUtilTest{

    @Test
    fun `empty username returns false`(){
        val result = RegistrationUtil.validRegistrationInput(
            "",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `valid username and correctly repeated password returns true`() {
        val result = RegistrationUtil.validRegistrationInput(
            "Philipp",
            "123",
            "123"
        )
        assertThat(result).isTrue()
    }

    @Test
    fun `username already exists returns false`() {
        val result = RegistrationUtil.validRegistrationInput(
            "Basem",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `incorrectly confirmed password returns false`() {
        val result = RegistrationUtil.validRegistrationInput(
            "Basem",
            "123456",
            "abcdefg"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `empty password returns false`() {
        val result = RegistrationUtil.validRegistrationInput(
            "Basem",
            "",
            ""
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `less than 2 digit password returns false`() {
        val result = RegistrationUtil.validRegistrationInput(
            "Philipp",
            "abcdefg5",
            "abcdefg5"
        )
        assertThat(result).isFalse()
    }

}