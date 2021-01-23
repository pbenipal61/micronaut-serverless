package com.random.micronautserverless

import com.amazonaws.services.lambda.runtime.Context
import com.amazonaws.services.lambda.runtime.RequestHandler
import io.micronaut.runtime.Micronaut.*
//fun main(args: Array<String>) {
//	build()
//	    .args(*args)
//		.packages("com.random.micronautserverless")
//		.start()
//}

class Application: RequestHandler<HandlerInput, HandlerOutput> {
	val translator: PirateTranslator = DefaultPirateTranslator()
	override fun handleRequest(input: HandlerInput?, context: Context?): HandlerOutput {
		input?.let {
			return HandlerOutput(it.message, translator.translate(it.message))
		}
		return HandlerOutput("", "")
	}
}

