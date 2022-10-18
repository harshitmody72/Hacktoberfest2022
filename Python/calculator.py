# This program tries to use loops and function

def add(a,b):
    result=a+b;
    return result;

def multiply(a,b):
    result=a*b;
    return result;

def subtract(a,b):
    result=a-b;
    return result;

def div(a,b):
    result=a/b;
    return result;


print("---------------------------------------------");
print("             Calculator Software             ");
print("---------------------------------------------");

while (True):
    print("-------------------------------------------------------");
    print("\n 1: Add , 2: Multiply , 3: Sub , 4: Div , 5: Exit\n");
    choice=int(input("Enter your choice : "));

    if choice>=5:
        print("\n Thank You for using calculator");
        break;
    elif choice==1:
        x,y=input("\n Enter 2 numbers for add : ").split();
        result=add(int(x),int(y));
        print(" Sum of 2 numbers : ",result);

    elif choice==2:
        x,y=input("\n Enter 2 numbers for multiply : ").split();
        result=multiply(int(x),int(y));
        print(" Multiplication of 2 numbers : ",result);

    elif choice==3:
        x,y=input("\n Enter 2 numbers for subtraction : ").split();
        result=subtract(int(x),int(y));
        print(" Subtraction of 2 numbers : ",result);

    elif choice==4:
        x,y=input("\n Enter 2 numbers for div : ").split();
        result=div(int(x),int(y));
        print(" Div of 2 numbers : ",result);



