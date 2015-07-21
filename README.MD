# Nuxeo automation-j2objc

## About automation-j2objc

Nuxeo automation-j2objc is a sandbox project to test how we can have a shared automation-client between pure Java, iOS and Android. 

### Automation / REST Nuxeo Apis

Nuxeo provides a complete API accessible via HTTP/HTTPS. This API is the best way to integrate portals, workflow engines, ESBs, custom application written in JavaScript, Ruby, etc. remotely with the Nuxeo Platform repository.

See [Official documentation about REST API](https://doc.nuxeo.com/x/QYLQ), or [Automation clients](https://doc.nuxeo.com/x/oIf1).

### j2objc

J2ObjC is an open-source command-line tool from Google that translates Java source code to Objective-C for the iOS (iPhone/iPad) platform. This tool enables Java source to be part of an iOS application's build, as no editing of the generated files is necessary.

See [Official j2objc site](http://j2objc.org/), or [their github page](https://github.com/google/j2objc)

## How to build

This project is still at a really early stage; nothing is garanteed. To build it, you need to install [latest j2objc distribution](https://github.com/google/j2objc/releases), [Gradle](https://gradle.org/) and [CocoaPod](https://cocoapods.org).

    # First step is to grab all dependencies using gradle
    cd $PROJECT_ROOT
    gradle
    
    # Next configure your local.properties file
    echo "sdk.dir=${ANDROID_HOME}" >> local.properties
    echo "j2objc.home=${J2OBJC_DISTRIBUTION}" >> local.properties
    
    # Install Pod dependencies
    cd ios
    pod install

## About Nuxeo

Nuxeo dramatically improves how content-based applications are built, managed and deployed, making customers more agile, innovative and successful. Nuxeo provides a next generation, enterprise ready platform for building traditional and cutting-edge content oriented applications. Combining a powerful application development environment with SaaS-based tools and a modular architecture, the Nuxeo Platform and Products provide clear business value to some of the most recognizable brands including Verizon, Electronic Arts, Netflix, Sharp, FICO, the U.S. Navy, and Boeing. Nuxeo is headquartered in New York and Paris. More information is available at [www.nuxeo.com](http://www.nuxeo.com).
