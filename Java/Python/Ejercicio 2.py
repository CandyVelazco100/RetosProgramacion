# Python3 program to check whether two 
# strings are Permutations of each other

# function to check whether two strings 
# are Permutation of each other */
def arePermutation(str1, str2):
	n1 = len(str1)
	n2 = len(str2)
	
	if (n1 != n2):
		return False
	
	a = sorted(str1)
	str1 = " ".join(a)
	b = sorted(str2)
	str2 = " ".join(b)

	for i in range(0, n1, 1):
		if (str1[i] != str2[i]):
			return False

	return True

if __name__ == '__main__':
	print("INGRESA DOS CADENAS ")
	str1 = input()
	str2 = input() 

	if (arePermutation(str1, str2)):
		print("Yes")
	else:
		print("No")