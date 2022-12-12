package com.user.userdata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.userdata.model.UserEO;
import com.user.userdata.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{


    @Autowired
    private UserRepository userRepository;

    // Sentry.init("https://5386cd656c054e999005c23fcb15cff7@o4503963672444928.ingest.sentry.io/4503963682930688");
    @Override
    public List<UserEO> getAll() {
        return userRepository.findAll();
    }

    @Override
    public UserEO getByObject(String objectId) {
        return userRepository.getByObjectId(objectId);
    }

    @Override
    public UserEO updateUser(String objectId) {
        // System.out.println(objectId);
        UserEO responsUser = userRepository.getByObjectId(objectId);
        // System.out.println(responsUser);
        responsUser.setAccountNonLocked(false);
        responsUser.setLoginAttempts(0);
        responsUser.setLockedAt(0);
        return userRepository.save(responsUser);
    }

    // @Override
    // public UserEO addData(UserEO user) {
    //     return userRepository.save(user);
    // }




































    

    // @Override
    // public User update(User user){
    //     Query query = new Query();
    //     query.addCriteria(Criteria.where("email").is(user.getEmail()));

    //     // FindAndReplaceOptions options = new FindAndReplaceOptions().upsert().returnNew();

    //     // return mongoTemplate.findAndReplace(query, user, options, User.class, User.class);
    //     Update update = new Update();
    //     // System.out.println(loginAttempts);
    //     update.set("loginAttempts", user.getLoginAttempts());
    //     update.set("accountNonLocked", user.getAccountNonLocked());
    //     update.set("lockedAt", user.getLockedAt());
    //     return userRepository.save(user);
    //     // mongoTemplate.updateFirst(query, update, User.class);
    //     // System.out.println(user);
    //     // return userRepository.save(user);
    // }

    // // @Override
    // // public List save(User user) {
    // //     return userRepository.save(user);\
    // // }
    
}
