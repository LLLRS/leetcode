class Solution {
    public int findUnsortedSubarray(int[] nums) {

        int n = nums.length;
        int l = n,r = 0;
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<n;i++){
            while(!st.empty() && nums[st.peek()] > nums[i])
                l = Math.min(l,st.pop());

            st.push(i);
        }

        st.clear();
        for(int i=n-1;i>=0;i--){
            while(!st.empty() && nums[st.peek()] < nums[i])
                r = Math.max(r,st.pop());

            st.push(i);
        }

        return r - l > 0 ? r - l + 1 : 0;
    }
}