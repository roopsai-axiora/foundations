public class CommitMessageFormatter {
    public String format(String type, String scope, String description) {
        if (scope == null || scope.isBlank()) {
            return type + ": " + description;
        }
        return type + "(" + scope + "): " + description;
    }
}
