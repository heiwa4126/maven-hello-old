package com.example.app;
// https://qiita.com/opengl-8080/items/b613b9b3bc5d796c840c

public class Hoge {
    public int id;
    public String name;

    public Hoge(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Hoge() {
        this.id = 0;
        this.name = "";
    }

    @Override
    public String toString() {
        return "Hoge [id=" + id + ", name=" + name + "]";
    }
}
