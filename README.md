# Stopwatch tasks by Patinya Yongyai (5710547204)

I ran the tasks on a MacBook Pro, and got
these results:

Task                                           | Time
-----------------------------------------------|-------:
Append 50,000 chars to String                  | 0.789411 sec
Append 100,000 chars to String                 | 2.517652 sec
Append 100,000 chars to StringBuilder          | 0.002239 sec
Add 1 billion double primitives from an array  | 1.361521 sec
Add 1 billion double objects from an array     | 4.265782 sec
Add 1 billion BigDecimal objects from an array | 8.032483 sec

## Explanation of Results

Appending 100,000 chars to a String take more than 2X the time to append 50,000
chars because string are immutable. Every time you write "+=", a new String is created. So it will consume memory (new string instance!) and time (copy the old string + new chars of the other string). This means the way you build up your string is in the worst case, O(n^2).

Appending to StringBuilder so much different than appending to String because StringBuilder are implemented as a mutable sequence of characters. This means that as you append new Strings or chars onto a StringBuilder, it simply updates its internal array to reflect the changes you've made. This means that new memory is only allocated when the string grows past the buffer already existing in a StringBuilder.

In time to sum double, Double, and BigDecimal, I got double primitives is the fastest. For the second is double object. The last is BigDecimal object.

Double object slower than double primitives because the value of double objects is wrapped inside an object which needs allocation, deallocation, memory management plus getters and setters.

BigDecimal slower than double primitives and double objects because they are defined as lopping off as much precision as is necessary in any calculation so as to yield a result which will fit in the same size of container as the original operands. This enables them to use fixed-size containers, and not have to worry about succeeding operations becoming progressively slower.
