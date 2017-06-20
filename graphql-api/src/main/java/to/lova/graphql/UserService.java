package to.lova.graphql;

import java.util.Optional;

import io.leangen.graphql.annotations.GraphQLArgument;
import io.leangen.graphql.annotations.GraphQLQuery;

public interface UserService {

    @GraphQLQuery(name = "user")
    Optional<User> findById(@GraphQLArgument(name = "id") Long id);

}
