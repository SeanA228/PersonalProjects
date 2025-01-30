import random

# Generate random number 
random_int = random.randint(1,100)


# Welcomes user 
print("Helllo, Welcome to the Number Guessing Game.")
print("The computer will generate a number between 1 and 100")
print("You will have to guess it. You have 5 attempts. Type a number (int) to begin")

attempts = 0 
maxAttempts = 5

# Compare guess to random    
while attempts<maxAttempts:
    
    guess = float(input())
    
    if guess == random_int:
        print('You guessed the right number! Good job')
        attempts = attempts + 1
    elif guess > random_int:
        print("Your guess is too high!")
        if guess == (random_int+1):
            print("Your are one off")
        attempts = attempts + 1
    else:
        print("Your guess is too low")
        if guess == (random_int-1):
            print('You are one off.') 
        attempts = attempts + 1 

    if attempts == (maxAttempts-1):
        print("You have one guess left")

    if (attempts ==maxAttempts) and (guess != random_int):
        print(f"Game over! The number is {random_int}")
        break