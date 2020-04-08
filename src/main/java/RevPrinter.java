import java.util.Stack;
import java.util.concurrent.ConcurrentLinkedDeque;

public class RevPrinter {
    public static void main(String[] args) {
        String s = "i.like.this.program.very.much";
        String[] wordsList = s.split("[.]");
        ConcurrentLinkedDeque<String> st = new ConcurrentLinkedDeque<>();
        for (String i : wordsList) {
            st.push(i);
        }
        StringBuffer outPut = new StringBuffer("");
        for (String o : st) {
            String val = st.pop();
            outPut.append(val).append(".");
        }
        System.out.println("Output is ->> "+outPut.reverse().replace(0,1,"").reverse());
    }

}
