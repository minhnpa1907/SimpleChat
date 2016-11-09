package com.google.firebase.codelab.friendlychat.mvvm.ui.chat;

import android.databinding.Bindable;
import android.databinding.Observable;
import android.databinding.ObservableField;
import android.text.TextUtils;

import com.google.firebase.codelab.friendlychat.mvvm.model.FriendlyMessage;
import com.google.firebase.codelab.friendlychat.mvvm.ui.base.BaseViewModel;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Objects;

public class ChatViewModel extends BaseViewModel {
    public ObservableField<String> msg = new ObservableField<>();
    private String name;
    private String photoUrl;

    @Bindable
    public DatabaseReference mFirebaseDatabaseReference;
    public static final String MESSAGES_CHILD = "messages";

    public ChatViewModel(String name, String photoUrl) {
        this.name = name;
        this.photoUrl = photoUrl;
        this.mFirebaseDatabaseReference = FirebaseDatabase.getInstance().getReference();
    }

    public void addMsg(String text, String name, String photoUrl) {
        this.mFirebaseDatabaseReference.child(MESSAGES_CHILD).push().setValue(
                new FriendlyMessage(text, name, photoUrl));
    }

    public void onSendMessageClick() {
        String text = msg.get();
        if (!TextUtils.isEmpty(text)) {
            addMsg(text, name, photoUrl);
            msg.set("");
        }
    }
}
