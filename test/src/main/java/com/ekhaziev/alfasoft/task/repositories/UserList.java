package com.ekhaziev.alfasoft.task.repositories;

import com.ekhaziev.alfasoft.task.entity.User;
import lombok.Data;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@Data
public class UserList {

    private Map<String,User> AuthorizedList;
    private List<User> list;

    @PostConstruct
    public void init(){
        AuthorizedList = new HashMap<>();

        list = new ArrayList<>();
        list.add(new User("bob","123456"));
        list.add(new User("maks","123456"));
        list.add(new User("mary","123456"));
        list.add(new User("ann","123456"));
    }

}
