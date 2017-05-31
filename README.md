
Testing Hoverfly Java Middleware


Build

- `./gradlew clean build`
- copy `build/libs/hoverfly-java-middleware.jar` to `dist/`


Run 

- Switch to dist directory

    `cd dist`

- Start hoverfly with the middleware

    `hoverctl start`
    
    `hoverctl mode modify`
    
    `hoverctl middleware --binary sh run-jar.sh --script empty.json`
    
 
- The middleware modify the response, you can try it with
    
    `curl --proxy localhost:8500 http://time.jsontest.com`

