<h2><a href="https://leetcode.com/problems/sorting-the-sentence/"><div id="big-omega-company-tags"><div id="big-omega-topbar"><div class="companyTagsContainer" style="overflow-x: scroll; flex-wrap: nowrap;"><div class="companyTagsContainer--tag" style="background-color: rgba(0, 10, 32, 0.05);"><div>Google</div><div class="companyTagsContainer--tagOccurence">2</div></div><div class="companyTagsContainer--tag" style="background-color: rgba(0, 10, 32, 0.05);"><div>Adobe</div><div class="companyTagsContainer--tagOccurence">2</div></div></div><div class="companyTagsContainer--chevron"><div><svg version="1.1" id="icon" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" x="0px" y="0px" viewBox="0 0 32 32" fill="#4087F1" xml:space="preserve" style="width: 20px;"><polygon points="16,22 6,12 7.4,10.6 16,19.2 24.6,10.6 26,12 "></polygon><rect id="_x3C_Transparent_Rectangle_x3E_" class="st0" fill="none" width="32" height="32"></rect></svg></div></div></div></div>1859. Sorting the Sentence</a></h2><h3>Easy</h3><hr><div><p>A <strong>sentence</strong> is a list of words that are separated by a single space with no leading or trailing spaces. Each word consists of lowercase and uppercase English letters.</p>

<p>A sentence can be <strong>shuffled</strong> by appending the <strong>1-indexed word position</strong> to each word then rearranging the words in the sentence.</p>

<ul>
	<li>For example, the sentence <code>"This is a sentence"</code> can be shuffled as <code>"sentence4 a3 is2 This1"</code> or <code>"is2 sentence4 This1 a3"</code>.</li>
</ul>

<p>Given a <strong>shuffled sentence</strong> <code>s</code> containing no more than <code>9</code> words, reconstruct and return <em>the original sentence</em>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> s = "is2 sentence4 This1 a3"
<strong>Output:</strong> "This is a sentence"
<strong>Explanation:</strong> Sort the words in s to their original positions "This1 is2 a3 sentence4", then remove the numbers.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> s = "Myself2 Me1 I4 and3"
<strong>Output:</strong> "Me Myself and I"
<strong>Explanation:</strong> Sort the words in s to their original positions "Me1 Myself2 and3 I4", then remove the numbers.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>2 &lt;= s.length &lt;= 200</code></li>
	<li><code>s</code> consists of lowercase and uppercase English letters, spaces, and digits from <code>1</code> to <code>9</code>.</li>
	<li>The number of words in <code>s</code> is between <code>1</code> and <code>9</code>.</li>
	<li>The words in <code>s</code> are separated by a single space.</li>
	<li><code>s</code> contains no leading or trailing spaces.</li>
</ul></div>