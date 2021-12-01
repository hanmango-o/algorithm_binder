/**
 * 인프런 알고리즘
 * @see https://cote.inflearn.com/contest/10/problem/01-05
 * @author hanmango-o
 */
package com.inflearn;

import java.util.*;

public class Problem01_05 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        String str = stdIn.next();

        char[] c = str.toCharArray();
        ArrayList k = new ArrayList();

        for(char x : c) {
            if(Character.isAlphabetic(x)) {
                k.add(0, x);
            }
        }

        for(int i = 0, j = 0; i < c.length; i++) {
            if(Character.isAlphabetic(c[i])) {
                c[i] = ((char) k.toArray()[j++]);
            }
        }

        System.out.println(String.valueOf(c));
    }
}
