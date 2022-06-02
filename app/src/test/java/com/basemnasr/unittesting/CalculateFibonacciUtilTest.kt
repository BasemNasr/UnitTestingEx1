package com.basemnasr.unittesting

import org.junit.Test
import com.google.common.truth.Truth.assertThat

class CalculateFibonacciUtilTest {

    @Test
    fun `calc fib return false`() {
        val result = CalculateFibonacciUtil.fib(0)
        assertThat(result)
    }

    @Test
    fun `check braces return false`() {
        val result = CalculateFibonacciUtil.checkBraces("(a+b))")
        assertThat(result).isFalse()
    }

    @Test
    fun `check braces return true`() {
        val result = CalculateFibonacciUtil.checkBraces("(a+b)")
        assertThat(result).isTrue()
    }

}