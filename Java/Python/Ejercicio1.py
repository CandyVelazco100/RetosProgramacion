# Implement an algorithm to determine if a string has all unique characters. What if you
# cannot use additional data structures?  

def IsUnique(str):
    esUnico = False

    for i in range(len(str)):
        for j in range(i + 1,len(str)):
            if(str[i] == str[j]):
                esUnico = True
    return esUnico     

print("INGRESA UNA CADENA ")
cadena = input()   
if(IsUnique(cadena)):
    print("Existen caracteres repetidos")   
else:
    print("No existen caractere repetidos")    