package io.specto.hoverfly;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.util.Scanner;

public class MiddlewareTest {


    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        ObjectMapper objectMapper = new ObjectMapper();

        if (scanner.hasNextLine()) {
            String payload = scanner.nextLine();
            try {
                JsonNode pairs = objectMapper.readTree(payload);
                if (pairs.has("response") && !pairs.get("response").get("headers").isNull()) {
                    ObjectNode responseNode = (ObjectNode) pairs.get("response");
                    responseNode.put("body", "body was replaced by middleware\n");

                    ObjectNode headers = (ObjectNode) responseNode.get("headers");
                    headers.remove("Content-Length");
                }
                System.out.print(objectMapper.writeValueAsString(pairs));
            } catch (Exception e) {
                throw new IllegalStateException("Failed reading from payload: " + payload);
            }
        }
    }
}
