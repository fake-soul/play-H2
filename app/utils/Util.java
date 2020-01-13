package utils;


import com.fasterxml.jackson.databind.node.ObjectNode;
import play.libs.Json;

import static java.util.concurrent.CompletableFuture.supplyAsync;
import static play.mvc.Results.badRequest;

public class Util {
    public static ObjectNode createResponse(Object response, Boolean ok) {
        ObjectNode result = Json.newObject();
        result.put("isSuccessful", ok);
        if (response instanceof String) {
            result.put("body", (String) response);
        } else {
            result.putPOJO("body", response);
        }
        return result;
    }
}