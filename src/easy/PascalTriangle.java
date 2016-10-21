package easy;

import java.util.LinkedList;
import java.util.List;

/*
Given numRows, generate the first numRows of Pascal's triangle.

For example, given numRows = 5,
Return

[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
		*/
public class PascalTriangle {
	public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new LinkedList<List<Integer>>();
        List<Integer> intList = new LinkedList<Integer>();
        for(int i=0;i<numRows;i++){
            for(int j=0;j<=i;j++){
                if(j==0||j==i)
                intList.add(1);
                else
                intList.add(list.get(i-1).get(j-1)+list.get(i-1).get(j));
            }
            list.add(intList);
            intList = new LinkedList<Integer>();
        }return list;
    }
}
