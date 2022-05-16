package io.falcon.engage.app;

import io.falcon.engage.api.command.CreatePostConversationCommand;
import io.falcon.engage.api.utils.Utils;

public class EntryPoint {

    public static void main(String[] args) {
        final var command = new CreatePostConversationCommand();
        System.out.println(command);

        final var uuid = Utils.generateUuid();
        System.out.println(uuid);
    }
}
