package tn.education.angularspringbootapplication.restControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.education.angularspringbootapplication.entities.User;
import tn.education.angularspringbootapplication.services.UserService;

import java.util.List;
@CrossOrigin(origins="*")
@RestController
@RequestMapping("/user")
public class UserRestController {
    @Autowired
    UserService userService;

    //Create new User
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces =MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> createUser(@RequestBody User user){
        User newUser = userService.createUser(user);
        return new ResponseEntity<User>(newUser, HttpStatus.CREATED);
    }
    //Get user by id
    @GetMapping(path="/{userId}",produces =MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> getUserById(@PathVariable String userId) {
        User userFound = userService.getUserById(userId);
        return new ResponseEntity<User>(userFound,HttpStatus.OK);
    }
    //Get all users
    @GetMapping(produces =MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> usersList = userService.getAllUsers();
        return new ResponseEntity<List<User>>(usersList,HttpStatus.OK);
    }
    //Update user
    @PutMapping(consumes =MediaType.APPLICATION_JSON_VALUE,produces =MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> updateUser(@RequestBody User user){
        User UserUpdated = userService.updateUser(user);
        return new ResponseEntity<User>(UserUpdated,HttpStatus.ACCEPTED);
    }
    //Delete user
    @DeleteMapping(path="/{id}")
    public ResponseEntity<Object> deleteUser(@PathVariable String id) {
        userService.deleteUser(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
