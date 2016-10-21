package easy;

/*
 Given  an  arbitrary  ransom  note  string  and  another  string  containing  letters from  all  the  magazines,  write  a  function  that  will  return  true  if  the  ransom   note  can  be  constructed  from  the  magazines ;  otherwise,  it  will  return  false.   

 Each  letter  in  the  magazine  string  can  only  be  used  once  in  your  ransom  note.

 Note:
 You may assume that both strings contain only lowercase letters.

 canConstruct("a", "b") -> false
 canConstruct("aa", "ab") -> false
 canConstruct("aa", "aab") -> true
 */
public class RansomNote {
	public boolean canConstruct(String ransomNote, String magazine) {
		// user array,runtime:14ms
		int[] times = new int[26];
		for (char c : magazine.toCharArray()) {
			times[c - 'a']++;
		}
		for (char c : ransomNote.toCharArray()) {
			if (--times[c - 'a'] < 0)
				return false;
		}
		return true;

		/*
		 * use Hashtable,runtime:71ms Map<Character,Integer> table = new
		 * Hashtable<Character, Integer>(); for(char c:magazine.toCharArray()){
		 * if(table.get(c)==null) table.put(c, 1); else table.put(c,
		 * table.get(c)+1); } for(char c:ransomNote.toCharArray()){
		 * if(table.get(c)==null||table.get(c)==0) return false; else
		 * table.put(c, table.get(c)-1); } return true;
		 */
	}
}
