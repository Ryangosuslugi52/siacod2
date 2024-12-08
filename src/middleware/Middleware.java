package middleware;

import request.Request;

public abstract class Middleware {
    private Middleware next;

    public Middleware linkWith(Middleware next) {
        this.next = next;
        return next;
    }

    public void handle(Request request) {
        if (next != null) {
            next.handle(request);
        }
    }
}
