import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        s = s.replaceAll("c=|c-|d-|s=|z=|dz=|lj|nj", "z");
        System.out.println(s.length());
    }
}