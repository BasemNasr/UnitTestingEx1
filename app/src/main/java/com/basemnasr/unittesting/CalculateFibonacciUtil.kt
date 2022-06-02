package com.basemnasr.unittesting

object CalculateFibonacciUtil {

    /**
     * return n-th fibonacci number
     * .... defined like this
     * .... fib(0) = 0
     * .... fib(1) = 1
     * .... fib(n) = fib(n-2) + fib(n-1)
     * ...
     */

    fun fib(n:Int):Long{
        if(n==0 || n==1){
            return n.toLong()
        }

        var a = 0L
        var b = 1L
        var c = 1L
        (1..n-2).forEach {i->
            c = a+b
            a = b
            b = c
        }
        return c
    }

    /**
     * checks if the braces are set correctly
     * eg : "(a * b))" should return false
     * eg : "(a * b)" should return true
     */
    fun checkBraces(text:String):Boolean{
        return text.count{it == '('} == text.count { it == ')' }
    }

}