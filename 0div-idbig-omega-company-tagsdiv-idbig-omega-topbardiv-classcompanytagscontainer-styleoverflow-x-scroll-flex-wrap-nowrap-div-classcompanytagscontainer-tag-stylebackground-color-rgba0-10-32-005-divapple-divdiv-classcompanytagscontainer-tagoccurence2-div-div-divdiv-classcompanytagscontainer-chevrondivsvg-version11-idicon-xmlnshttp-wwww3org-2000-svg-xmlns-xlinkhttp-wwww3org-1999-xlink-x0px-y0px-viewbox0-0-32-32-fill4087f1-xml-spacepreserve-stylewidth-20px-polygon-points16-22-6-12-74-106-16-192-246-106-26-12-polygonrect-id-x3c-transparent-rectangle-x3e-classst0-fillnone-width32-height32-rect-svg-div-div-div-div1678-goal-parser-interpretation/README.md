<h2><a href="https://leetcode.com/problems/goal-parser-interpretation/"><div id="big-omega-company-tags"><div id="big-omega-topbar"><div class="companyTagsContainer" style="overflow-x: scroll; flex-wrap: nowrap;"><div class="companyTagsContainer--tag" style="background-color: rgba(0, 10, 32, 0.05);"><div>Apple</div><div class="companyTagsContainer--tagOccurence">2</div></div></div><div class="companyTagsContainer--chevron"><div><svg version="1.1" id="icon" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" x="0px" y="0px" viewBox="0 0 32 32" fill="#4087F1" xml:space="preserve" style="width: 20px;"><polygon points="16,22 6,12 7.4,10.6 16,19.2 24.6,10.6 26,12 "></polygon><rect id="_x3C_Transparent_Rectangle_x3E_" class="st0" fill="none" width="32" height="32"></rect></svg></div></div></div></div>1678. Goal Parser Interpretation</a></h2><h3>Easy</h3><hr><div><p>You own a <strong>Goal Parser</strong> that can interpret a string <code>command</code>. The <code>command</code> consists of an alphabet of <code>"G"</code>, <code>"()"</code> and/or <code>"(al)"</code> in some order. The Goal Parser will interpret <code>"G"</code> as the string <code>"G"</code>, <code>"()"</code> as the string <code>"o"</code>, and <code>"(al)"</code> as the string <code>"al"</code>. The interpreted strings are then concatenated in the original order.</p>

<p>Given the string <code>command</code>, return <em>the <strong>Goal Parser</strong>'s interpretation of </em><code>command</code>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> command = "G()(al)"
<strong>Output:</strong> "Goal"
<strong>Explanation:</strong>&nbsp;The Goal Parser interprets the command as follows:
G -&gt; G
() -&gt; o
(al) -&gt; al
The final concatenated result is "Goal".
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> command = "G()()()()(al)"
<strong>Output:</strong> "Gooooal"
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre><strong>Input:</strong> command = "(al)G(al)()()G"
<strong>Output:</strong> "alGalooG"
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= command.length &lt;= 100</code></li>
	<li><code>command</code> consists of <code>"G"</code>, <code>"()"</code>, and/or <code>"(al)"</code> in some order.</li>
</ul>
</div>