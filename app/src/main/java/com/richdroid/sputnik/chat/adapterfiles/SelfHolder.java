package com.richdroid.sputnik.chat.adapterfiles;

import android.view.View;
import android.widget.TextView;
import com.richdroid.sputnik.R;
import com.richdroid.sputnik.chat.model.MessageList;

/**
 * Created by rishabhsingh.bisht on 22/10/16.
 */

public class SelfHolder extends HolderParent {

  private final TextView mText;

  public SelfHolder(View itemView) {
    super(itemView);
    mText = (TextView) findViewById(R.id.text);
  }

  @Override public void bindData(MessageList.Message message) {
    mText.setText(message.data);
  }
}
