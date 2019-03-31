class Solution {
    public String fractionToDecimal(int numerator, int denominator) {

        if(numerator == 0)
            return "0";

        StringBuilder sb = new StringBuilder();
        if((numerator>0) ^ (denominator>0))
            sb.append("-");

        long num = Math.abs((long)numerator);
        long den = Math.abs((long)denominator);
        sb.append(num / den);
        num %= den;

        if(num == 0)
            return sb.toString();
        sb.append(".");
        HashMap<Long,Integer> hm = new HashMap<>();
        hm.put(num,sb.length());
        while(num != 0){
            num *= 10;
            sb.append(num / den);
            num %= den;

            if(hm.containsKey(num)){
                int t = hm.get(num);
                sb.insert(t,"(");
                sb.append(")");
                break;
            }

            hm.put(num,sb.length());
        }

        return sb.toString();
    }
}