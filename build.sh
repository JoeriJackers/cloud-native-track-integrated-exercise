#!/usr/bin/env bash
VERSION=0.0.1-SNAPSHOT
mvn clean -Dmaven.test.skip=true package
docker build -t basic-api-server:$VERSION -f $(pwd)/docker/Dockerfile .