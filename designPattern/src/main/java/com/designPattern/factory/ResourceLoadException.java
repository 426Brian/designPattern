package com.designPattern.factory;

/**
 * Classname: ResourceLoadException
 * Pacage: com.designPattern.factory
 * Discription:
 *
 * @Author: Brian
 * @Create: 2024/06/28-19:08
 * Version: v1.0
 */
public class ResourceLoadException extends RuntimeException {

    public ResourceLoadException() {
        super("记载资源出现问题");
    }

    public ResourceLoadException(String message) {
        super(message);
    }
}
