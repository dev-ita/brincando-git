package main;

public class App {
	public static void main(String[] args) {
		System.out.println("usando o git");
		System.out.println("commit 2");
		
		GitAuthor gitAuthor = new GitAuthor("dev-ita", "https://github.com/dev-ita/brincando-git.git");
		
		System.out.println(gitAuthor.toString());
	}
}

class GitAuthor {
	private String gitAuthorName;
	private String gitHttps;

	public GitAuthor(String gitAuthorName, String gitHttps) {
		this.gitAuthorName = gitAuthorName;
		this.gitHttps = gitHttps;
	}
	
	@Override
	public String toString() {
		return this.gitAuthorName + ", " + this.gitHttps + "\n";
	}
}