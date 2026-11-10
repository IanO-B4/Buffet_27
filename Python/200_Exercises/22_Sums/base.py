x=input("Please enter a number: ")
y=0
ans=0
for y in range(1, (int(x))):
    print(y, end="+")
    ans=ans+y
ans=ans+int(x)
print(x)
print("The sum of 1 to "+x+" is: "+str(ans))