class Solution {
    public boolean canChange(String start, String target) {
        int n = start.length();
        int i = 0, j = 0;
        while(i < n || j < n)
        {
            
            
            while(i < n && start.charAt(i) == '_')
            {
                i++;
            }
            while(j < n && target.charAt(j) == '_')
            {
                j++;
            }
            if(i == n && j == n)
            {
                return true;
            }
            if(i == n || j == n)
            {
                return false;
            }

            char c1 = start.charAt(i);
            char c2 = target.charAt(j);

            if(c1 != c2)
            {
                return false;
            }
            if(c1 == 'L' && i<j)
            {
                return false;
            }
            if(c1 == 'R' && i>j)
            {
                return false;
            }

            i++;
            j++;

        }

        return true;


        
    }
}