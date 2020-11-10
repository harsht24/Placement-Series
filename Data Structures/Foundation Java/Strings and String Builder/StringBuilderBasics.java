package String;

public class StringBuilderD {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");

        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.charAt(3));

        sb.setCharAt(1,'t'); // set replace the character at the given position
        System.out.println(sb);

        sb.deleteCharAt(1);
        System.out.println(sb);

        sb.insert(1,'e'); // insert is different than set. It inserts new character at given position.
        System.out.println(sb);

        sb.append('p');
        System.out.println(sb);

    }
}

/*

hello
5
l
htllo
hllo
hello
hellop


*/