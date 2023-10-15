package validparentheses;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.in;
import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest
{
    private ValidParentheses validParentheses = new ValidParentheses();

    @Test
    void isValid_shouldReturnFalseIfOnlyOneOpen()
    {
        String input = "(";

        boolean result = validParentheses.isValid(input);

        assertThat(result).isFalse();
    }

    @Test
    void isValid_shouldReturnTrueIfOneOpenAndClose()
    {
        String input = "()";

        boolean result = validParentheses.isValid(input);

        assertThat(result).isTrue();
    }

    @Test
    void isValid_shouldReturnFalseIfOneOpenAndTwoClose()
    {
        String input = "())";

        boolean result = validParentheses.isValid(input);

        assertThat(result).isFalse();
    }

    @Test
    void isValid_shouldReturnFalseIfTwoOpenAndTwoClose()
    {
        String input = "(){}";

        boolean result = validParentheses.isValid(input);

        assertThat(result).isTrue();
    }

    @Test
    void isValid_shouldReturnFalseIfThreeOpenAndTwoClose()
    {
        String input = "((){}";

        boolean result = validParentheses.isValid(input);

        assertThat(result).isFalse();
    }

}