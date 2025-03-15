# JavaGuesser
Create a guessing game.

Option 1 is to have the player guess a randomly generated number between 1-100.
Option 2 is to have the computer guess a number the player picsk between 1-100.
Will require a menu interface.

## Menu

```
	while true
		print quit
		print Human Guesser
		print Computer Guesser

		take input from user

		if the input equals 0
			print goodbye
			end while
		
		else if input is 1
			print Human Guesser
			Call Human()

		else if input is 2
			print Computer Guesser
			Call Computer()

		else 
			print invalid input
```

## Human

```
public void Human()
	generate a random integer between 1 and 100
	print Try and guess the number between 1 and 100
	
	while true

		take input from the user

		try
			convert input string into an int
			if guess is less than random number
				print too low
			else if guess is greater than random number
				print too high
			else 
				print correct
				end while
		catch exception
			if guess equals q 
				end while loop
			else 
				print invalid input
```
## Computer

```
public void Computer 
	initialize integer lowerbound is 1
	initialize integer upperbound is 100
	initialize integer guess is 50
	
	print out rules of the game
	print out how to tell the computer too high, low, or correct
	
	while true
		print computers guess
		take input from the user
		
		if input equals L
			lowerBound updates to value of guess + 1
			guess updates to (lowerBound + upperBound) / 2
		
		else if input equals H
			upperBound updates to value of guess - 1
			guess updates to (lowerBound + upperBound) / 2
		
		else if input equals C
			print out correct
			end while loop

		else if input equals q
			print out quitting
			end while loop

		else 
			print out invalid input


