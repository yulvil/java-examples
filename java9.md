# Create custom jre

## 1 Create a docker image will the full JDK

Dockerfile
```
FROM ubuntu:17.10

# RUN curl http://download.java.net/java/GA/jdk9/9/binaries/openjdk-9_linux-x64_bin.tar.gz | tar xvfz -
ADD openjdk-9_linux-x64_bin.tar.gz /opt/

ENV JAVA_HOME=/opt/jdk-9
ENV PATH=$PATH:$JAVA_HOME/bin

CMD ["java", "-version"]

# docker build --no-cache -t jdk-9 .
# docker run --rm jdk-9
# docker run --rm jdk-9 java --list-modules
```

## 2 Create custom runtime
docker run --rm --volume $PWD:/out jdk-9 \
  jlink --module-path /opt/jdk-9/jmods --verbose \
    --add-modules java.base \
    --compress 2 \
    --no-header-files \
    --output /out/jdk-9-base

## 3 Package custom runtime
Dockerfile.custom
```
FROM debian:17.10

ADD jdk-9-base /opt/jdk-9

ENV JAVA_HOME=/opt/jdk-9
ENV PATH=$PATH:$JAVA_HOME/bin

CMD ["java", "-version"]

# docker build --no-cache -f Dockerfile.custom -t jdk-9-base .
# docker run --rm jdk-9-base
# docker run --rm jdk-9-base java --list-modules
```
