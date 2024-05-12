# Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column are set to 0. 

def set_matrix_zeroes(matrix):
    rows, cols = len(matrix), len(matrix[0])
    zero_rows, zero_cols = set(), set()

    for i in range(rows):
        for j in range(cols):
            if matrix[i][j] == 0:
                zero_rows.add(i)
                zero_cols.add(j)

    for row in zero_rows:
        for j in range(cols):
            matrix[row][j] = 0

    for col in zero_cols:
        for i in range(rows):
            matrix[i][col] = 0


if __name__ == "__main__":
    matrix = [
        [0, 1, 2, 0],
        [3, 4, 5, 2],
        [1, 3, 1, 5]
    ]

    set_matrix_zeroes(matrix)

    for row in matrix:
        for num in row:
            print(num, end=" ")
        print()
