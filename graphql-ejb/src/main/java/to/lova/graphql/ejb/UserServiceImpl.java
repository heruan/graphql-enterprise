package to.lova.graphql.ejb;

import java.util.Optional;

import javax.ejb.Stateless;

import to.lova.graphql.User;
import to.lova.graphql.UserService;

@Stateless
public class UserServiceImpl implements UserService {

    @Override
    public Optional<User> findById(Long id) {
        return Optional.of(new User("Foo"));
    }

}
