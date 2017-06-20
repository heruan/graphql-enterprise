package to.lova.graphql.war;

import javax.inject.Inject;
import javax.servlet.annotation.WebServlet;

import graphql.servlet.SimpleGraphQLServlet;
import io.leangen.graphql.GraphQLSchemaGenerator;
import to.lova.graphql.UserService;

@WebServlet(urlPatterns = "/*", asyncSupported = true)
@SuppressWarnings("serial")
public class GraphQLServlet extends SimpleGraphQLServlet {

    @Inject
    public GraphQLServlet(UserService userService) {
        super(new GraphQLSchemaGenerator().withOperationsFromSingleton(userService, UserService.class).generate());
    }

}
