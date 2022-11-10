//Task You are given q queries in the form of a, b, and n For each query, print the series corresponding to the given a, b, and n values as a single line of n space-separated integers.
//
//Input Format
//
//The first line contains an integer, q denoting the number of queries. 
//Each line i of the q subsequent lines contains three space-separated integers describing the respective a-th b-th and n-th values for that query.
//
//Constraints
// 0<= q <= 500
// 0<= a,b <= 50
// 1<= n <= 15

//Output Format
//
//For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of n space-separated integers.
//
//Sample Input
//
//2
//0 2 10
//5 3 5

//Sample Output
//
//2 6 14 30 62 126 254 510 1022 2046
//8 14 26 50 98

//Explanation png located on git

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner sc = new Scanner(System.in);
        int q=sc.nextInt();
        for(int i=0;i<q;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            int value =a;
            for(int j=0;j<=n-1;j++){
                value+=(Math.pow(2,j)*b);
                System.out.print(value+" ");
            }
            System.out.println();// for next line next q will print
           
        }
        sc.close();
    }
}
/*
Explanation=
q=2 
for q=1--- a=0 b=2 n=3 initial value=a=0
value = value + (2^n)*b
value= 0+2^0*b = 2  for n=0
value= 2 * 2^1*b = 6 for n=2

for q=2--- a=4 b=3 n=10 initial value=a=4
same case


*/
