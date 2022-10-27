rock = '''
    _______
---'   ____)
      (_____)
      (_____)
      (____)
---.__(___)
'''

paper = '''
    _______
---'   ____)____
          ______)
          _______)
         _______)
---.__________)
'''

scissors = '''
    _______
---'   ____)____
          ______)
       __________)
      (____)
---.__(___)
'''
import random
computer = random.randint(0,2)
you = int(input("Enter 0 for rock, 1 for paper, 2 for scissors: "))

option = [rock, paper, scissors]

print("You chose: ")
if you == 0:
  print(option[you])
elif you == 1:
  print(option[you])
else:
  print(option[you])

print("Computer chose: ")
if computer == 0:
  print(option[computer])
elif computer == 1:
  print(option[computer])
else:
  print(option[computer])

if you==computer:
  print("Its a tie")
elif you==0:
  if computer==1:
    print("You lose!")
  elif computer==2:
    print("You win!")
elif you==1:
  if computer==0:
    print("You win!")
  elif computer==2:
    print("You lose!")
elif you==2:
  if computer==0:
    print("You win!")
  elif computer==1:
    print("You lose!")