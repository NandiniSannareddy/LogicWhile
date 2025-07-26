
public class JavaStrings {
    public static void main(String[] args) {
        /*
         * String str = "java";
         * str = str.concat(" program");
         * System.out.println(str);
         */

        /*
         * String str = "Nandini";
         * 
         * System.out.println("Original String: " + str);
         * System.out.println("Lenght: " + str.length());
         * System.out.println("CharAt(1): " + str.charAt(1));
         * System.out.println("substring(2): " + str.substring(2));
         * System.out.println("Substring(2, 7): " + str.substring(2, 7));
         * System.out.println("toLowerCase(): " + str.toLowerCase());
         * System.out.println("toUpperCase(): " + str.toUpperCase());
         * String temp = "  Nandini  ";
         * System.out.println("trim(): " + temp.trim());
         * System.out.println("Equals: " + str.equals(temp));
         * System.out.println("equalsIgnoreCase(): " + str.equalsIgnoreCase(temp));
         * String dup = "Nandini";
         * System.out.println("equals(): " + str.equals(dup));
         * System.out.println("equalsIgnoreCase(): " + str.equalsIgnoreCase(dup));
         * System.out.println("compareTo(): " + str.compareTo(dup));
         * System.out.println("contains(): " + str.contains("Nad"));
         * System.out.println("replace(): " + str.replace('i', '*'));
         * String[] parts = str.trim().split("");
         * String p = "N1a1n1d1i1n1i";
         * String[] x = p.split("1");
         * for (int i = 0; i < parts.length; i++) {
         * System.out.print(x[i] + " ");
         * }
         * System.out.println();
         * 
         * System.out.println("indexof: " + str.indexOf('i'));
         * 
         * System.out.println("lastIndexOf(): " + str.lastIndexOf('i'));
         * System.out.println("startsWith(): " + str.startsWith("nan"));
         * System.out.println("ebdsWith(): " + str.endsWith("ni"));
         * System.out.println(str == dup);
         * String test = new String("Nandini");
         * System.out.println(str.compareTo(dup));
         * System.out.println(str == test);
         * System.out.println(str.equals(test));
         * System.out.println(str.compareTo(test));
         * System.out.println("Bppld".compareTo("apple"));
         * System.out.println("java".concat("program"));
         * char[] ch = str.toCharArray();
         * for (char c : ch) {
         * System.out.print(c + " ");
         * }
         * System.out.println();
         * 
         * byte[] b = str.getBytes();
         * for (int i : b) {
         * System.out.print(i + " ");
         * }
         * System.out.println();
         * String num = "123";
         * int n = Integer.parseInt(num);
         * System.out.println(n);
         */

        StringBuilder sb1 = new StringBuilder("Logic");
        StringBuffer sb = new StringBuffer("Logic");
        sb.append(" While");
        System.out.println(sb);

        sb.insert(5, " and");
        System.out.println(sb);

        sb.replace(5, 10, "");
        System.out.println(sb);

        sb.delete(5, sb.length());
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        String finalstr = sb.toString();
        System.out.println(finalstr);
    }
}
