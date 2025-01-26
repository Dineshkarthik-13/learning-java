public class string_method {
    public static void main(String[] args) {
        String name = "dinesh";
        String name1 = "karthik";
        int a = name.length();
        String na = name.substring(0, 3);
        String nam = name.replace('d', 'f');
        System.out.println(nam.toUpperCase());
        System.out.println(name.charAt(3));
        System.out.println(name.indexOf('e'));
        System.out.println(name.toUpperCase() + " " + name1.toUpperCase() + " this name length is  " + a);
    }
}
