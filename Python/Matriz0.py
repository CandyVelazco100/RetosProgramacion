#Fill a Matrix with 0
def ceros(mat):
    m = len(mat)
    n = len(mat[0])
    hay_ceros = False

    for i in range(m):
        for j in range(n):
            if mat[i][j] == 0:
                hay_ceros = True
                break
        if hay_ceros:
            break

    if hay_ceros:
        for i in range(m):
            mat[i] = [0] * n
        print("La matriz contiene al menos un cero:")
        imprimir(mat)
    else:
        print("La matriz no contiene ceros.")

def imprimir(mat):
    for row in mat:
        print(' '.join(map(str, row)))

if __name__ == "__main__":
    # Casos de prueba
    mat1 = [
        [1, 2, 3, 4, 5],
        [6, 7, 8, 9, 10],
        [11, 12, 13, 14, 15],
        [16, 17, 18, 19, 20],
        [21, 22, 23, 24, 25]
    ]
    
    mat2 = [
        [1, 2, 3],
        [4, 5, 6],
        [7, 8, 9]
    ]
    
    mat3 = [
        [1, 2, 3],
        [4, 0, 6]
]
    ceros(mat1)
    print()
    ceros(mat2)
    print()
    ceros(mat3)