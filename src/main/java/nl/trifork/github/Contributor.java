package nl.trifork.github;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Contributor
 */
public class Contributor {

    private String login;
    private String avatar_url;
    private int contributions;

    public String getLogin() {
        return login;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public int getContributions() {
        return contributions;
    }
}
