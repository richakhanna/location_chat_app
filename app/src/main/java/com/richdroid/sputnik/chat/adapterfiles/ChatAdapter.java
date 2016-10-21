package com.richdroid.sputnik.chat.adapterfiles;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.richdroid.sputnik.R;
import com.richdroid.sputnik.chat.model.MessageList;
import java.util.ArrayList;

/**
 * Created by rishabhsingh.bisht on 22/10/16.
 */

public class ChatAdapter extends RecyclerView.Adapter {

  public static final int SELF = 1;
  public static final int OTHER = 2;
  ArrayList<MessageList.Message> mMessageList;
  private int mLimit = 50;
  private LayoutInflater mInflator;

  public ChatAdapter() {
    mMessageList = new ArrayList<>();
  }

  @Override public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    if (mInflator == null) {
      mInflator = LayoutInflater.from(parent.getContext());
    }
    View view;
    switch (viewType) {
      case SELF:
        view = mInflator.inflate(R.layout.chat_box_self, parent, false);
        return new SelfHolder(view);
      default:
        view = mInflator.inflate(R.layout.chat_box_other, parent, false);
        return new OtherHolder(view);        // TODO: 22/10/16 change
    }
  }

  @Override public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
    ((HolderParent) holder).bindData(mMessageList.get(position));
  }

  @Override public int getItemCount() {
    if (!hasMoreData()) {
      return mMessageList.size();
    } else {
      return mLimit;
    }
  }

  public void viewMore() {
    mLimit += 50;
    notifyDataSetChanged();
  }

  public boolean hasMoreData() {
    return mMessageList.size() > mLimit;
  }

  @Override public int getItemViewType(int position) {
    MessageList.Message message = mMessageList.get(position);
    if (message.senderId == 5) {
      return SELF;
    } else {
      return OTHER;
    }
  }

  public void notifyDataSetChanged(ArrayList<MessageList.Message> messageList) {
    if (!mMessageList.containsAll(messageList)) {
      mMessageList.addAll(messageList);
    }
    notifyDataSetChanged();
  }

  public MessageList.Message getItemAt(int position) {
    return mMessageList.get(position);
  }
}
