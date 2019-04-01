class Solution {
    public String predictPartyVictory(String s) {

        int n = s.length();
        Queue<Integer> sr = new LinkedList<>();
        Queue<Integer> sd = new LinkedList<>();


        for(int i=0;i<n;i++){
            if(s.charAt(i) == 'R')
                sr.add(i);
            else
                sd.add(i);
        }

        if(sr.size() >= 2 * sd.size())   return "Radiant";        
        if(sd.size() >= 2 * sr.size())   return "Dire";
        
        while( !sr.isEmpty() && !sd.isEmpty()){

            int r = sr.poll(), d = sd.poll();
            if(r < d )
                sr.add(r + n);
            else
                sd.add(d + n);
        }

        return sr.size() > sd.size() ?  "Radiant" : "Dire";
    }
}