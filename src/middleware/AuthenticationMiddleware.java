package middleware;

import request.Request;
import request.User;

public class AuthenticationMiddleware extends Middleware {
    @Override
    public void handle(Request request) {
        if ("AUTH_TOKEN".equals(request.getPath())) {
            request.setUser(new User("JohnSeen", "USER"));
            System.out.println("User authenticated: JohnSeen");
        } else {
            System.out.println("Authentication failed");
        }
        super.handle(request);
    }
}
