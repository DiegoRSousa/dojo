package com.minsait;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest {

    App app = new App();

    @Test
    void sumTest() {
        
        assertEquals(5, app.sum(2, 3));
    }

    @Test
    void divideTest(){
        assertEquals(2, app.divide(6,3));
    }

}

