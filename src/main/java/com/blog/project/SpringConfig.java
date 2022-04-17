package com.blog.project;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.blog.project")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

}