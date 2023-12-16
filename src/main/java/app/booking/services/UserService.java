package app.booking.services;

import app.booking.models.property.Property;
import app.booking.models.users.User;
import app.booking.repository.UserRepository;
public class UserService {
    private UserRepository userRepository;
    public User getUser(){
        return userRepository.findByUsername("test");
    }
}
