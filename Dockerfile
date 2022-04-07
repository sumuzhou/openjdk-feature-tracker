FROM gradle:jdk16
WORKDIR /app
COPY . /app
CMD ["gradle", "run"]