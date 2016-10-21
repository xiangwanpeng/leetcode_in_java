package easy;

/*
 The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

 P   A   H   N
 A P L S I I G
 Y   I   R
 And then read line by line: "PAHNAPLSIIGYIR"
 Write the code that will take a string and make this conversion given a number of rows:

 string convert(string text, int nRows);
 convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
 */
public class ZigZagConversion {
	public String convert(String s, int numRows) {
		if (numRows == 1)
			return s;
		char[][] chs = new char[numRows][s.length()];
		int row = 0, col = 0, status = 0;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			status = col % (numRows - 1);
			if (status == 0) {
				for (row = 0; row < numRows && i < s.length(); row++, i++) {
					chs[row][col] = s.charAt(i);
				}
				i--;
				col++;
			} else {
				chs[numRows - status - 1][col] = s.charAt(i);
				col++;
			}
		}
		for (int i = 0; i < numRows; i++)
			for (int j = 0; j < s.length(); j++)
				if (chs[i][j] != '\0')
					sb.append(chs[i][j]);
		return sb.toString();
	}
}
