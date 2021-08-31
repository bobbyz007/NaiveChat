package org.itstack.naive.chat.client;

import javafx.application.Application;

/**
 * 解决jdk 11是运行报错问题：错误: 缺少 JavaFX 运行时组件, 需要使用该组件来运行此应用程序
 */
public class Main {
    public static void main(String[] args) {
        Application.launch(org.itstack.naive.chat.client.Application.class, args);
    }
}
