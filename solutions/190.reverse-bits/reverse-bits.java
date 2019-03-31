/** 处理无符号数：
8bit unsigned integer －－－> short
8bit signed integer －－－> byte
16bit unsigned integer －－－> int
16bit signed integer －－－> short
32bit unsigned integer －－－> long
32bit signed integer －－－> int

>> 是带符号右移，若左操作数是正数，则高位补“0”，若左操作数是负数，则高位补“1”.
<< 将左操作数向左边移动，并且在低位补0.
>>> 是无符号右移，无论左操作数是正数还是负数，在高位都补“0” 

*/
public class Solution {
    // you need treat n as an unsigned value
    public static int reverseBits(int n) {

        String t = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<32-t.length();i++)
            sb.append(0);
        sb.append(t);
        String s = sb.reverse().toString();

        long res = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '1'){
                res += Math.pow(2,s.length()-1-i);
            }
        }


        return (int)res;
    }
}