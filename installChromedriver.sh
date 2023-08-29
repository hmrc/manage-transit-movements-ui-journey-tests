#!/usr/bin/env bash

#Depending on the OS of your device, change the value of OS appropriately
OS="linux64"
#OS="mac64"
#OS="mac_arm64"

#These match the configuration on Jenkins - you should only have to adjust these values when the platform makes changes
CHROME_VERSION=`curl -sS https://googlechromelabs.github.io/chrome-for-testing/LATEST_RELEASE_STABLE`
CHROME_PARENT_DIR="/usr/local/bin/"

CHROME_DOWNLOAD_URL="https://edgedl.me.gvt1.com/edgedl/chrome/chrome-for-testing/$CHROME_VERSION/linux64/chromedriver-linux64.zip"
CHROME_TEMP="/tmp/chromedriver-v${CHROME_VERSION}-${OS}.tar.gz"

wget -N ${CHROME_DOWNLOAD_URL} -P ~/
unzip ~/chromedriver_${OS}.zip -d ~/
rm ~/chromedriver_${OS}.zip
sudo mv -f ~/chromedriver-linux64/chromedriver ${CHROME_PARENT_DIR}chromedriver
sudo chown root:root ${CHROME_PARENT_DIR}chromedriver
sudo chmod 755 ${CHROME_PARENT_DIR}chromedriver
