class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder result = new StringBuilder(s);
        int count = 0;
        for(int index : spaces)
        {
            int adjindex = index + count;
            result.insert(adjindex," ");
            count++;
        }
        return result.toString();
        
    }
}