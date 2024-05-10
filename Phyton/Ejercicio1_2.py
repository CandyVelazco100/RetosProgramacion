# Implement an algorithm to determine if a string has all unique characters. What if you
# cannot use additional data structures?  

def esUnico(str):
    MAX_CHAR = 256
    n = len(str)

    if(n > MAX_CHAR):
        return False
    
    Chars = [False] * MAX_CHAR

    for i in range(n):
        index = ord(str[i])

        if(Chars[index] == True):
            return False
        Chars[index] = True
    return True

print("INGRESA UNA CADENA ")
cadena = input()   
if(esUnico(cadena)):
    print("Existen caracteres repetidos")   
else:
    print("No existen caractere repetidos")           
