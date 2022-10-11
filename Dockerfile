FROM openjdk:17

ENV APP /app

COPY . $APP

WORKDIR $APP

RUN microdnf install findutils
