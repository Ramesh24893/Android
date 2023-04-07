package com.example.recyclerview3

sealed class Message {
    class FromMessage(val message: String): Message()
    class ToMessage(val message: String): Message()
}