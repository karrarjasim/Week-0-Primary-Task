import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.api.function.Executable
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

internal class MainKtTest {

    @Test
    fun should_ReturnCorrectPercentage_When_HaveCorrectInput() {
        // given
        val charactersList = mutableListOf("a", "b", "b");
        // when
        val charPrecentage = findCharRepetitionPercentage(charactersList);
        // then
        assertEquals(33.33333333333333, charPrecentage);
    }

    @Test
    fun should_ReturnMinus1_When_HaveWrongListValue() {
        // given
        val charactersList = mutableListOf("a", "b", "c");
        // when
        val charPrecentage = findCharRepetitionPercentage(charactersList);
        // then
        assertEquals(-1.0, charPrecentage);
    }

    @Test
    fun should_ReturnMinus1_When_ReturnNull() {
        // given
        val charactersList = mutableListOf("a", "b", "c");
        // when
        val charPrecentage = findCharRepetitionPercentage(charactersList);
        // then
        assertNotNull(charPrecentage);
    }





}