package com.mvc;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

import java.io.File;

/**
 * 源码学院-Fox
 * 只为培养BAT程序员而生
 * http://bat.ke.qq.com
 * 往期视频加群:516212256 暗号:6
 */
public class Main {
	public static void main(String[] args) {
		try {
			SpringApplication.run();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
