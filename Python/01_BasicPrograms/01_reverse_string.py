# Write a program that takes a string input from the user and prints the reversed string.

def reverse_string(text):
  reverse_text = ""
  for char in text:
    reverse_text = char + reverse_text
  return reverse_text
    
user_input = input('Enter a string : ')
print(f"Revered string is : {reverse_string(user_input)}")

