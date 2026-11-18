import requests
pkmnRequest=input("What pokemon would you like to learn about? ")
pokemon = requests.get("https://pokeapi.co/api/v2/pokemon/"+pkmnRequest).json()

# Use this JSON formatter to better visualize the JSON from the Pokemon website
# https://jsonformatter.org/json-viewer

print("Name: "+str(pokemon["name"]))
print("id: "+str(pokemon["id"]))
print("Base exp: "+str(pokemon["base_experience"]))
print("Height: "+str(pokemon["height"])+" ft.")
print("Weight: "+str(pokemon["weight"])+" lbs.")