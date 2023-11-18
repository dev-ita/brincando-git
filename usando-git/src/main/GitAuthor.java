package main;

class GitAuthor {
	private String gitAuthorName;
	private String gitHttps;
	private String token;

	public GitAuthor(String gitAuthorName, String gitHttps) {
		this.gitAuthorName = gitAuthorName;
		this.gitHttps = gitHttps;
	}
	
	public String getToken() {
		return this.token;		
	}

	@Override
	public String toString() {
		return this.gitAuthorName + ", " + this.gitHttps + "\n";
	}
}