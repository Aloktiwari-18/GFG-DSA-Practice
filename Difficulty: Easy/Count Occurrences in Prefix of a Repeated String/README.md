<h2><a href="https://www.geeksforgeeks.org/problems/aryas-long-string5840/1">Count Occurrences in Prefix of a Repeated String</a></h2><h3>Difficulty Level : Difficulty: Easy</h3><hr><div class="problems_problem_content__Xm_eO" style="--text-color: var(--problem-text-color);"><p><span style="font-size: 14pt;">Given a string <strong>s</strong> of uppercase English letters, a character <strong>c</strong>, and an integer <strong>n</strong>, find the number of occurrences of c in the first n characters of s repeated indefinitely.</span></p>
<p><strong><span style="font-size: 18px;">Examples:</span></strong></p>
<pre><span style="font-size: 14pt;"><strong>Input:</strong> s = "ABA", n = 7, c = 'B'<strong>
Output: </strong>2<strong>
Explanation:</strong> Repeating s gives "ABAABAABA...", and the first 7 characters are "ABAABAA", which contains 2 occurrences of 'B'.</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>s = "DDD", n = 4, c = 'D'<strong>
Output: </strong>4<strong>
Explanation: </strong>Repeating s gives "DDDDDD...", and the first 4 characters are "DDDD", which contains 4 occurrences of 'D'.</span></pre>
<p><span style="font-size: 14pt;"><strong>Constraints</strong>:<br>1 ≤ s.size() ≤ 10<sup>5</sup><br>1 ≤ n ≤ 10<sup>9</sup></span></p></div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Strings</code>&nbsp;