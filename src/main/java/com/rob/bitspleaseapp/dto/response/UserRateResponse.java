package com.rob.bitspleaseapp.dto.response;

public class UserRateResponse {

    public String ratedUsername;

    public UserRateResponse(String ratedUsername) {
        this.ratedUsername = ratedUsername;
    }

    public String getRatedUsername() {return ratedUsername;}

}