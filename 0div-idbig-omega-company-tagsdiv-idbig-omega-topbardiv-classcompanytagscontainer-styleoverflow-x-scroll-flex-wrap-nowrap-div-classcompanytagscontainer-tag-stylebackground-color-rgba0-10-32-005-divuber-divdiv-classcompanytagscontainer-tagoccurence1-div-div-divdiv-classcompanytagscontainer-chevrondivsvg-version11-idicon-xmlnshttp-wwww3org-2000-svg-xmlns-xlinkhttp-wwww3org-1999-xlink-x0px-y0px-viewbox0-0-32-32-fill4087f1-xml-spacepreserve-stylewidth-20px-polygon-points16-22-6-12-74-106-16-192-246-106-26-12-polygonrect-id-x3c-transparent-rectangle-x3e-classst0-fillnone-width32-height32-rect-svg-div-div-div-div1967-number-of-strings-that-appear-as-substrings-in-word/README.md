<h2><a href="https://leetcode.com/problems/number-of-strings-that-appear-as-substrings-in-word/"><div id="big-omega-company-tags"><div id="big-omega-topbar"><div class="companyTagsContainer" style="overflow-x: scroll; flex-wrap: nowrap;"><div class="companyTagsContainer--tag" style="background-color: rgba(0, 10, 32, 0.05);"><div>Uber</div><div class="companyTagsContainer--tagOccurence">1</div></div></div><div class="companyTagsContainer--chevron"><div><svg version="1.1" id="icon" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" x="0px" y="0px" viewBox="0 0 32 32" fill="#4087F1" xml:space="preserve" style="width: 20px;"><polygon points="16,22 6,12 7.4,10.6 16,19.2 24.6,10.6 26,12 "></polygon><rect id="_x3C_Transparent_Rectangle_x3E_" class="st0" fill="none" width="32" height="32"></rect></svg></div></div></div></div>1967. Number of Strings That Appear as Substrings in Word</a></h2><h3>Easy</h3><hr><div><p>Given an array of strings <code>patterns</code> and a string <code>word</code>, return <em>the <strong>number</strong> of strings in </em><code>patterns</code><em> that exist as a <strong>substring</strong> in </em><code>word</code>.</p>

<p>A <strong>substring</strong> is a contiguous sequence of characters within a string.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> patterns = ["a","abc","bc","d"], word = "abc"
<strong>Output:</strong> 3
<strong>Explanation:</strong>
- "a" appears as a substring in "<u>a</u>bc".
- "abc" appears as a substring in "<u>abc</u>".
- "bc" appears as a substring in "a<u>bc</u>".
- "d" does not appear as a substring in "abc".
3 of the strings in patterns appear as a substring in word.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> patterns = ["a","b","c"], word = "aaaaabbbbb"
<strong>Output:</strong> 2
<strong>Explanation:</strong>
- "a" appears as a substring in "a<u>a</u>aaabbbbb".
- "b" appears as a substring in "aaaaabbbb<u>b</u>".
- "c" does not appear as a substring in "aaaaabbbbb".
2 of the strings in patterns appear as a substring in word.
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre><strong>Input:</strong> patterns = ["a","a","a"], word = "ab"
<strong>Output:</strong> 3
<strong>Explanation:</strong> Each of the patterns appears as a substring in word "<u>a</u>b".
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= patterns.length &lt;= 100</code></li>
	<li><code>1 &lt;= patterns[i].length &lt;= 100</code></li>
	<li><code>1 &lt;= word.length &lt;= 100</code></li>
	<li><code>patterns[i]</code> and <code>word</code> consist of lowercase English letters.</li>
</ul>
</div>