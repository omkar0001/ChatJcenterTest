package com.example.omkar.chatjcentertest;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;

import com.idelivr.chat.model.ChatUISettings;
import com.idelivr.chat.utility.InstafrshChat;

public class ChatHelper {

    public static void invokeChat(Context context) {
        String title = "Instafrsh";
        Drawable background = null;

        int titleBackgroundColor;
        int titleTextColor;
        int incomingTextColor;
        Drawable incomingTextBackground = null;
        int outgoingTextColor;
        int sendButtonColor;
        Drawable outgoingTextBackground = null;
        Drawable chatBackground = null;

        int sdk = android.os.Build.VERSION.SDK_INT;

        Resources resources = context.getResources();


        titleBackgroundColor = Color.BLUE;
        titleTextColor = Color.WHITE;
        incomingTextColor = Color.GRAY;
        outgoingTextColor = Color.LTGRAY;
        sendButtonColor = Color.BLUE;

        ChatUISettings chatUISettings = new ChatUISettings(title, titleBackgroundColor,titleTextColor, incomingTextColor, outgoingTextColor, sendButtonColor, chatBackground, incomingTextBackground, outgoingTextBackground);

        InstafrshChat chat = InstafrshChat.getInstance(chatUISettings, "xxxxxxxxx");

        chat.show(context, "9958696744");

    }
}

