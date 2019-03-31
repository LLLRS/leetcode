class Solution {
    public List<String> fizzBuzz(int n) {
        
        List<String> res = new ArrayList<>();
        
        for(int i=1;i<=n;i++){
            boolean flag1 = i%3 == 0;
            boolean flag2 = i%5 == 0;
            
            if(flag1 & flag2)
                res.add("FizzBuzz");
            else if(flag1)
                res.add("Fizz");
            else if(flag2)
                res.add("Buzz");
            else
                res.add(Integer.toString(i));
        }
        
        return res;
        
    }
}