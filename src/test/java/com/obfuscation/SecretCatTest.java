package com.obfuscation;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SecretCatTest {

    @Before
    public void setUp() {

    }

    @Test
    public void getAge() {
        int randomReturn = 2;
        Random random = getMockedRandom(randomReturn);

        SecretCat secretCat = new SecretCat(random);

        int expected = 3;
        int actual = secretCat.getAge();
        assertThat(expected, equalTo(actual));
    }

    private Random getMockedRandom(int returnValue) {
        Random random = mock(Random.class);
        when(random.nextInt(anyInt())).thenReturn(returnValue);
        return random;
    }
}