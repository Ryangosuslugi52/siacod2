package middleware;

import request.Request;

public class RouteMiddleware extends Middleware {
    @Override
    public void handle(Request request) {
        System.out.println("Routing request to handler for path: " + request.getPath());
    }
}
