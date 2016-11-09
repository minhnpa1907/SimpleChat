package com.google.firebase.codelab.friendlychat.mvvm.ui.chat;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.google.firebase.codelab.friendlychat.databinding.ItemMessageBinding;
import com.google.firebase.codelab.friendlychat.mvvm.model.FriendlyMessage;

public class ChatItemViewHolder extends RecyclerView.ViewHolder {

    private final ItemMessageBinding mBinding;
    private final ChatItemViewModel mViewModel;

    public ChatItemViewHolder(View v) {
        super(v);
        mViewModel = new ChatItemViewModel();
        mBinding = DataBindingUtil.bind(v);
        mBinding.setViewModel(mViewModel);
    }

    public void bind(FriendlyMessage msg) {
        mViewModel.bind(msg);
    }
}
