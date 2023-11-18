package main;

public class App {
	public static void main(String[] args) {
		System.out.println("usando o git");
		System.out.println("commit 2");

		GitAuthor gitAuthor = new GitAuthor("dev-ita", "https://github.com/dev-ita/brincando-git.git");

		System.out.println(gitAuthor.toString());

		System.out.println("commit 3");
		System.out.println("commit 4");
	}
}
