# gradlePlugin
basics of gradle plugin


install this plugin to local maven repo using  gradle install 


then use this plugin like below


buildscript {
    repositories {
        
        mavenLocal()
    }
    dependencies {
        classpath 'com.gradle:myplugin:1.0-SNAPSHOT'
    }
}