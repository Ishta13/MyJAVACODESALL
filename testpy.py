#write a program that prints the numbers from 1 to 100
for i in range(1, 101):
    # For multiples of three print "Fizz" instead of the number
    if i % 3 == 0:
        print("Fizz")
    # For multiples of five print "Buzz" instead of the number
    elif i % 5 == 0:
        print("Buzz")
    # For numbers which are multiples of both three and five print "FizzBuzz"
    elif i % 15 == 0:
        print("FizzBuzz")
    # Otherwise, print the number itself
    else:
        print(i)


#write a program to calculate number of seconds in a year
def seconds_in_a_year():
    # Number of seconds in a minute
    seconds_per_minute = 60
    # Number of minutes in an hour
    minutes_per_hour = 60
    # Number of hours in a day
    hours_per_day = 24
    # Number of days in a year
    days_per_year = 365

    # Calculate total seconds in a year
    total_seconds = (seconds_per_minute * minutes_per_hour * hours_per_day * days_per_year)
    return total_seconds



