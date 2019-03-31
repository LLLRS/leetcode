class Solution {
/*Disscuss上看到的一个答案，思路非常牛逼。
*设P为正子集，N为负子集
*例如：
*给定nums = [1,2,3,4,5]和target = 3，那么一个可能的解决方案是+ 1-2 + 3-4 + 5 = 3
*这里的正子集是P = [1,3,5]，负子集是N = [2,4]
*
*推理过程如下：
*       sum（P） - sum（N）= target
*       sum（P）+ sum（N）+ sum（P） - sum（N）= target + sum（P）+ sum（N）
*       2 * sum（P）= target + sum（nums）

所以原来的问题已被转换为子集和问题如下：
    找到num的子集P，使得sum（P）=（target + sum（nums）)/ 2
**/
    
    public int findTargetSumWays(int[] nums, int tar) {
        if(nums.length==0)  return 0;
        
        int sum = 0;
        for(int n:nums)
            sum += n;
        
        return sum<tar||(sum+tar)%2>0 ?0:pAux(nums,(sum+tar)/2);
      
    }
    
   private int pAux(int[] nums,int tar){
       
       int[] res = new int [tar+1];
       res[0] = 1;
       
       for(int n:nums)       
           for(int i=tar;i>=n;i--){
               res[i]  += res[i-n];
           }
    
        return res[tar];
    }
}