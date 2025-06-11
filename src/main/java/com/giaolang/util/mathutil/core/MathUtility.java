package com.giaolang.util.mathutil.core;

public class MathUtility {
    //class này dùng để cung cấp các hàm tính toán học
    //bắt chước class math trong jdk
    //vì những tính toán này tính xong trả ra, không cần lưu trữ lại
    //do đó ta thiết kế nó dạng static

    //ta làm hàm tính N!
    //quy ước:
    //0! = 1
    //không có giai thừa số âm, -5! không hợp lệ
    //20! là vừa đủ kiểu long, 21! không dùng được
    public static long getFactorial(int n) {
        if (n<0 || n>20) {
            throw new IllegalArgumentException("n must be between 0 and 20");
            //nếu đưa n quá giới hạn thì vứt, ném thông báo ,không có giấ trị trả về
        }
        if (n==0) {
            return 1;
        }
        long result = 1;
        for (int i=1; i<=n; i++) {
            result *= i;
        }
        return result;
    }

}
