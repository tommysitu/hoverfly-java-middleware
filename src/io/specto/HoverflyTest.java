package io.specto;

import java.util.Scanner;

public class HoverflyTest {

    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextLine()) {
            String payload = scanner.nextLine();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("{\"response\":{\"status\":200,\"body\":\"{\\n   \\\"time\\\": \\\"hacked\\\",\\n   \\\"milliseconds_since_epoch\\\": 1494840232933,\\n   \\\"date\\\": \\\"05-15-2017\\\"\\n}\\n\",\"encodedBody\":false,\"headers\":{\"Access-Control-Allow-Origin\":[\"*\"],\"Content-Length\":[\"100\"],\"Content-Type\":[\"application/json; charset=ISO-8859-1\"],\"Date\":[\"Mon, 15 May 2017 09:23:52 GMT\"],\"Hoverfly\":[\"Was-Here\"],\"Server\":[\"Google Frontend\"],\"X-Cloud-Trace-Context\":[\"cc24ab0d80ef1ae731f1c47eb1a3bc82\"]}},\"request\":{\"path\":\"/\",\"method\":\"GET\",\"destination\":\"time.jsontest.com\",\"scheme\":\"http\",\"query\":\"\",\"body\":\"\"}}");
        }
    }
}
