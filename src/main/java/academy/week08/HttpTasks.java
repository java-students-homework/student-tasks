package academy.week08;

import java.util.Map;

/**
 * Week 8 · Lesson 1 — HTTP basics: status codes, methods, URLs.
 * No network calls here — pure logic you must know by heart before Spring.
 * Hint for URLs: java.net.URI (create, getHost, getPath).
 */
public class HttpTasks {

    /**
     * Category of the status code:
     * 100–199 → "informational"
     * 200–299 → "success"
     * 300–399 → "redirect"
     * 400–499 → "client error"
     * 500–599 → "server error"
     * anything else → "unknown"
     */
    public String statusCategory(int code) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Is the HTTP method idempotent (repeating it gives the same result)?
     * Idempotent: GET, HEAD, PUT, DELETE, OPTIONS.
     * Not idempotent: POST, PATCH.
     * The method name may come in any case ("get", "Post").
     */
    public boolean isIdempotent(String method) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Build a query string from the parameters, keeping their order:
     * {q=java, page=2} → "q=java&page=2". Empty map → "".
     * The map is a LinkedHashMap — iteration order is insertion order.
     */
    public String buildQueryString(Map<String, String> params) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * The host of the URL.
     * Example: "https://api.example.com/v1/orders?id=1" → "api.example.com".
     */
    public String hostOf(String url) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * The path of the URL (without host and query).
     * Example: "https://api.example.com/v1/orders?id=1" → "/v1/orders".
     */
    public String pathOf(String url) {
        throw new UnsupportedOperationException("TODO");
    }
}
