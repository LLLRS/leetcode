class Solution {
    public String validIPAddress(String IP) {
        if(IP == null)
            return "Neither";


        if( iSV4OrV6(IP))
            return iSV4(IP);
        else
            return iSV6(IP);
    }

    //true ipv4 false ipv6
    private boolean iSV4OrV6(String s){
        for(char t : s.toCharArray())
            if(t!='.' && !Character.isDigit(t))
                return false;

        return true;
    }

    private String iSV4(String s){
        if(s.length()<7 || s.length()>15 || s.charAt(0)=='.'|| s.charAt(s.length()-1)=='.')
            return "Neither";
        
        String[] t = s.split("\\.");
        if(t.length != 4)
            return "Neither";
        for(String x : t){
            if(x.length() == 0 ||(x.length()>1 && x.startsWith("0")) ||
                Integer.valueOf(x) >= 256)
                return "Neither";
        }

        return "IPv4";
    }

    private String iSV6(String s){

        if(s.length()<15 || s.length()>39 || s.charAt(0)==':'|| s.charAt(s.length()-1)==':')
            return "Neither";
        
        String[] t = s.split(":");
        if(t.length != 8)
            return "Neither";

        for(String x : t){
            if(x.length() <= 0 || x.length()>4 )
                return "Neither";
            
            for(char c: x.toCharArray()) {
                boolean isDigit = c>=48 && c<=57;
                boolean isUppercaseAF = c>=65 && c<=70;
                boolean isLowerCaseAF = c>=97 && c<=102;
                if(!(isDigit || isUppercaseAF || isLowerCaseAF))
                    return "Neither";
            }
        }

        return "IPv6";
    }
}
