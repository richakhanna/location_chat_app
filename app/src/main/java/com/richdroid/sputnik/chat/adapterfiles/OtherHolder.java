package com.richdroid.sputnik.chat.adapterfiles;

import android.text.format.DateUtils;
import android.util.TimeUtils;
import android.view.View;
import android.widget.TextView;
import com.richdroid.sputnik.R;
import com.richdroid.sputnik.chat.model.MessageList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by rishabhsingh.bisht on 22/10/16.
 */

public class OtherHolder extends HolderParent {
  private static ArrayList<Integer> colorList;
  private static Map<Long, Integer> colorMap;

  static {
    colorList = new ArrayList<>();
    colorList.add(R.drawable.bg_random_color1);
    colorList.add(R.drawable.bg_random_color2);
    colorList.add(R.drawable.bg_random_color3);
    colorList.add(R.drawable.bg_random_color4);
    colorList.add(R.drawable.bg_random_color5);
    colorList.add(R.drawable.bg_random_color6);
    colorList.add(R.drawable.bg_random_color7);
    colorList.add(R.drawable.bg_random_color8);
    colorList.add(R.drawable.bg_random_color9);
    colorList.add(R.drawable.bg_random_color10);
    colorMap = new HashMap<>();
  }

  private final TextView mText;
  private final View mBackground;
  private final TextView mName;
  private final TextView mTime;

  public OtherHolder(View itemView) {
    super(itemView);
    mText = (TextView) findViewById(R.id.text);
    mBackground = findViewById(R.id.background);
    mName = (TextView) findViewById(R.id.name);
    mTime = (TextView) findViewById(R.id.time);
  }

  @Override public void bindData(MessageList.Message message) {
    mText.setText(message.data);
    mName.setText(message.senderName);
    mTime.setText(DateUtils.getRelativeTimeSpanString(message.timestamp));
    if (colorMap.containsKey(message.senderId)) {
      mBackground.setBackgroundResource(colorMap.get(message.senderId));
    } else {
      int random = (int) (Math.random() * 10);
      Integer resource = colorList.get(random);
      colorMap.put(message.senderId, resource);
      mBackground.setBackgroundResource(resource);
    }
  }
}
