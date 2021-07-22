import kotlin.test.Test
import kotlin.test.assertEquals

internal class ServiceTest {

    private val service = Service()
    private val dataSetA = DataSetUtils.getDateSetOneA()
    private val dataSetB = DataSetUtils.getDateSetOneB()

    @Test
    fun dataSetOneAndNumberInputOne() {
        // For X=1, your function should return an array consisting of ["CVS Pharmacy"]
        val numberInput = 1
        val expectedResult = listOf("CVS Pharmacy")

        val result = service.get(numberInput, dataSetA, dataSetB)

        assertEquals(expectedResult, result)
    }

    @Test
    fun dataSetOneAndNumberInputIsTwo() {
        // For X=2, your function should return an array consisting of ["CVS Pharmacy", "Kroger Company"]
        val numberInput = 2
        val expectedResult = listOf("CVS Pharmacy", "Kroger Company")

        val result = service.get(numberInput, dataSetA, dataSetB)

        assertEquals(expectedResult, result)
    }

    @Test
    fun dataSetOneAndNumberInputIsFour() {
        // For X=4, your function should return an array consisting of ["CVS Pharmacy", "Kroger Company", "Walgreens", "Walmart"]
        val numberInput = 4
        val expectedResult = listOf("CVS Pharmacy", "Kroger Company", "Walgreens", "Walmart")

        val result = service.get(numberInput, dataSetA, dataSetB)

        assertEquals(expectedResult, result)
    }

    @Test
    fun dataSetOneAndNumberInputIsEight() {
        // For X=8, your function should return the array ["Not enough data"]
        val numberInput = 8
        val expectedResult = listOf("Not enough data")

        val result = service.get(numberInput, dataSetA, dataSetB)

        assertEquals(expectedResult, result)
    }
}
