package com.gobinda.Res_Management_API.repository;

import com.gobinda.Res_Management_API.model.Admin;
import com.gobinda.Res_Management_API.model.User;
import com.gobinda.Res_Management_API.model.AuthenticationToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAuthenticationRepo extends JpaRepository<AuthenticationToken,Long> {
    AuthenticationToken findFirstByTokenValue(String authTokenValue);

    AuthenticationToken findFirstByUser(User user);

    AuthenticationToken findFirstByAdmin(Admin admin);
}