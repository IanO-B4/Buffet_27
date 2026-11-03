x = input("Please enter a number: ")
op = input("Please enter a operator: ")
y = input("Please enter another number: ")
ans = 0
if op=="+":
    ans=int(x)+int(y)
    print(x+"+"+y+"="+str(ans))
elif op=="-":
    ans=int(x)-int(y)
    print(x+"-"+y+"="+str(ans))
elif op=="*":
    ans=int(x)*int(y)
    print(x+"*"+y+"="+str(ans))
elif op=="/":
    ans=int(x)/int(y)
    print(x+"/"+y+"="+str(ans))
