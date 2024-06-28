public class StringMethodDemo {
    public static void main(String[] args) {
        String s = "Java Core";
        String search = "    Samsung    ";

        // Độ dài của chuỗi
        System.out.println("s.length() = " + s.length());

        // Kiểm tra chuỗi có rỗng không
        System.out.println("s.isEmpty() = " + s.isEmpty());

        // Ký tự tại vị trí đầu tiên (index 0)
        System.out.println("s.charAt(0) = " + s.charAt(0));

        // Tìm vị trí đầu tiên của ký tự 'a'
        System.out.println("s.indexOf('a') = " + s.indexOf('a'));

        // Tìm vị trí cuối cùng của ký tự 'a'
        System.out.println("s.lastIndexOf('a') = " + s.lastIndexOf('a'));

        // Loại bỏ khoảng trắng ở đầu và cuối chuỗi
        System.out.println("search.trim() = " + search.trim());

        // Nối chuỗi s với chuỗi search
        System.out.println("s.concat(search) = " + s.concat(search));

        // Thay thế tất cả các ký tự 'a' bằng 'o'
        System.out.println("s.replace('a', 'o') = " + s.replace('a', 'o'));

        // Lấy một phần của chuỗi từ vị trí 0 đến 4 (không bao gồm 4)
        System.out.println("s.substring(0, 4) = " + s.substring(0, 4));

        // Lấy một phần của chuỗi từ vị trí 5 đến hết
        System.out.println("s.substring(5) = " + s.substring(5));

        // Chuyển tất cả ký tự trong chuỗi thành chữ in hoa
        System.out.println("s.toUpperCase() = " + s.toUpperCase());

        // Chuyển tất cả ký tự trong chuỗi thành chữ thường
        System.out.println("s.toLowerCase() = " + s.toLowerCase());

        String[] words = s.split(" ");
        for (String word : words) {
            System.out.println("word = " + word);
        }
    }
}
