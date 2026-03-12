#!/bin/bash -e
DEFAULT_TESTRUN_ALL=*
TEST_TO_RUN=$1

if [ -z "$TEST_TO_RUN" ]; then
    echo "TEST_TO_RUN value not set, defaulting to $DEFAULT_TESTRUN_ALL..."
    echo ""
fi

sbt scalafmtCheckAll scalafmtSbtCheck

sbt -Denvironment=local \
    -Dbrowser=chrome \
    -Dbrowser.option.headless=true \
    "testOnly convertedSpecs.$@"