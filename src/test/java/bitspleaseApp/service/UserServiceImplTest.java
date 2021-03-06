package bitspleaseApp.service;

import bitspleaseApp.dto.response.UserDetailsResponse;
import bitspleaseApp.model.Authority;
import bitspleaseApp.model.User;
import bitspleaseApp.repository.UserRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class UserServiceImplTest {

    @Mock
    private UserRepository userRepository;
    private AutoCloseable autoCloseable;
    private UserService underTest;
    private UserDetailsResponse userDetailsResponse;

    @BeforeEach
    void setUp() {
        autoCloseable = MockitoAnnotations.openMocks(this);
        underTest = new UserServiceImpl(userRepository);
    }

    @AfterEach
    void tearDown() throws Exception {
        autoCloseable.close();
    }


    @Test
    void canGetAllUsers() {
        //when
        underTest.findAll();
        //then
        verify(userRepository).findAll();
    }



    @Test
    void findAll() {
        //arrange

        UserRepository userRepository = mock(UserRepository.class);

        long user_id = 0;
        String username = null;
        boolean enabled = false;
        String email = null;
        Set<Authority> authorities = null;


        Set<User> users = new HashSet<>();


        User user1 = new User();
        user1.setUser_id(1);
        user1.setUsername("admin");
        user1.setEnabled(true);
        user1.setEmail("admin@ad.min");
        user1.setAuthorities(null);
        users.add(user1);

        User user2 = new User();
        user2.setUser_id(2);
        user2.setUsername("user");
        user2.setEnabled(true);
        user2.setEmail("user@us.er");
        user2.setAuthorities(null);
        users.add(user2);

        User user3 = new User();
        user3.setUser_id(3);
        user3.setUsername("bob");
        user3.setEnabled(false);
        user3.setEmail("bob@bob.nl");
        user3.setAuthorities(null);
        users.add(user3);

        when(userRepository.findAll())
                .thenReturn(users);


        //act
//        Set<UserDetailsResponse> allUsers = userService.findAll();

//        Set<UserDetailsResponse> fakeUserDetailsResponses = new HashSet<>();

//        int actualSize = 0;
//        for (User user : allUsers) {
//            user_id = user.getUser_id();
//            username = user.getUsername();
//            enabled = user.isEnabled();
//            email = user.getEmail();
//            authorities = user.getAuthorities();
//            userDetailsResponse(user_id, username, enabled, email, authorities);
//            fakeUserDetailsResponses.add(userDetailsResponse);
//            actualSize++;
//        }

//        int actualSize = allUsers.size();
//
//        //assert
//        assertEquals(3, actualSize);

    }

    private void userDetailsResponse(long user_id, String username, boolean enabled, String email, Set<Authority> authorities) {
    }

    @Test
    void getUser() {
    //when
        underTest.getUser("admin");
        //then
        verify(userRepository).findByUsername("admin");
    }

    @Test
    void getUserById() {
        //when
        underTest.getUserById(1);
        //then
        verify(userRepository).findById(1);
    }


    @Test
    void findAllByDisabled() {
        //when
        underTest.findAllByDisabled();
        //then
        verify(userRepository).findAllByEnabled(false);

    }

}