class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<nums1.length;i++)
            hs.add(nums1[i]);;

        HashSet<Integer> t = new HashSet<>();
        for(int i=0;i<nums2.length;i++)
            if(hs.contains(nums2[i]) && !t.contains(nums2[i]))
                t.add(nums2[i]);

        int[] res = new int[t.size()];
        Iterator<Integer> it = t.iterator();
        int k = 0;
        while(it.hasNext())
            res[k++] = it.next();

        return res;
    }
}