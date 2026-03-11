void main() {
    CommitParser parser = new CommitParser();

    String[] a = parser.parse("feat(auth): add login");
    assert a[0].equals("feat");
    assert a[1].equals("auth");
    assert a[2].equals("add login");

    String[] b = parser.parse("docs: update readme");
    assert b[0].equals("docs");
    assert b[1].equals("");
    assert b[2].equals("update readme");

    System.out.println("CommitParser tests passed");
}
