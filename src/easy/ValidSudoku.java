package easy;

import java.util.Hashtable;
import java.util.Map;

/*
Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.

The Sudoku board could be partially filled, where empty cells are filled with the character '.'.

click "https://leetcode.com/problems/valid-sudoku/" to see the picture

A partially filled sudoku which is valid.

Note:
A valid Sudoku board (partially filled) is not necessarily solvable. Only the filled cells need to be validated.
*/
public class ValidSudoku {
	public boolean isValidSudoku(char[][] board) {
		Map<Character, Integer> table = new Hashtable<Character, Integer>();
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (table.get(board[i][j]) == null)
					table.put(board[i][j], 1);
				else if (board[i][j] != '.')
					return false;
			}
			table.clear();
		}
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (table.get(board[j][i]) == null)
					table.put(board[j][i], 1);
				else if (board[j][i] != '.')
					return false;
			}
			table.clear();
		}
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (table.get(board[i][j]) == null)
					table.put(board[i][j], 1);
				else if (board[i][j] != '.')
					return false;
			}
			table.clear();
		}
		for (int x = 0; x < 7; x += 3)
			for (int y = 0; y < 7; y += 3) {
				for (int i = x; i < x + 3; i++) {
					for (int j = y; j < y + 3; j++) {
						if (table.get(board[i][j]) == null)
							table.put(board[i][j], 1);
						else if (board[i][j] != '.')
							return false;
					}
				}
				table.clear();
			}
		return true;
	}
}
