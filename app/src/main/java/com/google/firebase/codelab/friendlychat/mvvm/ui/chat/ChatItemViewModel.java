package com.google.firebase.codelab.friendlychat.mvvm.ui.chat;

import android.databinding.ObservableField;

import com.google.firebase.codelab.friendlychat.mvvm.model.FriendlyMessage;
import com.google.firebase.codelab.friendlychat.mvvm.ui.base.BaseViewModel;

public class ChatItemViewModel extends BaseViewModel {

    public ObservableField<String> avatar = new ObservableField<>();
    public ObservableField<String> name = new ObservableField<>();
    public ObservableField<String> text = new ObservableField<>();

    public ChatItemViewModel() {

    }

    public void bind(FriendlyMessage msg) {
        name.set(msg.getName());
        text.set(msg.getText());
        avatar.set(msg.getPhotoUrl());
    }
}
