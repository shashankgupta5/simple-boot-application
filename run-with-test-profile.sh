#!/usr/bin/env bash
mvn clean install
mvn spring-boot:run -Dspring-boot.run.profiles=test -Dspring-boot.run.jvmArguments="-Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=8000"