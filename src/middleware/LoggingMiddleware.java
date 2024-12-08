package middleware;

import request.Request;

public class LoggingMiddleware extends Middleware {
    @Override
    public void handle(Request request) {
        System.out.println("Logging request: " + request.getMethod() + " " + request.getPath());
        super.handle(request);
    }
}
