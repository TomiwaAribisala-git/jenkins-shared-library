#!/usr/bin/env groovy

def call() {
     echo "building the application..."
     withMaven(maven: 'maven-3.9') {
        sh "mvn package"
    }
}