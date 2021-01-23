package com.random.micronautserverless

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class PirateTranslatorTest {

    @Test fun testPirateTranslator() {
        val classUnderTest : PirateTranslator = DefaultPirateTranslator()
        assertEquals("Ahoy!, I am Captain Jack Sparrow", classUnderTest.translate("Hello, I am Captain Jack Sparrow"))
        assertEquals("Aye!", classUnderTest.translate("Yes"))
    }
}