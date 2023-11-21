package com.example.radare.models;

import com.example.radare.models.Message;
//visitor
public interface Visitor {
    void visitMessage(Message message);
}
