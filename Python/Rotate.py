# Assume you have a method isSubstringwhich checks if oneword is a substring of another. 
# Given two strings, sl and s2, write code to check if s2 is a rotation of sl 
#using only one call to isSubstring 
class Rotate:
    def is_rotation(self, str1, str2):
        if str1 is None or str2 is None or len(str1) != len(str2):
            return False
        
        if str1 == "" and str2 == "":
            return True
        
        str11 = str1 + str1
        return self.is_substring(str11, str2)
    
    def is_substring(self, str11, str2):
        length = len(str2)
        for i in range(len(str11)):
            print(str11[i:i+length])
            if str11[i:i+length] == str2:
                return True
        return False

if __name__ == "__main__":
    r = Rotate()
    c1 = input("Ingrese la primera palabra: ")
    c2 = input("Ingrese la segunda palabra: ")
    print(r.is_rotation(c1, c2))