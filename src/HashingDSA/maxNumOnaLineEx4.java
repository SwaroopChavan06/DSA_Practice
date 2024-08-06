package HashingDSA;

//Given N point on a 2D plane as pair of (x, y) co-ordinates,
// we need to find maximum number of point which lie on the same line.
//Examples:
//Input : points[] = {-1, 1}, {0, 0}, {1, 1},
//        {2, 2}, {3, 3}, {3, 4}
//Output : 4
//Then maximum number of point which lie on same
//line are 4, those point are {0, 0}, {1, 1}, {2, 2},
//        {3, 3}


public class maxNumOnaLineEx4 {
    public static void main(String[] args) {
Integer[][] arr={{-1, 1}, {0, 0}, {1, 1},{2, 2}, {3, 3}, {3, 4}};
int ans = maxPoints(arr);
        System.out.println(ans);
    }

    static int maxPoints(Integer[][] points) {
        int n = points.length;
        int ans = 1;
        for (int i = 0; i < n; i++) {
            int x1 = points[i][0];
            int y1 = points[i][1];
            for (int j = i + 1; j < n; j++) {
                int x2 = points[j][0];
                int y2 = points[j][1];
                int count = 2;
                for (int k = j + 1; k < n; k++) {
                    int x3 = points[k][0];
                    int y3 = points[k][1];
                    int a = (y2 - y1) * (x3 - x1);
                    int b = (y3 - y1) * (x2 - x1);
                    if (a == b) {
                        count++;
                    }
                }
                ans = Math.max(ans, count);
            }
        }
        return ans;
    }
}
