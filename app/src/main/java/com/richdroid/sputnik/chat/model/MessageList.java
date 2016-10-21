package com.richdroid.sputnik.chat.model;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;

/**
 * Created by rishabhsingh.bisht on 22/10/16.
 */

public class MessageList {
  @SerializedName("list") public ArrayList<Message> messageList;

  public static class Message {
    public Message(String data, long groupId, long senderId, String senderNAme, long timestamp,
        String type) {
      this.data = data;
      this.groupId = groupId;
      this.senderId = senderId;
      this.senderName = senderNAme;
      this.timestamp = timestamp;
      this.type = type;
    }

    @SerializedName("s_id") public long senderId;
    @SerializedName("s_name") public String senderName;
    @SerializedName("data") public String data;
    @SerializedName("g_id") public long groupId;
    @SerializedName("type") public String type;
    @SerializedName("timestamp") public long timestamp;
  }
}
