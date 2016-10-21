package easy;

/*
 Find the total area covered by two rectilinear rectangles in a 2D plane.

 Each rectangle is defined by its bottom left corner and top right corner as shown in the figure.
 figure: https://leetcode.com/problems/rectangle-area/

 Rectangle Area
 Assume that the total area is never beyond the maximum possible value of int.
 */
public class RectangleArea {
	public int computeArea(int A, int B, int C, int D, int E, int F, int G,
			int H) {
		int sub = 0;
		if (A >= G || E >= C || B >= H || F >= D)
			sub = 0;
		else {
			int length1 = 0, length2 = 0;
			if (H < D) {
				if (B > F)
					length1 = H - B;
				else
					length1 = H - F;
			} else {
				if (F > B)
					length1 = D - F;
				else
					length1 = D - B;
			}
			if (A < E) {
				if (C < G)
					length2 = C - E;
				else
					length2 = G - E;
			} else {
				if (C > G)
					length2 = G - A;
				else
					length2 = C - A;
			}
			sub = length1 * length2;
		}
		return (D - B) * (C - A) + (G - E) * (H - F) - sub;
	}
}
