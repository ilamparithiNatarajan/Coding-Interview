package samples;

import java.util.Iterator;
import java.util.Stack;

public class ProperlyNested {
    // you can also use imports, for example:

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

    class Solution {
        public int solution(String S) {
            String start = "{[(";
            Stack<Character> st = new Stack<>();
            for (int i = 0; i < S.length(); i++) {
                if (start.indexOf(S.charAt(i)) == 0) {
                    st.push('}');
                } else if (start.indexOf(S.charAt(i)) == 1) {
                    st.push(']');
                } else if (start.indexOf(S.charAt(i)) == 2) {
                    st.push(')');
                } else {
                    Iterator<Character> it = st.iterator();
                    boolean cont = false;
                    while (it.hasNext()) {
                        if (S.charAt(i) == it.next()) {
                            st.pop();
                            cont = true;
                            break;
                        }
                    }
                    if (!cont) {
                        return 0;
                    }

                }
            }
            if (!st.empty()) {
                return 0;
            }
            return 1;
        }
    }
}
