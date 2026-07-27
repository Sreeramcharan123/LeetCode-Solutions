import java.util.*;

class Solution {
    public List<List<Integer>> aggregateTimeSeries(int[][] series1, int[][] series2) {
        TreeSet<Integer> timestamps = new TreeSet<>();
        for (int[] p : series1) timestamps.add(p[0]);
        for (int[] p : series2) timestamps.add(p[0]);
        List<List<Integer>> ans = new ArrayList<>();
        int i = 0, j = 0;
        for (int t : timestamps) {
            while (i < series1.length && series1[i][0] < t) i++;
            while (j < series2.length && series2[j][0] < t) j++;
            int v1 = (i < series1.length) ? series1[i][1] : 0;
            int v2 = (j < series2.length) ? series2[j][1] : 0;
            List<Integer> row = new ArrayList<>();
            row.add(t);
            row.add(v1 + v2);

            ans.add(row);
        }
        return ans;
    }
}