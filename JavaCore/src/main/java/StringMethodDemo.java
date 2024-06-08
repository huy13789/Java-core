public class StringMethodDemo {
    public static void main(String[] args) {
        String s = "Java Core";
        String search = "    Samsung    ";

        System.out.println("s.length() = " + s.length());
        System.out.println("s.isEmpty() = " + s.isEmpty());
        System.out.println("s.charAt(0) = " + s.charAt(0));
        System.out.println("s.indexOf('a') = " + s.indexOf('a'));
        System.out.println("s.lastIndexOf('a') = " + s.lastIndexOf('a'));
        System.out.println("search.trim() = " + search.trim());
        System.out.println("s.concat(search) = " + s.concat(search));
        System.out.println("s.replace('a', 'o') = " + s.replace('a', 'o'));
        System.out.println("s.substring(0, 4) = " + s.substring(0, 4));
        System.out.println("s.substring(5) = " + s.substring(5));
        System.out.println("s.toUpperCase() = " + s.toUpperCase());
        System.out.println("s.toLowerCase() = " + s.toLowerCase());
        String[] words = s.split(" ");
        for (String word : words) {
            System.out.println("word = " + word);
        }
    }
}
