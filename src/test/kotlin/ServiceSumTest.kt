import kotlin.test.assertEquals
import org.junit.Test

class ServiceSumTest {

    private val service = Service()

    @Test
    fun sumTest() {
        val result = service.sum(1, 2)
        assertEquals(result, 3)
    }

    @Test
    fun sumTestShouldFail() {
        val result = service.sum(1, 2)
        assertEquals(result, 5)
    }
}
