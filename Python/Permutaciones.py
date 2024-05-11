#Given a string, write a function to check if it is a permutation of a palindrome. 
#A palindrome is a word or phrase that is the same forwards and backwards. 
# A permutation is a rearrangement of letters. 
#The palindrome does not need to be limited to just dictionary words

class Permutaciones:
    def es_permutacion(self, cadena):
        cadena_low = cadena.lower()
        arreglo = self.construir_tabla(cadena_low)
        return self.palindromo(arreglo)

    def construir_tabla(self, cadena):
        arreglo = [0] * 26
        for char in cadena:
            if 'a' <= char <= 'z':
                arreglo[ord(char) - ord('a')] += 1
        return arreglo

    def palindromo(self, arreglo):
        count_odd = 0
        for count in arreglo:
            if count % 2 != 0:
                count_odd += 1
                if count_odd > 1:
                    return False
        return True

if __name__ == "__main__":
    per = Permutaciones()
    c = input("Ingrese una palabra: ")
    print(per.es_permutacion(c))