
#include <math.h>
#include <vector>
using namespace std;

class Solution {
public:
	vector<int> findDisappearedNumbers(vector<int>& nums) {
		int sizeNums = nums.size();
		for (int i = 0; i < sizeNums; i++) {
			int indexForCurrentNumber = abs(nums[i]) - 1;
			if (nums[indexForCurrentNumber] > 0) {
				nums[indexForCurrentNumber] = -nums[indexForCurrentNumber];
			}
		}

		vector<int> disappearedNumbers;
		for (int i = 0; i < sizeNums; i++) {
			if (nums[i] > 0) {
				disappearedNumbers.push_back(i + 1);
			}
		}
		return disappearedNumbers;
	}
};
