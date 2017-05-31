
Testing Hoverfly Java Middleware


This is a work-around to run hoverfly middleware written in JAVA. It demos the middleware modify the response body data.


Build

- `./gradlew clean build`
- copy `build/libs/hoverfly-java-middleware.jar` to `dist/`
- copy `dist/run-jar.sh` to `/usr/local/bin` because it needs to be found in the $PATH


Run 

- Switch to dist directory

    `cd dist`

- Start hoverfly with the middleware

    `hoverctl start`
    
    `hoverctl mode modify`
    
    `hoverctl middleware --binary run-jar.sh --script empty.json`
    
 
- The middleware modify the response, you can try it with
    
    `curl --proxy localhost:8500 http://time.jsontest.com`
