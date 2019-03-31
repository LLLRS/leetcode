Your friend is typing his name&nbsp;into a keyboard.&nbsp; Sometimes, when typing a character c, the key might get long pressed, and the character will be typed 1 or more times.

You examine the typed&nbsp;characters of the keyboard.&nbsp; Return True if it is possible that it was your friends name, with some characters (possibly none) being long pressed.

&nbsp;

Example 1:


Input: name = &quot;alex&quot;, typed = &quot;aaleex&quot;
Output: true
Explanation: 'a' and 'e' in 'alex' were long pressed.



Example 2:


Input: name = &quot;saeed&quot;, typed = &quot;ssaaedd&quot;
Output: false
Explanation: 'e' must have been pressed twice, but it wasn't in the typed output.



Example 3:


Input: name = &quot;leelee&quot;, typed = &quot;lleeelee&quot;
Output: true



Example 4:


Input: name = &quot;laiden&quot;, typed = &quot;laiden&quot;
Output: true
Explanation: It's not necessary to long press any character.


&nbsp;




Note:


	name.length &lt;= 1000
	typed.length &lt;= 1000
	The characters of name and typed are lowercase letters.



&nbsp;



&nbsp;


