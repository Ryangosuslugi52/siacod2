package middleware;

import request.Request;

public class CacheMiddleware extends Middleware {
    @Override
    public void handle(Request request) {
        if ("/cached".equals(request.getPath())) {
            request.setCachedResponse("Cached Response");
            System.out.println("Cache hit: returning cached response");
            return;
        }
        super.handle(request);
    }
}
