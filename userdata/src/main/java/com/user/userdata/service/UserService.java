package com.user.userdata.service;
import java.util.List;
// import com.user.userdata.model.User;

import com.user.userdata.model.UserEO;



public interface UserService {

    List<UserEO> getAll();

    UserEO getByObject(String objectId);

    UserEO updateUser(String objectId);

    // UserEO addData(UserEO user);
    
}
