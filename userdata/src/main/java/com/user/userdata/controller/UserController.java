package com.user.userdata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.user.userdata.model.UserEO;
// import com.user.userdata.model.User;
import com.user.userdata.service.UserService;

@RestController
@RequestMapping("/user")
@Component
public class UserController {

    @Autowired
    private UserService userService;
    

    @GetMapping("/getAll")
    public List<UserEO> getAll(){
        return userService.getAll();
    
    }

    @GetMapping("/get")
    public UserEO getByObject(@RequestParam String objectId){
        return userService.getByObject(objectId);
    }

    @PutMapping("/put")
    public UserEO updateUser(@RequestParam String objectId){
        return userService.updateUser(objectId);
    }

    // @PostMapping("/add")
    // public UserEO addData(@RequestBody UserEO user){
    //     return userService.addData(user);
    // }















































    

    // Map<String, User> allUsers =new HashMap<>();
//     @PutMapping("/put")
//     public String update(@RequestParam("email") String email,@RequestBody User user){

//         // System.out.println(user.getEmail())
//         // Object allUsers;
//         // // if (allUsers.containsKey(email)){
//             // String data = new String();
//             String data = user.getEmail();
//             // // System.out.println(data);

//             // System.out.println("before");
//             dummy = userService.getUserWith(data);
//             // System.out.println(dummy);
//             // System.out.println("done");
            

//             // ((User) dummy).setAccountNonLocked(user.getAccountNonLocked());
//             // ((User) dummy).setLockedAt(user.getLockedAt());
//             // ((User) dummy).setLoginAttempts(user.getLoginAttempts());
//             // // System.out.println(dummy);


//             // ((User) dummy).setAccountNonLocked(user.getAccountNonLocked());
//             // ((User) dummy).setLockedAt(user.getLockedAt());
//             // ((User) dummy).setLoginAttempts(user.getLoginAttempts());
//             // user.save(user);
//             // allUsers.put(email,data);

//             return "Edit is done";
//         // // }else{
//         // //      return "not";
//         // // }

//         // return userService.update(user);
//     }
}

