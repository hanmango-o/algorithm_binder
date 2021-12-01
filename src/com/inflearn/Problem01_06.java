/**
 * 인프런 알고리즘
 * @see https://cote.inflearn.com/contest/10/problem/01-06
 * @author hanmango-o
 */
package com.inflearn;

import java.util.*;

public class Problem01_06 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        String s = stdIn.next();
        String result = "";

        for(int i = 0; i < s.length(); i++) {
            if(s.indexOf(s.charAt(i)) == i)
                result += s.charAt(i);
        }

        System.out.println(result);
    }
}
