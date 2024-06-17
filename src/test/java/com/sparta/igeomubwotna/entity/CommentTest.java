package com.sparta.igeomubwotna.entity;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommentTest {

    @Test
    @DisplayName("update test /success")
    void test1() {
        //given(준비)
        Comment comment = new Comment();
        String newComment = "new comment content";

        //when(실행)
        comment.update(newComment);

        //then(검증)
        assertEquals(comment.getContent(), newComment);
    }

}