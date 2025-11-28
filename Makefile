.PHONY: hello variables clean input calc cast format condition loops nested methods arrays grid nums project dimension

hello:
	javac introduction/HelloWorld.java && java introduction.HelloWorld

variables:
	javac introduction/Variables.java && java introduction.Variables

clean:
	rm -f introduction/*.class conditionals/*.class loops/*.class methods/*.class arrays/*.class problems/*.class project/*.class

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

methods:
	javac methods/Methods.java && java methods.Methods

arrays:
	javac arrays/Arrays.java && java arrays.Arrays

grid:
	javac arrays/Grid.java && java arrays.Grid

nums:
	javac problems/Nums.java && java problems.Nums

project:
	javac project/Workouts.java && java project.Workouts

ds:
	javac arrays/Dimensions.java && java arrays.Dimensions
