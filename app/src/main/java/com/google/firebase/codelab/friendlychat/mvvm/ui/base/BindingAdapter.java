package com.google.firebase.codelab.friendlychat.mvvm.ui.base;

import android.support.v4.content.ContextCompat;

import com.bumptech.glide.Glide;
import com.google.firebase.codelab.friendlychat.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class BindingAdapter {

    @android.databinding.BindingAdapter("app:avatar")
    public static void setAvatar(CircleImageView view, String avatar) {
        if (avatar == null)
            view.setImageDrawable(ContextCompat
                    .getDrawable(view.getContext(),
                            R.drawable.ic_account_circle_black_48dp));
        else
            Glide.with(view.getContext()).load(avatar).into(view);
    }
}
