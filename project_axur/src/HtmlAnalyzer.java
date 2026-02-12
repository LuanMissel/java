import java.net.URL;
import java.util.Scanner;
import java.util.Stack;
import java.io.IOException;

public class HtmlAnalyzer {

    public static void main(String[] args) {

        if (args.length == 0) return;

        try {
            analyzeUrl(args[0]);
        } catch (IOException e) {
            System.out.println("URL connection error");
        }
    }

    private static void analyzeUrl(String urlString) throws IOException {
        URL url = new URL(urlString);

        try (Scanner scanner = new Scanner(url.openStream())) {
            processHtml(scanner);
        }
    }

    private static void processHtml(Scanner scanner) {
        Stack<String> stack = new Stack<>();
        String deepestText = null;
        int maxDepth = -1;

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine().trim();
            if (line.isEmpty()) continue;

            if (isTag(line)) {
                if (isClosingTag(line)) {

                    String tagName = extractTagName(line);
                    if (stack.isEmpty() || !stack.pop().equals(tagName)) {
                        System.out.println("malformed HTML");
                        return;
                    }
                } else {

                    stack.push(extractTagName(line));
                }
            } else {

                int currentDepth = stack.size();
                if (currentDepth > maxDepth) {
                    maxDepth = currentDepth;
                    deepestText = line;
                }
            }
        }


        if (!stack.isEmpty()) {
            System.out.println("malformed HTML");
        } else if (deepestText != null) {
            System.out.println(deepestText);
        }
    }


    private static boolean isTag(String line) {
        return line.startsWith("<") && line.endsWith(">");
    }

    private static boolean isClosingTag(String line) {
        return line.startsWith("</");
    }

    private static String extractTagName(String line) {
        // Remove <, > e / para pegar apenas o nome da tag (ex: "html", "div")
        return line.replaceAll("[<>/]", "");
    }
}
