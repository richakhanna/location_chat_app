package com.richdroid.sputnik.chat.adapterfiles;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.richdroid.sputnik.R;
import com.richdroid.sputnik.chat.model.MessageList;

/**
 * Created by rishabhsingh.bisht on 22/10/16.
 */

public class ItemDecor extends RecyclerView.ItemDecoration {

  private final RecyclerView mRecyclerView;
  private final ChatAdapter mAdapter;
  private final int m5dp;
  private final int m30dp;

  public ItemDecor(RecyclerView recyclerView, ChatAdapter adapter) {
    mRecyclerView = recyclerView;
    Context context = mRecyclerView.getContext();
    m5dp = context.getResources().getDimensionPixelSize(R.dimen.margin_5);
    m30dp = context.getResources().getDimensionPixelSize(R.dimen.margin_30);
    mAdapter = adapter;
  }

  @Override public void getItemOffsets(Rect outRect, View view, RecyclerView parent,
      RecyclerView.State state) {
    int position = mRecyclerView.getChildAdapterPosition(view);
    int childCount = mAdapter.getItemCount();
    MessageList.Message message = mAdapter.getItemAt(position);
    if (position > 0) {
      MessageList.Message nextMessage = mAdapter.getItemAt(position - 1);
      if (nextMessage.senderId != message.senderId) {
        outRect.set(0, 0, 0, m5dp);
      } else {
        outRect.set(0, 0, 0, 0);
      }
    } else {
      outRect.set(0, 0, 0, m30dp);
    }
  }
}
