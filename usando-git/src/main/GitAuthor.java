package main;

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