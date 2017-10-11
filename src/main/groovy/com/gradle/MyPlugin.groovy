package com.gradle



import org.gradle.api.Plugin
import org.gradle.api.Project


public class MyPlugin implements Plugin<Project>{
	void apply(Project project){
				println "this is from the pllugin"
		
	}
}