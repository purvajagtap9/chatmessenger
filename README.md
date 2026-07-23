# Chat Messenger

## Overview

Chat Messenger is a Java-based client-server chat application that enables real-time communication using socket programming. It demonstrates networking concepts and object-oriented programming in Java.

## Technologies Used

- Java
- Socket Programming
- TCP/IP
- Multithreading
- OOP

## Features

- Client-server communication
- Real-time messaging
- Socket connection handling
- Simple and lightweight architecture
- Console-based interaction
- Log facility: every connection event and message is timestamped and written to a log file

## Logging

Both the server and client write a simple timestamped text log of their activity (connections, messages sent/received, and any errors) using the `Logger` class:

- The server writes to `chatserver.log`
- The client writes to `chatclient.log`

Each line follows the format:

```
[yyyy-MM-dd HH:mm:ss] <event description>
```

Log files are created automatically (in the directory the program is run from) and new entries are appended on each run.

## Project Structure

```

ChatMessenger/
├── ChatClient.java
├── ChatServer.java
└── Logger.java

```

## How to Run

### Prerequisites

- Java JDK 17 or later

### Steps

1. Clone the repository:

   ```bash
   git clone https://github.com/purvajagtap9/chatmessenger.git
   ```

2. Compile the files:

   ```bash
   javac \*.java
   ```

3. Start the server:

   ```bash
   java ChatServer
   ```

4. Run the client:

   ```bash
   java ChatClient
   ```

5. Start chatting between the server and client.

## Future Enhancements

- Graphical user interface
- Group chat support
- File sharing
- Message encryption
