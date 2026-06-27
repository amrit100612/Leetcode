class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration,
                                  int[] waterStartTime, int[] waterDuration) {

        int ans = Integer.MAX_VALUE;
        int n = landStartTime.length;
        int m = waterStartTime.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                int landFinish = landStartTime[i] + landDuration[i];

                int waterStart = landFinish;
                if (waterStartTime[j] > waterStart) {
                    waterStart = waterStartTime[j];   
                }
                int planA = waterStart + waterDuration[j];

                int waterFinish = waterStartTime[j] + waterDuration[j];

                int landStart = waterFinish;
                if (landStartTime[i] > landStart) {
                    landStart = landStartTime[i];   
                }
                int planB = landStart + landDuration[i];

         
                int best = planA;
                if (planB < best) {
                    best = planB;
                }

                if (best < ans) {
                    ans = best;
                }
            }
        }

        return ans;
    }
}