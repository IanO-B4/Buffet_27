year=input("Please enter a year you'd like to check! ")
if (int(year)%4)!=0:
    print("The year "+year+" is not a leap year!")
elif int(year)%100 == 0 and int(year)%400 != 0:
    print("The year "+year+" is not a leap year!")
else:
    print("The year "+year+" is a leap year!")