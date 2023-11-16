import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static StringBuilder sb1 = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String in = br.readLine();
        String[] data = in.split(" ");
        for (int i = 1; i < data.length; i++)
            getParam(data[0], data[i]);
        System.out.println(sb1.toString());
    }

    public static void getParam(String type, String str) {
        String out = "";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char cur = str.charAt(i);
            if (cur == '*' || cur == '&')
                sb.append(cur);
            else if (cur == '[')
                sb.append(']');
            else if (cur == ']')
                sb.append('[');
            else if (('A' <= cur && cur <= 'Z') || ('a' <= cur && cur <= 'z'))
                out += str.charAt(i);
        }

        sb1.append(type + sb.reverse() + " ").append(out + ";\n");
    }
}