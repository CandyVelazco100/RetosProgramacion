# Python program to check if two strings are 
# Permutations of each other
NO_OF_CHARS = 256

# Function to check whether two strings are
# Permutation of each other
def arePermutation(str1, str2):
	count1 = [0] * NO_OF_CHARS
	count2 = [0] * NO_OF_CHARS
	for i in str1:
		count1[ord(i)]+=1

	for i in str2:
		count2[ord(i)]+=1

	if len(str1) != len(str2):
		return 0

	for i in range(NO_OF_CHARS):
		if count1[i] != count2[i]:
			return 0

	return 1

print("INGRESA DOS CADENAS ")
str1 = input()
str2 = input() 

if arePermutation(str1, str2):
	print("Yes")
else:
	print("No")
