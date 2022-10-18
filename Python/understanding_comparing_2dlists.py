# Experiment with lists

studentId=[40,50,60,70,80,90,100];
empId=[4,5,6,7,8,9,10];
collegeStudentId=[40,50,60,70,80,90,100];

if studentId==collegeStudentId:
    print("Both lists are same");
else :
    print("Lists doesn't match");


# Experiment with dictionaries
appleLib={'Science':'ABC','Maths':'XYZ','History':'A123'};
orangeLib={'History':'A123','Science':'ABC','Maths':'XYZ'};

if appleLib==orangeLib:
    print("Both libraries are having same books");
else:
    print("Libraries are different");


# Experimenting with 2d lists
menu=[['Dosa','Idly','Poori'],
      ['Rice and Sambhar','Roti and Curry', 'Curd Rice'],
     ['chats','Gobi','soup','chips'] ];

# BreakFast
print("Breakfast :"+str(menu[0]));

# BreakFast - specific item : Idly
print("Specific Breakfast : "+str(menu[0][1]));

# Luch
print("Lunch : "+str(menu[1]));

#Snacks
print("Snacks : "+str(menu[2]));

#Snacks
print("Specific Snack : "+str(menu[2][3]));

