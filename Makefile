.PHONY: hello variables all clean input cast format loops nested methods

hello:
	javac introduction/HelloWorld.java && java introduction.HelloWorld

variables:
	javac introduction/Variables.java && java introduction.Variables

all:
	javac introduction/*.java

clean:
	rm -f introduction/*.class conditionals/*.class loops/*.class methods/*.class

input:
	javac introduction/UserInput.java && java introduction.UserInput

calc:
	javac introduction/Math.java && java introduction.Math

cast:
	javac introduction/Casting.java && java introduction.Casting

format:
	javac introduction/FormattedOutput.java && java introduction.FormattedOutput

condition:
	javac conditionals/Conditionals.java && java conditionals.Conditionals

loops:
	javac loops/Loops.java && java loops.Loops

nested:
	javac loops/Nested.java && java loops.Nested

nested:
	javac methods/Methods.java && java methods.Methods
