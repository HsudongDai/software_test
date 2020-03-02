class TakeCoins(private val target: Int, private val coins: IntArray) {
    fun ifContains(): Boolean {
        var idx = 0
        var mid = target
        if (target <= 0) {
            return false
        }
        while (idx in coins.indices) {
            if (mid - coins[idx] == 0) {
                return true
            } else if (mid - coins[idx] < 0) {
                idx++
            } else {
                mid -= coins[idx]
                idx++
            }
        }
        return false
    }
}