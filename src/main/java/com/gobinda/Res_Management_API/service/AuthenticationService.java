package com.gobinda.Res_Management_API.service;

import com.gobinda.Res_Management_API.model.Admin;
import com.gobinda.Res_Management_API.model.AuthenticationToken;
import com.gobinda.Res_Management_API.model.User;
import com.gobinda.Res_Management_API.repository.IAuthenticationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    @Autowired
    IAuthenticationRepo authenticationRepo;

    public boolean authenticate(String email, String authTokenValue)
    {
        AuthenticationToken authToken = authenticationRepo.findFirstByTokenValue(authTokenValue);

        if(authToken == null)
        {
            return false;
        }

        String tokenConnectedEmail = authToken.getUser().getUserEmail();

        return tokenConnectedEmail.equals(email);
    }

    public void saveAuthToken(AuthenticationToken authToken)
    {
        authenticationRepo.save(authToken);
    }

    public AuthenticationToken findFirstByUser(User user) {
        return authenticationRepo.findFirstByUser(user);
    }

    public void removeToken(AuthenticationToken token) {
        authenticationRepo.delete(token);
    }

    public AuthenticationToken findFirstByAdmin(Admin admin) {
        return authenticationRepo.findFirstByAdmin(admin);
    }
}