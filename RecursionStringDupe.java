public class RecursionStringDupe {
    public static void removedupe(String str, StringBuilder newStr , boolean map[],int idx)
    {
        if (idx == str.length()) //mtlb indx string.len se aage nikl gya hai
        {
            System.out.println(newStr);
            return;
        }
        char currchar = str.charAt(idx);
        if (map[currchar - 'a']== true)        // to check for dupes
        {
            removedupe(str, newStr, map, idx+1); //if dupe indx+1
        }
        else
        {
          map[currchar - 'a'] = true;  //to append index + value if not duplicate
            {
            removedupe(str, newStr.append(currchar), map, idx+1); //ekse append + indx +1
            }

        }
    }
    public static void main(String[] args) {
        String nw = "aasthajjainn";
        removedupe(nw, new StringBuilder(" "), new boolean[26], 0); // seedhe new StringBuilder aur new boolean[26] 
                                                                           //se initialize direct func me
                                                                           // boolean[26] because 26 letters
    }
    
}
