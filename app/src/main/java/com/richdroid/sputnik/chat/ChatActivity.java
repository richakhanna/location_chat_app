package com.richdroid.sputnik.chat;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.richdroid.sputnik.R;
import com.richdroid.sputnik.chat.adapterfiles.ChatAdapter;
import com.richdroid.sputnik.chat.adapterfiles.ItemDecor;
import com.richdroid.sputnik.chat.model.MessageList;
import java.util.ArrayList;
import java.util.Calendar;

import static android.support.v7.widget.LinearLayoutManager.VERTICAL;

public class ChatActivity extends AppCompatActivity {

  private ChatAdapter mChatAdapter;
  private RecyclerView mRecyclerView;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_chat);
    MessageList list = new MessageList();
    ArrayList<MessageList.Message> messageList = getMessages();
    list.messageList = messageList;
    mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
    mChatAdapter = new ChatAdapter();
    mRecyclerView.setAdapter(mChatAdapter);
    mRecyclerView.setLayoutManager(new LinearLayoutManager(this, VERTICAL, true));
    mRecyclerView.addItemDecoration(new ItemDecor(mRecyclerView, mChatAdapter));
    mChatAdapter.notifyDataSetChanged(list.messageList);
  }

  @NonNull private ArrayList<MessageList.Message> getMessages() {
    ArrayList<MessageList.Message> messageList;
    messageList = new ArrayList<>();
    MessageList.Message message =
        new MessageList.Message("Hi", 123, 1, "Richa", Calendar.getInstance().getTimeInMillis(),
            "text");
    messageList.add(0, message);
    message =
        new MessageList.Message("Hello", 123, 5, "Harsh", Calendar.getInstance().getTimeInMillis(),
            "text");
    messageList.add(0, message);
    message = new MessageList.Message("What up? Going to Hackathon tonight?", 123, 1, "Richa",
        Calendar.getInstance().getTimeInMillis(), "text");
    messageList.add(0, message);
    message =
        new MessageList.Message("No!", 123, 3, "Chetanya", Calendar.getInstance().getTimeInMillis(),
            "text");
    messageList.add(0, message);
    message =
        new MessageList.Message(":(", 123, 3, "Chetanya", Calendar.getInstance().getTimeInMillis(),
            "text");
    messageList.add(0, message);
    message = new MessageList.Message("Just kidding", 123, 5, "Harsh",
        Calendar.getInstance().getTimeInMillis(), "text");
    messageList.add(0, message);
    message =
        new MessageList.Message(":)", 123, 1, "Richa", Calendar.getInstance().getTimeInMillis(),
            "text");
    messageList.add(0, message);
    message =
        new MessageList.Message("Hello", 123, 5, "Harsh", Calendar.getInstance().getTimeInMillis(),
            "text");
    messageList.add(0, message);
    message = new MessageList.Message("What up? Going to Hackathon tonight?", 123, 1, "Richa",
        Calendar.getInstance().getTimeInMillis(), "text");
    messageList.add(0, message);
    message =
        new MessageList.Message("No!", 123, 5, "Harsh", Calendar.getInstance().getTimeInMillis(),
            "text");
    messageList.add(0, message);
    message =
        new MessageList.Message(":(", 123, 1, "Richa", Calendar.getInstance().getTimeInMillis(),
            "text");
    messageList.add(0, message);
    message = new MessageList.Message("Just kidding", 123, 5, "Harsh",
        Calendar.getInstance().getTimeInMillis(), "text");
    messageList.add(0, message);
    message =
        new MessageList.Message(":)", 123, 1, "Richa", Calendar.getInstance().getTimeInMillis(),
            "text");
    messageList.add(0, message);
    message =
        new MessageList.Message("Hello", 123, 5, "Harsh", Calendar.getInstance().getTimeInMillis(),
            "text");
    messageList.add(0, message);
    message = new MessageList.Message("What up? Going to Hackathon tonight?", 123, 1, "Richa",
        Calendar.getInstance().getTimeInMillis(), "text");
    messageList.add(0, message);
    message =
        new MessageList.Message("No!", 123, 5, "Harsh", Calendar.getInstance().getTimeInMillis(),
            "text");
    messageList.add(0, message);
    message =
        new MessageList.Message(":(", 123, 1, "Richa", Calendar.getInstance().getTimeInMillis(),
            "text");
    messageList.add(0, message);
    message = new MessageList.Message("Just kidding", 123, 5, "Harsh",
        Calendar.getInstance().getTimeInMillis(), "text");
    messageList.add(0, message);
    message =
        new MessageList.Message(":)", 123, 1, "Richa", Calendar.getInstance().getTimeInMillis(),
            "text");
    messageList.add(0, message);
    return messageList;
  }
}
