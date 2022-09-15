import java.util.*;

public class homework2 {
    public static void main(String[] args) {
        String ls = "(()())(())";
        System.out.println(ls);
        System.out.println(deleteFirstAndOut(ls));
    }

    public static String deleteFirstAndOut(String str) {
        ArrayList<String> list = new ArrayList(Arrays.asList(str.split("")));
        // counter = 0;
        String result = "";
        list.remove(0);
        list.remove(list.size() - 1);
        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i).equals("(") && list.get(i+1).equals(")")) result+= "()";
        }

        return result;
    }
}