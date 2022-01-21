package com.panosen;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;

@Mojo(name = "sayhi")
public class SayHiMojo extends AbstractMojo {

    public void execute() throws MojoExecutionException {
        getLog().info("Hi, this is a sample maven-plugin from  com.panosen.");
    }
}
