#!/usr/bin/env bash
docker rm -f sonarqube
docker run -d --name sonarqube -p 9000:9000 sonarqube