import middleware.*;
import request.Request;

public class Main {
    public static void main(String[] args) {
        Middleware middleware = new LoggingMiddleware();
        middleware.linkWith(new AuthenticationMiddleware())
                .linkWith(new CacheMiddleware())
                .linkWith(new AuthorizationMiddleware())
                .linkWith(new RouteMiddleware());

        // Первый запрос
        Request request1 = new Request("/cached", "GET");
        middleware.handle(request1);

        System.out.println();

        // Второй запрос
        Request request2 = new Request("/secure", "GET");
        middleware.handle(request2);
    }
}
