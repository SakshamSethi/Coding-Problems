<h2><a href="https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/"><div id="big-omega-company-tags"><div id="big-omega-topbar"><div class="companyTagsContainer" style="overflow-x: scroll; flex-wrap: nowrap;"><div class="companyTagsContainer--tag" style="background-color: rgba(0, 10, 32, 0.05);"><div>Google</div><div class="companyTagsContainer--tagOccurence">2</div></div></div><div class="companyTagsContainer--chevron"><div><svg version="1.1" id="icon" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" x="0px" y="0px" viewBox="0 0 32 32" fill="#4087F1" xml:space="preserve" style="width: 20px;"><polygon points="16,22 6,12 7.4,10.6 16,19.2 24.6,10.6 26,12 "></polygon><rect id="_x3C_Transparent_Rectangle_x3E_" class="st0" fill="none" width="32" height="32"></rect></svg></div></div></div></div>1252. Cells with Odd Values in a Matrix</a></h2><h3>Easy</h3><hr><div><p>There is an <code>m x n</code> matrix that is initialized to all <code>0</code>'s. There is also a 2D array <code>indices</code> where each <code>indices[i] = [r<sub>i</sub>, c<sub>i</sub>]</code> represents a <strong>0-indexed location</strong> to perform some increment operations on the matrix.</p>

<p>For each location <code>indices[i]</code>, do <strong>both</strong> of the following:</p>

<ol>
	<li>Increment <strong>all</strong> the cells on row <code>r<sub>i</sub></code>.</li>
	<li>Increment <strong>all</strong> the cells on column <code>c<sub>i</sub></code>.</li>
</ol>

<p>Given <code>m</code>, <code>n</code>, and <code>indices</code>, return <em>the <strong>number of odd-valued cells</strong> in the matrix after applying the increment to all locations in </em><code>indices</code>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2019/10/30/e1.png" style="width: 600px; height: 118px;">
<pre><strong>Input:</strong> m = 2, n = 3, indices = [[0,1],[1,1]]
<strong>Output:</strong> 6
<strong>Explanation:</strong> Initial matrix = [[0,0,0],[0,0,0]].
After applying first increment it becomes [[1,2,1],[0,1,0]].
The final matrix is [[1,3,1],[1,3,1]], which contains 6 odd numbers.
</pre>

<p><strong class="example">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2019/10/30/e2.png" style="width: 600px; height: 150px;">
<pre><strong>Input:</strong> m = 2, n = 2, indices = [[1,1],[0,0]]
<strong>Output:</strong> 0
<strong>Explanation:</strong> Final matrix = [[2,2],[2,2]]. There are no odd numbers in the final matrix.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= m, n &lt;= 50</code></li>
	<li><code>1 &lt;= indices.length &lt;= 100</code></li>
	<li><code>0 &lt;= r<sub>i</sub> &lt; m</code></li>
	<li><code>0 &lt;= c<sub>i</sub> &lt; n</code></li>
</ul>

<p>&nbsp;</p>
<p><strong>Follow up:</strong> Could you solve this in <code>O(n + m + indices.length)</code> time with only <code>O(n + m)</code> extra space?</p>
</div>