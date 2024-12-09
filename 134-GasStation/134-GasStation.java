class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int[] diff = new int[n];
        for(int i = 0;i < n ;i++)
        {
            diff[i] = gas[i] - cost[i];
        }
        
        for(int i = 0; i < n;i++)
        {
            if(diff[i] >= 0)
            {
                int start = i;
                int count = 0;
                int tg = 0;
                while(count < n)
                {
                    int current = (start + count) % n;
                    tg += diff[current];
                    if(tg < 0)
                    {
                        break;
                    }
                    count++;
                }

                if(count == n)
                {
                    return i;
                }

                i += count -1;


            }
        }
        return -1;
    }
}