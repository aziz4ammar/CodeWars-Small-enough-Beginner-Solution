public class Kata {
    public static boolean smallEnough(int[] array, int limit) {
        for (int num : array) {
            if (num > limit) {
                return false;
            }
        }
        return true;
    }
}