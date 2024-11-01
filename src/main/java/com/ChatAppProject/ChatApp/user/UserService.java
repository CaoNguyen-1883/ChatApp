package com.ChatAppProject.ChatApp.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService
{

    private final UserReposiory userReposiory;

    public void saveUser(User user)
    {
        user.setStatus(Status.ONLINE);
        userReposiory.save(user);
    }

    public void disconnect(User user)
    {
        var storedUser = userReposiory.findById(user.getNickName()).orElse(null);
        if(storedUser != null)
        {
            storedUser.setStatus(Status.OFFLINE);
            userReposiory.save(storedUser);
        }
    }

    public List<User> findConectedUsers()
    {
        return userReposiory.findAllByStatus(Status.ONLINE);
    }

    public List<User> findAllUsers()
    {
        return userReposiory.findAll();
    }
}
