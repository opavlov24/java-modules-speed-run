package io.falcon.engage.app;

import io.falcon.engage.api.request.CommentApi;

import java.util.ServiceLoader;

public class EntryPoint {

    public static void main(String[] args) {
        final var commentApi = ServiceLoader.load(CommentApi.class)
                .findFirst().orElse(null);
        System.out.println(commentApi);
    }
}
