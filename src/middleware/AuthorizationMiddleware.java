package middleware;

import request.Request;
import request.User;

public class AuthorizationMiddleware extends Middleware {
    @Override
    public void handle(Request request) {
        User user = request.getUser();
        if (user == null || !"ADMIN".equals(user.getRole())) {
            System.out.println("Authorization failed: insufficient permissions");
            return;
        }
        System.out.println("Authorization successful");
        super.handle(request);
    }
}
