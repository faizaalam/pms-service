package com.cmed.prescriptionmanagement;

import java.util.Iterator;
import java.util.List;

import com.cmed.prescriptionmanagement.model.ERole;
import com.cmed.prescriptionmanagement.model.Role;
import com.cmed.prescriptionmanagement.model.User;
import com.cmed.prescriptionmanagement.repository.RoleRepository;
import com.cmed.prescriptionmanagement.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Sort;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;


@Component
public class Runner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(Runner.class);

    @Autowired
    private UserRepository userRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    RoleRepository roleRepository;


    @Override
    public void run(String...args) throws Exception {

        userRepository.save(new User("user", "user@gmail.com", passwordEncoder.encode("123")));
        roleRepository.save(new Role(ERole.ROLE_ADMIN));
        roleRepository.save(new Role(ERole.ROLE_USER));

        logger.info("# of users {}", userRepository.count());

    }
}