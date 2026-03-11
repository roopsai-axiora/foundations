public class CommitParser {
    public String[] parse(String message) {
        if (message == null || !message.contains(":")) {
            return new String[] { "", "", "" };
        }

        int colon = message.indexOf(":");
        String left = message.substring(0, colon).trim();
        String desc = message.substring(colon + 1).trim();

        String type;
        String scope = "";

        int open = left.indexOf("(");
        int close = left.indexOf(")");

        if (open > 0 && close > open) {
            type = left.substring(0, open);
            scope = left.substring(open + 1, close);
        } else {
            type = left;
        }

        return new String[] { type, scope, desc };
    }
}
