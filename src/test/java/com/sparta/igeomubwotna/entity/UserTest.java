package com.sparta.igeomubwotna.entity;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    @DisplayName("updateName test /success")
    void test1() {
        //given
        User user = new User();
        String newName = "new User name";

        //when
        user.updateName(newName);

        //then
        assertEquals(user.getName(), newName);
    }

    @Test
    @DisplayName("updateDescription test /success")
    void test2() {
        //given
        User user = new User();
        String newDescription = "new User description";

        //when
        user.updateDescription(newDescription);

        //then
        assertEquals(user.getDescription(), newDescription);
    }

    @Test
    @DisplayName("updatePassword test /success")
    void test3() {
        //given
        User user = new User();
        String newPassword = "new User password";

        //when
        user.updatePassword(newPassword);

        //then
        assertEquals(user.getPassword(), newPassword);
    }

    @Test
    @DisplayName("updateRefresthToken test /success")
    void test4() {
        //given
        User user = new User();
        String newRefreshToken = "new User refreshToken";

        //when
        user.updateRefreshToken(newRefreshToken);

        //then
        assertEquals(user.getRefreshToken(), newRefreshToken);
    }

    @Test
    @DisplayName("withdrawn test /success")
    void test5() {
        //given
        User user = new User();
        user.withdraw();

        //when
        boolean updateStatus = user.isWithdrawn();

        //then
        assertTrue(updateStatus);
    }
}