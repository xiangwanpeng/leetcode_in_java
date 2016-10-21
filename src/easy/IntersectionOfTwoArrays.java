package easy;

import java.util.Hashtable;
import java.util.Map;

/*Given two arrays, write a function to compute their intersection.

Example:
Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].

Note:
Each element in the result must be unique.
The result can be in any order.
*/
public class IntersectionOfTwoArrays {
	public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer,Integer> table = new Hashtable<Integer, Integer>();
        int temp[] = new int[nums1.length];
        int index = 0;
        for(int i:nums1){
        	if(table.get(i)==null)
        		table.put(i, 1);
        }
        for(int i:nums2){
        	if(table.get(i)!=null&&table.get(i)==1){
        		table.put(i, table.get(i)+1);
        		temp[index++] = i;
        	}
        }
        int []result = new int[index];
        for(int i=0;i<index;i++)
        	result[i] = temp[i];
        return result;
    }
}
