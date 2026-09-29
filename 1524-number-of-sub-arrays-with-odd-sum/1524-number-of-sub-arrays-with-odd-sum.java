class Solution {
	public int numOfSubarrays(int[] arr) {
		long answer = 0;
		int even = 1;
		int odd = 0;
		int sum = 0;
		int mod = 1000000007;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if (sum % 2 == 0) {
				answer += odd;
				even++;
			}
			else {
				answer += even;
				odd++;
			}
			answer %= mod;
		}

		return (int) answer;
	}
}