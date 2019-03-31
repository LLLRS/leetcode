Given a 2D board and a list of words from the dictionary, find all words in the board.

Each word must be constructed from letters of sequentially adjacent cell, where &quot;adjacent&quot; cells are those horizontally or vertically neighboring. The same letter cell may not be used more than once in a word.

Example:


Input: 
words = [&quot;oath&quot;,&quot;pea&quot;,&quot;eat&quot;,&quot;rain&quot;] and board =
[
  [&#39;o&#39;,&#39;a&#39;,&#39;a&#39;,&#39;n&#39;],
  [&#39;e&#39;,&#39;t&#39;,&#39;a&#39;,&#39;e&#39;],
  [&#39;i&#39;,&#39;h&#39;,&#39;k&#39;,&#39;r&#39;],
  [&#39;i&#39;,&#39;f&#39;,&#39;l&#39;,&#39;v&#39;]
]

Output:&nbsp;[&quot;eat&quot;,&quot;oath&quot;]


Note:
You may assume that all inputs are consist of lowercase letters a-z.