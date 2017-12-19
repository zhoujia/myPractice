package com.zhoujia.test.programming;


//编程珠玑3.7练习题 第二题
public class test1 {
    // An = C1A(n-1) + C2A(n-2) + ... + CkA(n-k) + C(k+1)
    // 计算上边级数 输入k,A1,A2..,C1,C2...和m,输出 A1和Am
    // 分析题意,k和Ai都是多余的

    public static int recursiveSeries(int a0,int[] ci,int n) {
        int an = a0;
        if(n<=1) {
            an = ci[0]*a0;
            return an;
        }
//        for (int i=0;i<n;i++) {
//        }
        an = recursiveSeries(a0, ci, n - 2) + ci[n-1]*recursiveSeries(a0, ci, n - 1);
        return an;
    }


    public static void main(String[] args) {
        int a0 = 1;
        int [] ci = {2,3,4,5,6,7,8,9};
        int n = 8;
        int i = recursiveSeries(a0, ci, n);
        System.out.println(i);
    }

}
