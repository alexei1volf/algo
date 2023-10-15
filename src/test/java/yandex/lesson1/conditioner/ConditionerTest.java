package yandex.lesson1.conditioner;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ConditionerTest
{
    private Conditioner conditioner = new Conditioner();

    @Test
    void should_be_warmer_if_auto_and_temp_is_higher()
    {
        //given
        String tempPair = "10 20";
        String mode = "auto";

        //when
        String temp = conditioner.getTemp(tempPair, mode);

        //then
        assertThat(temp).isEqualTo("20");
    }

    @Test
    void should_be_colder_if_auto_and_temp_is_lower()
    {
        //given
        String tempPair = "20 10";
        String mode = "auto";

        //when
        String temp = conditioner.getTemp(tempPair, mode);

        //then
        assertThat(temp).isEqualTo("10");
    }

    @Test
    void should_be_same_if_auto_and_temp_is_same()
    {
        //given
        String tempPair = "10 10";
        String mode = "auto";

        //when
        String temp = conditioner.getTemp(tempPair, mode);

        //then
        assertThat(temp).isEqualTo("10");
    }

    @Test
    void should_be_warmer_if_heat_and_temp_is_higher()
    {
        //given
        String tempPair = "10 20";
        String mode = "heat";

        //when
        String temp = conditioner.getTemp(tempPair, mode);

        //then
        assertThat(temp).isEqualTo("20");
    }

    @Test
    void should_be_same_if_heat_and_temp_is_the_same()
    {
        //given
        String tempPair = "20 20";
        String mode = "heat";

        //when
        String temp = conditioner.getTemp(tempPair, mode);

        //then
        assertThat(temp).isEqualTo("20");
    }

    @Test
    void should_be_same_if_heat_and_temp_is_lower()
    {
        //given
        String tempPair = "20 10";
        String mode = "heat";

        //when
        String temp = conditioner.getTemp(tempPair, mode);

        //then
        assertThat(temp).isEqualTo("20");
    }

    @Test
    void should_be_colder_if_freeze_and_temp_is_lower()
    {
        //given
        String tempPair = "20 10";
        String mode = "freeze";

        //when
        String temp = conditioner.getTemp(tempPair, mode);

        //then
        assertThat(temp).isEqualTo("10");
    }

    @Test
    void should_be_same_if_freeze_and_temp_is_same()
    {
        //given
        String tempPair = "10 10";
        String mode = "freeze";

        //when
        String temp = conditioner.getTemp(tempPair, mode);

        //then
        assertThat(temp).isEqualTo("10");
    }

    @Test
    void should_be_same_if_freeze_and_temp_is_higher()
    {
        //given
        String tempPair = "10 20";
        String mode = "freeze";

        //when
        String temp = conditioner.getTemp(tempPair, mode);

        //then
        assertThat(temp).isEqualTo("10");
    }

    @Test
    void should_be_same_if_fan()
    {
        //given
        String tempPair = "20 10";
        String mode = "fan";

        //when
        String temp = conditioner.getTemp(tempPair, mode);

        //then
        assertThat(temp).isEqualTo("20");
    }

    @Test
    void should_be_error_if_unknown_mode()
    {
        //given
        String tempPair = "20 10";
        String mode = "unnnggg";

        //when
        String temp = conditioner.getTemp(tempPair, mode);

        //then
        assertThat(temp).isEqualTo("mode is unknown");
    }
}