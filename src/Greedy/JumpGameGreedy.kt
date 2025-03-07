package Greedy

fun main() {
    JumpGame().canJump(intArrayOf(2,0)).let{ println(it) }
}
class JumpGameGreedy {
    fun canJump(nums: IntArray): Boolean {
        var goal = nums.size - 1
        for(i in nums.size - 2 downTo 0){
            if(i+nums[i] >= goal)
                goal = i
        }
        return goal == 0
    }
}