package com.company.LocParc19.controller;

import com.company.LocParc19.dao.UtilisateursDao;
import com.company.LocParc19.model.Utilisateurs;
import com.company.LocParc19.security.JwtUtils;
import com.company.LocParc19.security.UserDetailsDemo;
import com.company.LocParc19.security.UserDetailsServiceDemo;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@Getter
@Setter
public class GestionnairesController {



}