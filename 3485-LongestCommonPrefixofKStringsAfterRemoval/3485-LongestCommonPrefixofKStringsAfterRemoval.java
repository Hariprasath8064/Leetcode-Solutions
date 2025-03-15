class Solution {
    class T {
        T[] a = new T[26];
        int c, idx, d;
    }
    T r;
    void f(T x, int d, java.util.List<T> L) {
        x.d = d;
        x.idx = L.size();
        L.add(x);
        for (int i = 0; i < 26; i++) {
            if (x.a[i] != null) f(x.a[i], d + 1, L);
        }
    }
    class ST {
        int n;
        int[] t;
        ST(int n, int[] a) {
            this.n = n;
            t = new int[2 * n];
            for (int i = 0; i < n; i++) t[n + i] = a[i];
            for (int i = n - 1; i > 0; i--) t[i] = Math.max(t[2 * i], t[2 * i + 1]);
        }
        void u(int i, int v) {
            i += n;
            t[i] = v;
            for (i /= 2; i > 0; i /= 2) t[i] = Math.max(t[2 * i], t[2 * i + 1]);
        }
        int q() {
            return t[1];
        }
    }
    public int[] longestCommonPrefix(String[] s, int k) {
        int n = s.length;
        int[] res = new int[n];
        if (n - 1 < k) {
            for (int i = 0; i < n; i++) res[i] = 0;
            return res;
        }
        r = new T();
        for (String w : s) {
            T cur = r;
            cur.c++;
            for (char ch : w.toCharArray()) {
                int j = ch - 'a';
                if (cur.a[j] == null) cur.a[j] = new T();
                cur = cur.a[j];
                cur.c++;
            }
        }
        java.util.List<T> L = new java.util.ArrayList<>();
        f(r, 0, L);
        int m = L.size();
        int[] a = new int[m];
        for (T x : L) a[x.idx] = x.c >= k ? x.d : -1;
        ST st = new ST(m, a);
        for (int i = 0; i < n; i++) {
            T cur = r;
            java.util.List<T> p = new java.util.ArrayList<>();
            p.add(r);
            for (char ch : s[i].toCharArray()) {
                cur = cur.a[ch - 'a'];
                p.add(cur);
            }
            for (T x : p) {
                int nv = x.c - 1 >= k ? x.d : -1;
                st.u(x.idx, nv);
            }
            res[i] = st.q();
            for (T x : p) {
                int ov = x.c >= k ? x.d : -1;
                st.u(x.idx, ov);
            }
        }
        return res;
    }
}
