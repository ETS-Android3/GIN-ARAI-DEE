package com.gin_arai_dee;

public class Comment {
    private User user;
    private final String text;
    private final Integer wordCount;
    private Integer voteCount;
    private final Integer MAX_WORD_COUNT;

    public Comment() {
        this.text = "";
        this.wordCount = 0;
        this.voteCount = 0;
        this.MAX_WORD_COUNT = 100;
    }

    public Comment(User user, String text, Integer wordCount, Integer voteCount) {
        this.user = user;
        this.text = text;
        this.wordCount = wordCount;
        this.voteCount = voteCount;
        this.MAX_WORD_COUNT = 100;
    }

    public boolean isValid() { return wordCount <= MAX_WORD_COUNT; }

//    public void uploadComment() {
//
//    }

    public void upvote() { voteCount++; }

    public void downvote() { voteCount--; }

//    public void deleteComment {
//
//    }
}