
Testing Hoverfly Java Middleware

To run: 

- Change to src directory

    `cd src`

- Check if the java class can run in console:

    `java io.specto.Middleware`

- Using it in hoverfly

    `hoverctl start`
    `hoverctl mode modify`
    `hoverctl middleware --binary sh test.sh --script cat.json`

