Create a timebased key-value store class&nbsp;TimeMap, that supports two operations.

1. set(string key, string value, int timestamp)


	Stores the key and value, along with the given timestamp.


2. get(string key, int timestamp)


	Returns a value such that set(key, value, timestamp_prev) was called previously, with timestamp_prev &lt;= timestamp.
	If there are multiple such values, it returns the one with the largest timestamp_prev.
	If there are no values, it returns the empty string (&quot;&quot;).


&nbsp;


Example 1:


Input: inputs = [&quot;TimeMap&quot;,&quot;set&quot;,&quot;get&quot;,&quot;get&quot;,&quot;set&quot;,&quot;get&quot;,&quot;get&quot;], inputs = [[],[&quot;foo&quot;,&quot;bar&quot;,1],[&quot;foo&quot;,1],[&quot;foo&quot;,3],[&quot;foo&quot;,&quot;bar2&quot;,4],[&quot;foo&quot;,4],[&quot;foo&quot;,5]]
Output: [null,null,&quot;bar&quot;,&quot;bar&quot;,null,&quot;bar2&quot;,&quot;bar2&quot;]
Explanation: &nbsp; 
TimeMap kv; &nbsp; 
kv.set(&quot;foo&quot;, &quot;bar&quot;, 1); // store the key &quot;foo&quot; and value &quot;bar&quot; along with timestamp = 1 &nbsp; 
kv.get(&quot;foo&quot;, 1);  // output &quot;bar&quot; &nbsp; 
kv.get(&quot;foo&quot;, 3); // output &quot;bar&quot; since there is no value corresponding to foo at timestamp 3 and timestamp 2, then the only value is at timestamp 1 ie &quot;bar&quot; &nbsp; 
kv.set(&quot;foo&quot;, &quot;bar2&quot;, 4); &nbsp; 
kv.get(&quot;foo&quot;, 4); // output &quot;bar2&quot; &nbsp; 
kv.get(&quot;foo&quot;, 5); //output &quot;bar2&quot; &nbsp; 




Example 2:


Input: inputs = [&quot;TimeMap&quot;,&quot;set&quot;,&quot;set&quot;,&quot;get&quot;,&quot;get&quot;,&quot;get&quot;,&quot;get&quot;,&quot;get&quot;], inputs = [[],[&quot;love&quot;,&quot;high&quot;,10],[&quot;love&quot;,&quot;low&quot;,20],[&quot;love&quot;,5],[&quot;love&quot;,10],[&quot;love&quot;,15],[&quot;love&quot;,20],[&quot;love&quot;,25]]
Output: [null,null,null,&quot;&quot;,&quot;high&quot;,&quot;high&quot;,&quot;low&quot;,&quot;low&quot;]




&nbsp;

Note:


	All key/value strings are lowercase.
	All key/value strings have&nbsp;length in the range&nbsp;[1, 100]
	The timestamps for all TimeMap.set operations are strictly increasing.
	1 &lt;= timestamp &lt;= 10^7
	TimeMap.set and TimeMap.get&nbsp;functions will be called a total of 120000 times (combined) per test case.

