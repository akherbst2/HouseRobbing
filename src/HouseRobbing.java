/**
 * Created by Alyssa on 11/2/2016.
 */

import java.util.*;

public class HouseRobbing {
    static int[] house;
    static long[] MV;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        house = new int[n];
        MV = new long[n];
        Arrays.fill(MV, -1);
        for(int k = 0; k < n; k++) {
            house[k] = sc.nextInt();
        }
        System.out.println("Max value = " + rob(n - 1));
    }

    static long rob(int k) {
        if (k < 0) {
            return 0;
        }
        else if (MV[k] != -1) {
            return MV[k];
        } else {
            MV[k] = Math.max(rob(k - 1), rob(k - 2) + house[k]);
            return MV[k];
        }
    }

}