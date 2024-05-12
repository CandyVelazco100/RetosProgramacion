def matriz():
    matriz = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]

    m = len(matriz[0])  # Número de columnas
    n = len(matriz)     # Número de filas

    newMat = [[0] * n for _ in range(m)]  # Crear una nueva matriz con dimensiones intercambiadas

    print("Nueva matriz:")
    for i in range(m):
        for j in range(n):
            newMat[i][j] = matriz[j][i]
            print(newMat[i][j], end=" ")
        print()

if __name__ == "__main__":
    matriz()        