import random
list=[]
numAmt=int(input("How many numbers would you like? "))
print("Your numbers are: ", end="")
count=0
for count in range(0, numAmt-1):
    list.append(random.randrange(1, 10))
    print(list[count], end=", ")
list.append(random.randrange(1, 10))
print(list[count+1])