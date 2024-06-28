package com.designPattern.factory;

/**
 * Classname: ResourceLoad
 * Pacage: com.designPattern.factory
 * Discription:
 *
 * @Author: Brian
 * @Create: 2024/06/28-19:02
 * Version: v1.0
 */
public class ResourceLoad {
    /*
     * file://  http://  classpath://  ftp://
     */
    public Resource load(String url) {
        // 1. 前缀
        String prefix = getPrefix(url);
        Resource resource = null;

        // 2. 根据前缀处理不同资源
        if ("http".equals(prefix)) {
            resource = new Resource(url);
        } else if ("file".equals(prefix)) {

        }
        // todo

        return null;
    }

    private String getPrefix(String url) {
        if (url == null || "".equals(url) || !url.contains(":")) {
            throw new ResourceLoadException("资源 url 不合法");
        }
        String[] split = url.split(":");
        return split[0];
    }
}
