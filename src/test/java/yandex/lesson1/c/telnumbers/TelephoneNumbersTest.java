package yandex.lesson1.c.telnumbers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TelephoneNumbersTest
{
    private TelephoneNumbers telephoneNumbers = new TelephoneNumbers();

    @Test
    void should_return_yes_if_equals_all()
    {
        //given
        String newNumber = "8(495)430-23-97";
        String[] existingNumbers = new String[] {"8(495)430-23-97", "8(495)430-23-97", "8(495)430-23-97"};

        //when
        String[] result = telephoneNumbers.add(newNumber, existingNumbers);

        //then
        String[] expected = new String[] {"YES", "YES", "YES"};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void should_return_yes_if_equals_not_all()
    {
        //given
        String newNumber = "8(495)430-23-97";
        String[] existingNumbers = new String[] {"8(495)430-23-95", "8(495)430-23-97", "8(495)430-23-96"};

        //when
        String[] result = telephoneNumbers.add(newNumber, existingNumbers);

        //then
        String[] expected = new String[] {"NO", "YES", "NO"};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void should_return_yes_if_prefix_diff()
    {
        //given
        String newNumber = "8(495)430-23-97";
        String[] existingNumbers = new String[] {"+7(495)430-23-97", "+7(495)430-23-97", "+7(495)430-23-97"};

        //when
        String[] result = telephoneNumbers.add(newNumber, existingNumbers);

        //then
        String[] expected = new String[] {"YES", "YES", "YES"};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void should_return_yes_if_prefix_and_code_diff()
    {
        //given
        String newNumber = "8495430-23-97";
        String[] existingNumbers = new String[] {"+7(495)430-23-97", "+7(495)430-23-97", "+7(495)430-23-97"};

        //when
        String[] result = telephoneNumbers.add(newNumber, existingNumbers);

        //then
        String[] expected = new String[] {"YES", "YES", "YES"};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void should_return_yes_if_dash()
    {
        //given
        String newNumber = "+7-4-9-5-4-3-0-23-97";
        String[] existingNumbers = new String[] {"+7(495)430-23-97", "+7(495)43-0-23-97", "+7(495)430239-7"};

        //when
        String[] result = telephoneNumbers.add(newNumber, existingNumbers);

        //then
        String[] expected = new String[] {"YES", "YES", "YES"};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void should_return_yes_if_short()
    {
        //given
        String newNumber = "4-3-0-23-97";
        String[] existingNumbers = new String[] {"+7(495)430-23-97", "+7(495)43-0-23-97", "+7(495)430239-7"};

        //when
        String[] result = telephoneNumbers.add(newNumber, existingNumbers);

        //then
        String[] expected = new String[] {"YES", "YES", "YES"};
        assertThat(result).isEqualTo(expected);
    }
}