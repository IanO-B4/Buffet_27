length=input("How long do you want your line to be? ")
lineType=input("Would you like a horizontal or vertical line? ")
x=0
if lineType=="horizontal":
    for x in range(0, int(length)):
        print("_", end="")
if lineType=="vertical":
    for x in range(0, int(length)):
        print("|")