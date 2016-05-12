package com.sokolov.words;

import com.sokolov.words.frames.appgui.AppGuiFrame;

public class AppGui {

    public static void main(String[] args) throws Exception {
        System.out.println("Working Directory = " + System.getProperty("user.dir"));
        new AppGuiFrame();
    }
}
