package com.capmus.retrofit.response;

public class PostResponse {
     private int id;
    private int userId;
    private String body;
    private String title;

    @Override
    public String toString() {
        return "PostResponse{" +
                "id=" + id +
                ", userId=" + userId +
                ", body='" + body + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
