symbol=input("What symbol would you like to use? ")
width=input("What width would you like your box to be? ")
height=input("what height would you like your box to be? ")
x=0
y=0
for y in range(1, int(height)+1):
    for x in range(1, int(width)):
        print(symbol, end="")
    print(symbol)
