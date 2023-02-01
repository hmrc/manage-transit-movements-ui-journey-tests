#!/bin/bash


echo "BrowserStackLocal instances:"
pidof BrowserStackLocal

if pidof BrowserStackLocal; then
  echo "BrowserStackLocal running already"
else
    echo "None, starting BrowserStack"
    if [ ! -e BrowserStackLocal ]; then
      if [ "$(uname)" == "Darwin" ]; then
        echo "Downloading BrowserStackLocal for Mac OS X platform"
        curl -O https://www.browserstack.com/browserstack-local/BrowserStackLocal-darwin-x64.zip
        unzip BrowserStackLocal-darwin-x64.zip
        rm BrowserStackLocal-darwin-x64.zip
          elif [ "$(expr substr $(uname -s) 1 5)" == "Linux" ]; then
          echo "Downloading BrowserStackLocal for GNU/Linux platform"
          curl -O https://www.browserstack.com/browserstack-local/BrowserStackLocal-linux-x64.zip
          unzip BrowserStackLocal-linux-x64.zip
          rm BrowserStackLocal-linux-x64.zip
          fi
    fi
    file="./src/test/resources/browserStackConfig.properties"
    if [ -f "$file" ]
    then
        echo "***********File : $file found ***************."
        . ./src/test/resources/browserStackConfig.properties
        ./BrowserStackLocal --key $browserStackAutomateKey  --daemon start
        echo "BSServer started in local"
        if ! pidof BrowserStackLocal; then
            echo "Could not connect. Please check your automate key"
        fi
    else
       echo "****************$file Not found ,Warning: Sorry BrowserStack wont work,provide a file with your credentials***************."
       exit 1
    fi
fi


