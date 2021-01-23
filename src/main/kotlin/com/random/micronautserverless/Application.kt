package com.random.micronautserverless

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("com.random.micronautserverless")
		.start()
}

