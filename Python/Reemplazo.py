# Write a method to replace all spaces in a string with '%20'. 
# You may assume that the string has sufficient space at the end to hold the additional characters, 
# and that you are given the "true" length of the string 

def reemplazo_espacios(string):
    resultado = ""

    for char in string:
        if char == " ":
            resultado += "%20"
        else:
            resultado += char
            
    return resultado
    
if __name__ == "__main__":
    string = input("Ingrese una frase o cadena: ")
    
    resultado = reemplazo_espacios(string)
    print("Resultado:", resultado)