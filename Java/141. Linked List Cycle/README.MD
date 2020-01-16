<h1 class="title__20p2"><a href="https://leetcode-cn.com/problems/linked-list-cycle/">141. Linked List Cycle</a></h1>

<div class="notranslate"><p>Given a linked list, determine if it has a cycle in it.</p>

<p>To represent a cycle in the given linked list, we use an integer <code>pos</code> which represents the position (0-indexed)&nbsp;in the linked list where tail connects to. If <code>pos</code> is <code>-1</code>, then there is no cycle in the linked list.</p>

<p>&nbsp;</p>

<div>
<p><strong>Example 1:</strong></p>

<pre><strong>Input: </strong>head = <span id="example-input-1-1">[3,2,0,-4]</span>, pos = <span id="example-input-1-2">1</span>
<strong>Output: </strong><span id="example-output-1">true
<strong>Explanation:</strong> There is a cycle in the linked list, where tail connects to the second node.</span>
</pre>
</div>

<div>
<p><span><img style="width: 300px; height: 97px; margin-top: 8px; margin-bottom: 8px;" src="https://assets.leetcode.com/uploads/2018/12/07/circularlinkedlist.png" alt=""></span></p>

<p><strong>Example 2:</strong></p>

<pre><strong>Input: </strong>head = <span id="example-input-1-1">[1,2]</span>, pos = <span id="example-input-1-2">0</span>
<strong>Output: </strong><span id="example-output-1">true
<strong>Explanation:</strong> There is a cycle in the linked list, where tail connects to the first node.</span>
</pre>
</div>

<div>
<p><span><img style="width: 141px; height: 74px;" src="https://assets.leetcode.com/uploads/2018/12/07/circularlinkedlist_test2.png" alt=""></span></p>

<p><strong>Example 3:</strong></p>

<pre><strong>Input: </strong>head = <span id="example-input-1-1">[1]</span>, pos = <span id="example-input-1-2">-1</span>
<strong>Output: </strong><span id="example-output-1">false
<strong>Explanation:</strong> There is no cycle in the linked list.</span>
</pre>
</div>

<p><span><img style="width: 45px; height: 45px;" src="https://assets.leetcode.com/uploads/2018/12/07/circularlinkedlist_test3.png" alt=""></span></p>

<p>&nbsp;</p>

<p><strong>Follow up:</strong></p>

<p>Can you solve it using <em>O(1)</em> (i.e. constant) memory?</p>
</div>