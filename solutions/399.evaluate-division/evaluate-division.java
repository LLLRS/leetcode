class Solution {
    public static boolean flag = false;
    public static  double[] calcEquation(String[][] equations, double[] values, String[][] queries) {

        HashMap<String,HashMap<String,Double>> hm = new HashMap<>();
        double[] res = new double[queries.length];

        for(int i=0;i<equations.length;i++){
            String a = equations[i][0];
            String b = equations[i][1];
            double d = values[i];

            HashMap<String,Double> h1 = hm.getOrDefault(a,new HashMap<>());
            HashMap<String,Double> h2 = hm.getOrDefault(b,new HashMap<>());
            h1.put(b,1/d);
            h2.put(a,d);

            hm.put(a,h1);
            hm.put(b,h2);
        }

        for(int i=0;i<queries.length;i++){
            String[] t = queries[i];
            res[i] =  -1.0;
            if(hm.containsKey(t[0]) && hm.containsKey(t[1])){

                flag = true;
                dfs(hm,t[1],t[0],res,i,1,new HashSet<String>());
            }
        }

        return res;
    }

    private static void dfs(HashMap<String, HashMap<String, Double>> hm, String from, String to, double[] res, int t,double cnt,HashSet<String> visited) {

        if(from.equals(to)){
            res[t] = cnt;
            flag = false;
            return;
        }
        visited.add(from);
        HashMap<String, Double> s = hm.get(from);

        for(String st : s.keySet()){
            if(visited.contains(st)) continue;

            visited.add(st);
            if(flag)
                dfs(hm,st,to,res,t,cnt * s.get(st),visited);

            visited.remove(st);
        }
    }
}