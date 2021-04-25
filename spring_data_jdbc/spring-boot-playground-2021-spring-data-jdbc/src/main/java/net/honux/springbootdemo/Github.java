package net.honux.springbootdemo;

public class Github {
    private String nickname;
    private String gitUrl;

    public Github(String nickname, String gitUrl) {
        this.nickname = nickname;
        this.gitUrl = gitUrl;
    }

    @Override
    public String toString() {
        return "Github{" +
                "nickname='" + nickname + '\'' +
                ", gitUrl='" + gitUrl + '\'' +
                '}';
    }
}
