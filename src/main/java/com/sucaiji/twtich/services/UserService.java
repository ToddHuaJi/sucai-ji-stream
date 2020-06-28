package com.sucaiji.twtich.services;

import com.sucaiji.twtich.bean.User;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.List;

@Service
public class UserService {

    public Flux<User> getDummyUsers(){
        User dummy1 = new User("Bob", "1234asd", 0);
        User dummy2 = new User("Alice", "1234asd", 1);
        User dummy3 = new User("Alex", "1234asd", 2);

        return Flux.fromIterable(List.of(dummy1, dummy2, dummy3));
    }

}
