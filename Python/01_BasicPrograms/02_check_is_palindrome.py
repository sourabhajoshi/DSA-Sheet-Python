# Write a program that takes a string input from the user and checks whether it is a palindrome or not.
# A palindrome is a word, phrase, or sequence that reads the same backward as forward.

def is_palindrome_number(val):
    reverse_num = 0
    temp = val
    while temp != 0:
        reverse_num = (reverse_num*10) + (temp % 10)
        temp = temp//10
    return (reverse_num == val)

user_input = int(input("Enter a number : "))
if isinstance(user_input, int) and is_palindrome(user_input):
    print("palindrome")
else:
    print("Not palindrome")