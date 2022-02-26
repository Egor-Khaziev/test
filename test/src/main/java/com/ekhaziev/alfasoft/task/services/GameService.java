package com.ekhaziev.alfasoft.task.services;

import com.ekhaziev.alfasoft.task.entity.User;
import com.ekhaziev.alfasoft.task.exceptions.UserNotFoundException;
import com.ekhaziev.alfasoft.task.repositories.UserList;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.UUID;

@AllArgsConstructor
@Slf4j
@Service
public class GameService {
    private final UserList userList;

    public String tryToLogIn(User user){
        if (verify(user)){
            String UUID = generateUserUuid();
            log.warn("UUID created");
            Map<String,User> authorizedList =  userList.getAuthorizedList();
            authorizedList.put(UUID,user);
            return UUID;
        }
        throw new UserNotFoundException("user or password incorrect") ;
    }

    public boolean verify(User user) {

        if (userList.getList().contains(user)) {
            log.warn("user " + user.getUsername() + " verify: true");
            return true;
        }

        log.warn("user " + user.getUsername() + " verify: false");
        return false;
    }

    public String generateUserUuid() {
        return UUID.randomUUID().toString();
    }

}
