Design a data structure that supports the following two operations:


void addWord(word)
bool search(word)


search(word) can search a literal word or a regular expression string containing only letters a-z or .. A . means it can represent any one letter.

Example:


addWord(&quot;bad&quot;)
addWord(&quot;dad&quot;)
addWord(&quot;mad&quot;)
search(&quot;pad&quot;) -&gt; false
search(&quot;bad&quot;) -&gt; true
search(&quot;.ad&quot;) -&gt; true
search(&quot;b..&quot;) -&gt; true


Note:
You may assume that all words are consist of lowercase letters a-z.
