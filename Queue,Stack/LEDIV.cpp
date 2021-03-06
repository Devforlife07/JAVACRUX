#include <cstdio>

// the gretest common divisor
int gcd(int a, int b) {
	while (b > 0) {
		int c = a % b;
		a = b;
		b = c;
	}
	return a;
}

// the maximal value for A[i]
const int maxA = 100000;

// minp[x] is the minimal prime divisor of x
// this array initialized by zeros since it is defined outside any function
int minp[maxA + 1];

int main() {
	// we calculate minp[x] using sieve of Eratosthenes
	// in O(maxA * log(log(maxA))) time
	minp[1] = -1;
	for (int i = 2; i <= maxA; ++i) {
		if (minp[i] == 0) {
			for (int j = i; j <= maxA; j += i) {
				if (minp[j] == 0) {
					minp[j] = i;
				}
			}
		}
	}

	int T;
	scanf("%d", &T);
	for (int t = 0; t < T; ++t) {
		int n;
		scanf("%d", &n);
		// d is gcd of all A[i]
		int d = 0;
		for (int i = 0; i < n; ++i) {
			int Ai;
			scanf("%d", &Ai);
			d = gcd(d, Ai);
		}
		int ans = minp[d];
		printf("%d\n", ans);
	}
	return 0;
}
