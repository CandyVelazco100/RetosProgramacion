#There are three types of edits that can be performed on strings: insert a character,
#remove a character, or replace a character. 
#Given two strings, write a function to check if they are one edit (or zero edits) away
class OneAway:
    def IsOneAway(self, cadena1, cadena2):
        if len(cadena1) == len(cadena2):
            return self.reemplazo(cadena1, cadena2)
        if len(cadena1) + 1 == len(cadena2):
            return self.insertar(cadena1, cadena2)
        if len(cadena2) + 1 == len(cadena1):
            return self.insertar(cadena1, cadena2)
        return False
    
    def insertar(self, cadena1, cadena2):    
        index1 = index2 = 0
        while index1 < len(cadena1):
            if cadena1[index1] != cadena2[index2]:
                if index1 != index2:
                    return False
                index2 += 1
            else:
                index2 += 1
                index1 += 1    
        return True    

    def reemplazo(self, cadena1, cadena2):
        DiffOne = False
        for i in range(len(cadena1)):
            if cadena1[i] != cadena2[i]:
                if DiffOne:
                    return False
                DiffOne = True
        return DiffOne

if __name__ == "__main__":
    oa = OneAway()
    print("Ingrese dos palabras ")
    c1 = input()
    c2 = input()
    print(oa.IsOneAway(c1, c2))