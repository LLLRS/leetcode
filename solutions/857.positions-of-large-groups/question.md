In a string&nbsp;S&nbsp;of lowercase letters, these letters form consecutive groups of the same character.

For example, a string like S = &quot;abbxxxxzyy&quot; has the groups &quot;a&quot;, &quot;bb&quot;, &quot;xxxx&quot;, &quot;z&quot; and&nbsp;&quot;yy&quot;.

Call a group large if it has 3 or more characters.&nbsp; We would like the starting and ending positions of every large group.

The final answer should be in lexicographic order.

&nbsp;

Example 1:


Input: &quot;abbxxxxzzy&quot;
Output: [[3,6]]
Explanation: &quot;xxxx&quot; is the single large group with starting  3 and ending positions 6.


Example 2:


Input: &quot;abc&quot;
Output: []
Explanation: We have &quot;a&quot;,&quot;b&quot; and &quot;c&quot; but no large group.


Example 3:


Input: &quot;abcdddeeeeaabbbcd&quot;
Output: [[3,5],[6,9],[12,14]]

&nbsp;

Note:&nbsp;&nbsp;1 &lt;= S.length &lt;= 1000
