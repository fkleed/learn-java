package org.example.codewars;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PeopleLikeTest {

    @ParameterizedTest
    @MethodSource
    void whoLikesIt_ShouldReturnCorrectValue(String[] names, String expected) {
        assertEquals(expected, PeopleLike.whoLikesIt(names));
    }

    private static Stream<Arguments> whoLikesIt_ShouldReturnCorrectValue() {
        return Stream.of(
            Arguments.of(new String[]{}, "no one likes this"),
            Arguments.of(new String[]{"Peter"}, "Peter likes this"),
            Arguments.of(new String[]{"Jacob", "Alex"}, "Jacob and Alex like this"),
            Arguments.of(new String[]{"Max", "John", "Mark"}, "Max, John and Mark like this"),
            Arguments.of(new String[]{"Alex", "Jacob", "Mark", "Max"}, "Alex, Jacob and 2 others like this")
        );

    }
}