package com.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    private static App app;

    @BeforeAll
    static void init(){
        app = new App();
    }

    @Test
    public void task1_check_if_throws_null_pointer(){
        assertThrows(NullPointerException.class, () -> App.task1_throws_null_pointer_exception());
    }

    @Test
    public void task1_check_if_null_pointer_not_thrown(){
        assertDoesNotThrow(() -> app.task1_handle_null_pointer());
    }

    @Test
    public void task2_check_if_throws_arithmetic_exception(){
        assertThrows(ArithmeticException.class, () -> App.task2_throws_arithmetic_exception());
    }

    @Test
    public void task1_check_if_arithmetic_exception_catched(){
        assertDoesNotThrow(() -> app.task2_handle_arithmetic_exception());
    }
}
