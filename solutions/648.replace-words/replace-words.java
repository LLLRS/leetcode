    class Solution {
        public String replaceWords(List<String> dict, String sentence) {

            StringBuilder sb = new StringBuilder();

            TreeSet<String> ts = new TreeSet<>();
            int min = 1000;
            for(String t : dict){
                ts.add(t);
                if(t.length() < min) min = t.length();
            }
                

            String[] sm = sentence.split(" ");
            for(int i=0;i<sm.length;i++)
                sb.append(getString(ts,sm[i],min)).append(" ");

            sb.setLength(sb.length()-1);
            return sb.toString();
        }

        private String getString(TreeSet<String> ts,String s,int sta){

            for(int i = sta;i<s.length();i++){
                String t = s.substring(0,i);
                if(ts.contains(t))
                    return t;
            }

            return s;
        }
    }