
/**
 * @param {number[]} nums
 * @return {number[]}
 */
var findDisappearedNumbers = function (nums) {

    let sizeNums = nums.length;
    for (let i = 0; i < sizeNums; i++) {
        let indexForCurrentNumber = Math.abs(nums[i]) - 1;
        if (nums[indexForCurrentNumber] > 0) {
            nums[indexForCurrentNumber] = -nums[indexForCurrentNumber];
        }
    }

    const disappearedNumbers = [];
    for (let i = 0; i < sizeNums; i++) {
        if (nums[i] > 0) {
            disappearedNumbers.push(i + 1);
        }
    }
    return disappearedNumbers;
};
