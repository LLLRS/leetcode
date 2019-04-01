class Solution {
    public String solveEquation(String equation) {

        if(equation == null || equation.length() == 0)
            return "No solution";

        String[] s = equation.split("=");
        if(s.length != 2) return "No solution";
        int[] l = getCnt(s[0]);
        int[] r = getCnt(s[1]);

        if(l[0] == r[0] && l[1] == r[1])
            return  "Infinite solutions";

        if(l[0] == r[0])
            return  "No solution";

        return  "x=" + ((r[1] - l[1])/(l[0] - r[0]));
    }

    private int[] getCnt(String s){
        int[] t = new int[2]; //t[0] x的个数  t[1] 常数和

        String[] st = s.split("(?=\\+)|(?=-)");
        List<String> list = new ArrayList<>();

        for(String tt: st){
            if(tt.endsWith("x"))
                t[0] += Integer.parseInt(coeff(tt));
            else
                t[1] += Integer.parseInt(coeff(tt));
        }

         return t;
    }

    public String coeff(String x) {
        if (x.length() > 1 && x.charAt(x.length() - 2) >= '0' && x.charAt(x.length() - 2) <= '9')
            return x.replace("x", "");
        return x.replace("x", "1");
    }
}