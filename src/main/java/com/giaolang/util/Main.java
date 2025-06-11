package com.giaolang.util;

import com.giaolang.util.mathutil.core.MathUtility;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        verifyFactorialGivenRightArg0RunsWell();
        verifyFactorialGivenRightArg1RunsWell();
        verifyFactorialGivenRightArg2RunsWell();
        verifyFactorialGivenRightArgsRunsWell();

    }
    //TEST CASE #4: VERIFY THE GETFACTORIAL() WITH N=3;
    public static void  verifyFactorialGivenRightArgsRunsWell() {
        System.out.println("3! = Expected: 6, Actual: " + MathUtility.getFactorial(3));
        System.out.println("4! = Expected: 24, Actual: " + MathUtility.getFactorial(4));
        System.out.println("5! = Expected: 120, Actual: " + MathUtility.getFactorial(5));
        System.out.println("6! = Expected: 720, Actual: " + MathUtility.getFactorial(6));
    }
    //TEST CASE #3: VERIFY THE GETFACTORIAL() WITH N=2;
    public static void  verifyFactorialGivenRightArg2RunsWell() {
        int n = 2;
        long expected = 2;
        long actual = MathUtility.getFactorial(n);
        System.out.println("2! = Expected: " + expected + ", Actual: " + actual);
    }
    //TEST CASE #2: VERIFY THE GETFACTORIAL() WITH N=1;
    public static void  verifyFactorialGivenRightArg1RunsWell() {
        int n = 1;
        long expected = 1;
        long actual = MathUtility.getFactorial(n);
        System.out.println("1! = Expected: " + expected + ", Actual: " + actual);
    }
    //test tử hàm tính giai thừa, gọi thằng main()
    //muốn test g đó thì phải có test case
    //TEST CASE #1: VERIFY THE GETFACTORIAL() WITH N=0;
    public static void verifyFactorialGivenRightArg0RunsWell(){
        int n = 0;
        long expected = 1;
        long actual = MathUtility.getFactorial(n);
        System.out.println("0! = Expected: " + expected + ", Actual: " + actual);
    }
}
//kĩ thuật vừa viết code vừa gõ test case, vừa gõ test run, được gọi là TDD(TEST DRIVEN DEVELOPMENT)