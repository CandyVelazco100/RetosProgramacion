def comprension(s):
    char_count = {}
    for char in s:
        char_count[char] = char_count.get(char, 0) + 1
    
    compress_string = ""
    for char, count in char_count.items():
        compress_string += char + str(count)
    
    if len(compress_string) < len(s):
        return compress_string
    else:
        return s

def main():
    s = input("Ingrese una palabra: ")
    print(comprension(s))

if __name__ == "__main__":
    main()