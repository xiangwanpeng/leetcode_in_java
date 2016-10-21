package easy;

/*
 Given a roman numeral, convert it to an integer.

 Input is guaranteed to be within the range from 1 to 3999.
 */
public class RomanToInteger {
	public int romanToInt(String s) {
		if (s.length() < 1)
			return 0;
		int result = 0;
		int sub = toInt(s.charAt(0));
		int lastv = sub;
		for (int i = 1; i < s.length(); ++i) {
			char curc = s.charAt(i);
			int curv = toInt(curc);
			if (curv == lastv)
				sub += curv;
			else if (curv < lastv) {
				result += sub;
				sub = curv;
			} else {
				sub = curv - sub;
			}
			lastv = curv;
		}
		result += sub;
		return result;
	}

	public int toInt(char ch) {
		switch (ch) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		}
		return 0;
	}
}
