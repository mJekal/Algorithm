	class Solution {
		static class Pair {
			int zero;
			int one;

			Pair(int zero, int one) {
				this.zero = zero;
				this.one = one;
			}

			Pair add(Pair other) {
				return new Pair(other.zero + zero, other.one + one);
			}
		}

		static Pair rec(int offsetX, int offsetY, int size, int[][] arr) {
			for (int i = offsetX; i < size + offsetX; i++) {
				for (int j = offsetY; j < size + offsetY; j++) {
					if (arr[i][j] != arr[offsetX][offsetY]) {
						return rec(offsetX, offsetY, size / 2, arr).add(rec(offsetX, offsetY + size / 2, size / 2, arr))
								.add(rec(offsetX + size / 2, offsetY, size / 2, arr))
								.add(rec(offsetX + size / 2, offsetY + size / 2, size / 2, arr));
					}
				}

			}
			if (arr[offsetX][offsetY] == 0) {
				return new Pair(0, 1);
			}
			return new Pair(1, 0);

		}

		public int[] solution(int[][] arr) {
			Pair pair = rec(0, 0, arr.length, arr);
			return new int[] { pair.one, pair.zero };
		}
	}