package arrays.bananas;

import java.util.Arrays;

class EatingBananas {
    public static int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        var minRate = Integer.MAX_VALUE;
        var l = 1;
        var r = piles[piles.length - 1];
        while (l <= r) {
            var currentRate = (l - r) / 2 + r;
            var currentHour = 0;
            var eatenFull = true;
            for (int i = piles.length - 1; i >= 0; i--) {
                int pile = piles[i];
                currentHour += (int) Math.ceil(pile / (double) currentRate);
                if (currentHour > h) {
                    eatenFull = false;
                    break;
                }
            }
            if (eatenFull) {
                minRate = currentRate;
                r = currentRate - 1;
            } else {
                l = currentRate + 1;
            }
        }
        return minRate;
    }

}
