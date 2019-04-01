// 这种文件路径表示的特点是当前一个文件内容表示完，才会继续表示下一个文件夹

class Solution {
    public int lengthLongestPath(String input) {
       
        String[] path = input.split("\n");
        int[] nums = new int[path.length + 1];
        int res = 0;
        
        for(String s : path){
            int t = s.lastIndexOf("\t") + 1; // "\t"的数量
            nums[t + 1] = nums[t] + s.length() - t + 1;
            
            if(s.contains(".")) 
                res = Math.max(res, nums[t + 1]-1);
        }
        
        return res;
    }
}