package com.rob.bitspleaseapp.dto.response;

import com.rob.bitspleaseapp.model.Authority;
import com.rob.bitspleaseapp.model.Game;

import java.util.HashSet;
import java.util.Set;

public class UserDetailsResponse {

    private long user_id;
    public String username;
    private boolean enabled;
    private String email;
    private Set<Authority> authorities = new HashSet<>();
    private Set<Game> games = new HashSet<>();

    public UserDetailsResponse(long user_id, String username, boolean enabled, String email, Set<Authority> authorities, Set<Game> games ) {
        this.user_id = user_id;
        this.username = username;
        this.enabled = enabled;
        this.email = email;
        this.authorities = authorities;
        this.games = games;
    }

    public UserDetailsResponse() {

    }

    public long getUser_id() {
        return user_id;
    }

    public String getUsername() {
        return username;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public String getEmail() {
        return email;
    }

    public Set<Authority> getAuthorities() {
        return authorities;
    }

    public Set<Game> getGames() {return games; }
}
