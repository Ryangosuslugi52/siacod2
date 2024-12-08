package request;

public class Request {
    private String path;
    private String method;
    private User user;
    private String cachedResponse;

    public Request(String path, String method) {
        this.path = path;
        this.method = method;
    }

    public String getPath() {
        return path;
    }

    public String getMethod() {
        return method;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getCachedResponse() {
        return cachedResponse;
    }

    public void setCachedResponse(String cachedResponse) {
        this.cachedResponse = cachedResponse;
    }
}
