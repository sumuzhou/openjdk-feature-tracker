FROM openjdk:16
RUN curl -Ls https://sh.jbang.dev | bash -s - app setup
WORKDIR /app
COPY . /app
CMD ["./jbang", "Main.java"]