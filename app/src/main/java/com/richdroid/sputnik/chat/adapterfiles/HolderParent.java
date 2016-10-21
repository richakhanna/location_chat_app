package com.richdroid.sputnik.chat.adapterfiles;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.richdroid.sputnik.chat.model.MessageList;

/**
 * Created by rishabhsingh.bisht on 22/10/16.
 */

public abstract class HolderParent extends RecyclerView.ViewHolder {
  protected View mParent;

  public HolderParent(View itemView) {
    super(itemView);
    mParent = itemView;
  }

  protected View findViewById(int resorceId) {
    return mParent.findViewById(resorceId);
  }

  public abstract void bindData(MessageList.Message message);
}
