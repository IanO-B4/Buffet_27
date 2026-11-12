import requests
joke = requests.get("https://v2.jokeapi.dev/joke/Any?blacklistFlags=nsfw,religious,political,racist,sexist,explicit&type=single").json()
joke2Part = requests.get("https://v2.jokeapi.dev/joke/Any?blacklistFlags=nsfw,religious,political,racist,sexist,explicit&type=twopart").json()

# Jokes with 1 part just have a joke
# joke["joke"] -> References the String of the joke itself


# Jokes with 2 parts have a set up and delivery
# joke["setup"] -> References the String of the setup of the joke
# joke["delivery"] -> References the String of the delivery part of the joke

jokeAmount=int(input("How many jokes would you like? "))
jokeType=input("What kind of joke would you like? ")
x=0
print("--------------------------------------------------------")
if jokeType=="one part":
    for x in range(1, jokeAmount):
        joke = requests.get("https://v2.jokeapi.dev/joke/Any?blacklistFlags=nsfw,religious,political,racist,sexist,explicit&type=single").json()
        print(joke["joke"])
        print("")
    joke = requests.get("https://v2.jokeapi.dev/joke/Any?blacklistFlags=nsfw,religious,political,racist,sexist,explicit&type=single").json()
    print(joke["joke"])
elif jokeType=="two part":
    for x in range(1, jokeAmount):
        joke2Part = requests.get("https://v2.jokeapi.dev/joke/Any?blacklistFlags=nsfw,religious,political,racist,sexist,explicit&type=twopart").json()
        print(joke2Part["setup"])
        print(joke2Part["delivery"])
        print("")
    joke2Part = requests.get("https://v2.jokeapi.dev/joke/Any?blacklistFlags=nsfw,religious,political,racist,sexist,explicit&type=twopart").json()
    print(joke2Part["setup"])
    print(joke2Part["delivery"])