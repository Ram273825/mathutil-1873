package com.giaolang.util.mathutil.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityTest {

    @Test //@Test tương hàm main(), code trong hàm này sẽ run như hàm main()
    //biến mỗi test case thành test run, thành main() để chạy
    void verifyFactorialGivenRightArg0RunWell() {
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(120, MathUtility.getFactorial(5));
        assertEquals(720, MathUtility.getFactorial(6));
        assertEquals(1, MathUtility.getFactorial(0));
        assertEquals(1, MathUtility.getFactorial(1));
    }
    @Test
    void verifyFactorialGivenRightArg2RunWell() {
        assertEquals(2, MathUtility.getFactorial(2));
    }
    @Test
    void verifyFactorialGivenRightArg3RunWell() {
        assertEquals(6, MathUtility.getFactorial(3));
    }
}