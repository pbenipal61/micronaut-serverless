package com.random.micronautserverless

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ApplicationTest {
    @Test
    fun testAppHasAGreeting() {
        val classUnderTest = Application()
        val input = HandlerInput()
        input.message = "Hello"
        val expected = HandlerOutput("Hello", "Ahoy!")
        var output = classUnderTest.handleRequest(input, null)
        assertEquals(expected, output)
    }
}