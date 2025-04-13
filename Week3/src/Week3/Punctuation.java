package Week3;
public class Punctuation {
    public static void main(String[] args) {
        String text = "Mary had a little lamb, her fleece was as white as snow, and everywhere Mary went, the lamb was sure to go. -that was a nice poem- the end. ";
        int comma = 0, period = 0, dash = 0;
        for (char ch : text.toCharArray()) {
            if (ch == ',') comma++;
            else if (ch == '.') period++;
            else if (ch == '-') dash++;
        }
        System.out.println("+-------------+-------+");
        System.out.println("| Punctuation | Count |");
        System.out.println("+-------------+-------+");
        System.out.printf("| Comma (,)   |   "+comma+"   |\n", comma);
        System.out.printf("| Period (.)  |   "+period+"   |\n", period);
        System.out.printf("| Dash (-)    |   "+dash+"   |\n", dash);
        System.out.println("+-------------+-------+");
    }
}