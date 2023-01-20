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

}