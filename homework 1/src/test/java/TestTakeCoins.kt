import junit.framework.TestCase.assertTrue
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert
import org.junit.Test

class TestTakeCoins {
    val coins = intArrayOf(50, 20, 10, 5, 5, 1, 1, 1)
    val coins1: TakeCoins? = TakeCoins(70, coins)
    val coins2: TakeCoins? = TakeCoins(16, coins)
    val coins3: TakeCoins? = TakeCoins(-1, coins)
    val coins4: TakeCoins? = TakeCoins(54, coins)
    val coins5: TakeCoins? = TakeCoins(110, coins)


    @Test fun tester1() = assertTrue(coins1!!.ifContains())

    @Test fun tester2() =
            MatcherAssert.assertThat("true", equalTo(coins2?.ifContains().toString()))

    @Test fun tester3() =
            MatcherAssert.assertThat("false", equalTo(coins3?.ifContains().toString()))

    @Test fun tester4() =
            MatcherAssert.assertThat("false", equalTo(coins4?.ifContains().toString()))

    @Test fun tester5() =
            MatcherAssert.assertThat("false", equalTo(coins5?.ifContains().toString()))
}