package com.myapplicationdev.android.tw_listview;

public class Module {

    private String module;
    private String ivImage;

    public Module(String module, String ivImage) {
        this.module = module;
        this.ivImage = ivImage;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getIvImage() {
        return ivImage;
    }

    public void setIvImage(String ivImage) {
        this.ivImage = ivImage;
    }
}
