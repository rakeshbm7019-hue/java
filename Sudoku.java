public class Sudoku{
    public static void main(String[] args) {
        char[][] board = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };
        solve(board);
        System.out.println(board[0][0]); 
    }
    static boolean solve(char[][] b) {
        return solveSudoku(b);
    }

    static boolean solveSudoku(char[][] b) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (b[row][col] == '.') {
                    for (char num = '1'; num <= '9'; num++) {
                        if (isValid(b, row, col, num)) {
                            b[row][col] = num;
                            if (solveSudoku(b)) {
                                return true;
                            }
                            b[row][col] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    static boolean isValid(char[][] b, int row, int col, char num) {
        for (int i = 0; i < 9; i++) {
            if (b[row][i] == num || b[i][col] == num) {
                return false;
            }
        }

        int subRow = (row / 3) * 3;
        int subCol = (col / 3) * 3;
        for (int r = subRow; r < subRow + 3; r++) {
            for (int c = subCol; c < subCol + 3; c++) {
                if (b[r][c] == num) {
                    return false;
                }
            }
        }
        return true;
    }
}
