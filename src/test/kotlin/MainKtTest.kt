import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.function.Executable
import kotlin.test.assertEquals

internal class MainKtTest {

    @Test
    fun should_ReturnCorrectPercentage_When_HaveCorrectInput() {
        // given
        val charactersList = listOf("a", "b", "b")
        // when
        val charPrecentage = findCharRepetitionPercentage(charactersList)
        // then
        assertEquals(33.33333333333333, charPrecentage)
    }

    @Test
    fun should_ReturnMinus1_When_HaveWrongListValue() {
        // given
        val charactersList = listOf("a", "b", "c")
        // when
        val charPrecentage = findCharRepetitionPercentage(charactersList)
        // then
        assertEquals(-1.0, charPrecentage)
    }

    @Test
    fun should_ReturnMinus1_When_ReturnNull() {
        // given
        val charactersList = listOf("")
        // when
        val charPrecentage = findCharRepetitionPercentage(charactersList)
        // then
        assertEquals(-1.0, charPrecentage)
    }


}