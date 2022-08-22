# OpenJDK Feature Tracker

As a Java developer, it feels sad when I realized the last major features that I familiar with were `Lambda` and `Stream API` in JDK 8, which is released back in 2014 :joy: . The pace of release of JDK has been speed up these years and the developers need a good way to keep track with new features released every six months.

What is the best way for a developer to learn some stuff? `Talk is cheap, show me the code`, of course it must be coding. So I create this repository to help me practice and track some features released in each version of `OpenJDK`. Hopefully it can help someone else who faces the same trouble.

## How to run the code

It's a little difficult for us to run the code on bare-metal machine directly because we need to switch back and forth on different versions of JDK and Gradle, so we seek for the help for containers.

You need to have `docker` and `docker-compose` (or any tools that compatible with them) installed on your machine, and run the code by:

```shell
docker-compose up --build <the-service-name>
```

If you feel comfortable with the code later and don't want to run it again:

```shell
docker-compose down <the-service-name>
docker system prune
```

## About JBang

The project uses `JBang` as the tool to simplify the build procedure and focus on the content of the code rather than the structure of the project. To install `JBang`, the most easiest way is

```shell
curl -Ls https://sh.jbang.dev | bash -s - app setup
```

Please refer to the [documentation](https://www.jbang.dev/documentation/guide/latest/index.html) of `JBang` to get more information.