package _6Companies30Days;

/* Ugly numbers are numbers whose only prime factors are 2, 3 or 5. 
The sequence 1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 15, … shows the first 11 ugly numbers. 
By convention, 1 is included. Write a program to find Nth Ugly Number.
*/

import java.util.*;
public class uglyNumbers {
    long getNthUglyNo(int n) {
        // code here
    SortedSet<Long> next = new TreeSet<Long>();
    next.add((long) 1);

    long cur = 0;
    for (int i = 0; i < n; ++i) {
        cur = next.first();

        next.add(cur * 2);
        next.add(cur * 3);
        next.add(cur * 5);
        next.remove(cur);
    }
    return cur;
    }
}
