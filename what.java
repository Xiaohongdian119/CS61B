public class what {
    /** Returns the maximum value from m. */
    public static void windowPosSum(int[] m, int n) {
	int i;
        for (i = 0; i < m.length - 1; i++){
	    if (m[i] <= 0) continue;
	    for (int j = i + 1; j < n + i + 1; j++){
		if (j >= m.length) break;
		m[i] += m[j];
	    }
	}
    }
    public static void main(String[] args) {
       int[] numbers = new int[]{1, 2, -3, 4, 5, 4}; 
       windowPosSum(numbers, 3);
       System.out.println(java.util.Arrays.toString(numbers));
    }
}