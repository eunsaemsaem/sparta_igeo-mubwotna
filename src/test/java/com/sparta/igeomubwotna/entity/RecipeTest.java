package com.sparta.igeomubwotna.entity;

import com.sparta.igeomubwotna.dto.RecipeRequestDto;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecipeTest {

    @Test
    @DisplayName("update test /success")
    void test1() {
        //given
        Recipe recipe1 = new Recipe();
        RecipeRequestDto requestDto = new RecipeRequestDto();

        //when
        recipe1.update(requestDto);

        //then
        assertEquals(recipe1.getTitle(), requestDto.getTitle());
    }

}