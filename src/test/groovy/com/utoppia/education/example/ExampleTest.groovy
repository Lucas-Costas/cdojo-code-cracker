package com.utoppia.education.example

import spock.lang.Specification

class ExampleTest extends Specification {

    def "The example object brings the correct message"(){
        given: "An example object"
            Example exam = new Example()
        when: "It brings a message"
            String message = exam.bringAMessage()
        then: "The message is the expected"
            message == "Hi I am an example"
    }

    def "Decode an example string"(){
        given: "A string to decode"
        def toDecode = "jidee>!"
        Example exam = new Example()

        when: "It's decoded"
        def decoded = exam.decode(toDecode)

        then: "It's decoded correctly"
        decoded == "utoppia"
    }

}