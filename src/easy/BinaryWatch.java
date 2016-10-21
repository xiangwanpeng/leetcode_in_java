package easy;

import java.util.ArrayList;
import java.util.List;

/*
 A binary watch has 4 LEDs on the top which represent the hours (0-11), and the 6 LEDs on the bottom represent the minutes (0-59).

 Each LED represents a zero or one, with the least significant bit on the right.
 For example, the above binary watch reads "3:25".

 Given a non-negative integer n which represents the number of LEDs that are currently on, return all possible times the watch could represent.

 Example:

 Input: n = 1
 Return: ["1:00", "2:00", "4:00", "8:00", "0:01", "0:02", "0:04", "0:08", "0:16", "0:32"]
 Note:
 The order of output does not matter.
 The hour must not contain a leading zero, for example "01:00" is not valid, it should be "1:00".
 The minute must be consist of two digits and may contain a leading zero, for example "10:2" is not valid, it should be "10:02".
 */
public class BinaryWatch {
	public List<String> readBinaryWatch(int num) {
		List<String> res = new ArrayList<>();
		int[] time = new int[] { 1, 2, 4, 8, 1, 2, 4, 8, 16, 32 };
		backtrack(res, time, num, 0, 0, 0, 0);
		return res;
	}

	public void backtrack(List<String> res, int[] time, int num, int count,
			int start, int hour, int min) {
		if (hour > 11 || min > 59)
			return;
		if (num == count) {
			String hh = "" + hour;
			String mm = min < 10 ? "0" + min : "" + min;
			res.add(hh + ":" + mm);
			return;
		}
		for (int i = start; i < time.length; i++) {
			int newHour = i < 4 ? hour + time[i] : hour;
			int newMin = i < 4 ? min : min + time[i];
			backtrack(res, time, num, count + 1, i + 1, newHour, newMin);
		}
	}
}
