public class practice_set_3 {
    public static void main(String[] args) {
        String name = "jack parker";
        System.out.println(name.replace(" ", "_"));
        String letter = "dear <|name|>, trans a lot";
        System.out.println(letter.replace("<|name|>", name));
        String name1 = "dinesh  karthik   13";
        System.out.println(name1.indexOf("   "));
    }
}
