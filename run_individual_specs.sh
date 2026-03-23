#!/usr/bin/env bash

echo Running $1 test suite

# Scalafmt checks have been separated from the test command to avoid OutOfMemoryError in Jenkins
sbt scalafmtCheckAll scalafmtSbtCheck

sbt -Denvironment=local -Dbrowser=chrome "testOnly specs.$1"