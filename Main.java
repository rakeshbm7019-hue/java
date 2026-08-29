import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);
        
        st.nextToken();
        int n = (int) st.nval;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            st.nextToken();
            a[i] = (int) st.nval;
        }
        
        st.nextToken();
        int m = (int) st.nval;
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            st.nextToken();
            b[i] = (int) st.nval;
        }
        
        Arrays.sort(b); // sort B into ascending order regardless of input order
        
        int i = 0, j = 0;
        boolean first = true;
        StringBuilder out = new StringBuilder();
        
        while (i < n && j < m) {
            if (a[i] < b[j]) {
                i++;
            } else if (a[i] > b[j]) {
                j++;
            } else {
                if (!first) {
                    out.append(" ");
                }
                out.append(a[i]);
                first = false;
                i++;
                j++;
            }
        }
        
        System.out.println(out.toString());
    }
}